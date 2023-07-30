import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import Shopping.Sandle;
import Shopping.Shoes;
import Shopping.Shop;
import Shopping.Watch;

public class Testing {

	public static void main(String[] args) {		
		ArrayList customerList = new ArrayList();
		
		Shop shoe=new Shoes(203, "Goyal Footwear", "Sports Shoes", 7, "Sparx", 1500,"Yes","Broad","Black");
		Shop sandle=new Sandle(203, "Goyal Footwear", "High heels", 6, "Bata",400);
		Shop watch=new Watch("Bharat Watch","Smart watch", "Ladies", 3000);
		shoe.welcome();
		sandle.welcome();
		watch.welcome();
		
		Customer customer1=new Customer('F', "Seeta","card",shoe);
		Customer customer2=new Customer('m', "Ganesh","online",watch);
		Customer customer3=new Customer('F', "Rita","cash",sandle);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		Iterator logIterator = customerList.iterator();
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("customer.txt", false); //true means append to the file

			//System.out.println("File is ready to write...");
			String str="";
			while(logIterator.hasNext()) {
				Customer x = (Customer) logIterator.next(); //cast it to Log, as it was added as an Object
				str=x.toString()+"\n";
				byte array[] = str.getBytes(); //converts the string into a byte array
				fileOutputStream.write(array);
			}
			
			//System.out.println("String is written to the file");

			fileOutputStream.close();
			//System.out.println("File is closed now...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
		customer1.start();
		customer2.start();
		customer3.start();	
	}

}

class Buy{
	private String customerName;							
	private int price;
	private String type;									//ladies,gents
	private String product;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
		
	}

	@Override
	public String toString() {
		return "Buy [customerName=" + customerName + ", price=" + price + ", type=" + type + ", product=" + product
				+ "]";
	}
	
}

class Customer extends Thread{
	private char gender;
	private String name;
	private String paymentType;						//cash,online,card
	Shop shop;
	public Customer(char gender, String name, String paymentType,Shop shop) {
		super();
		if(gender=='M'||gender=='F'||gender=='m'||gender=='f'){
			this.gender = gender;
		}
		else {
			//throw new RuntimeException("Invalid gender....");
			RuntimeException runtimeGenderEx=new RuntimeException("Invalid gender...."+gender);
			throw runtimeGenderEx;
		}
		if(Validator.checkStringWithoutSpace(name)) {
			this.name = name;
		}
		else {
			//throw new RuntimeException("Invalid name....");
			RuntimeException runtimeNameEx=new RuntimeException("Invalid name...."+name);
			throw runtimeNameEx;
		}
		this.paymentType = paymentType;
		this.shop=shop;
		
	}
	
	public void run() {
		Buy buy=this.selects(shop);
		System.out.println(buy);
	}

	Buy selects(Shop shop) {
		for(int i=0;i<20;i++) {
			System.out.println(name+" is shopping...");
		}
		Buy buy=new Buy();
		if(this.gender=='F'||this.gender=='f') {
			buy.setType("Ladies");
		}
		else if(this.gender=='M'||this.gender=='m') {
			buy.setType("Gents");
		}
		buy.setCustomerName(this.name);
		buy.setProduct(shop.getClass().getSimpleName());
		buy.setPrice(shop.getPrice());
		
		try {
			//1. Load the Driver
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			
			//2. Acquire the connection
			Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//3. make a desired statement (insert/update/delete/select)
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO SALESINFO VALUES (?,?,?,?)");
			
			pst.setString(1, buy.getCustomerName());
			if(this.gender=='F'||this.gender=='f') {
				pst.setString(2, "Female");
			}
			else if(this.gender=='M'||this.gender=='m') {
				pst.setString(2, "Male");
			}
			pst.setString(3, buy.getProduct());
			pst.setInt(4,buy.getPrice());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			
			//6. close the statement, and connection
			
			pst.close();
			conn.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return buy;
	}

	@Override
	public String toString() {
		return "Customer [gender=" + gender + ", name=" + name + ", paymentType=" + paymentType + ", shop=" + shop
				+ "]";
	}
	
}

