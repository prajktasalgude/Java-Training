import Shopping.Shoes;
import Shopping.Shop;
import Shopping.Sandle;
public class Testing {

	public static void main(String[] args) {
		Shop shoe=new Shoes(203, "Goyal Footwear", "Sports Shoes", 7, "Sparx", 1500,"yes","Broad","Black");
		Shop sandle=new Sandle(203, "Goyal Footwear", "Sports Shoes", 7, "Sparx",400);
		Customer customer1=new Customer('F', "Seeta","card",shoe);
		Customer customer2=new Customer('m', "Ganesh","online",shoe);
		Customer customer3=new Customer('F', "Rita","cash",sandle);
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
		return buy;
	}
	
}

