package Shopping;

public class Sandle extends Footwear{
	private String heelsType;                             //high,pencil,box,medium,flat							
	private int size;
	private String brand;
	private int price;

	public Sandle(int shopNo, String name, String heelsType, int size, String brand, int price) {
		super(shopNo, name);
		this.heelsType = heelsType;
		this.size = size;
		this.brand = brand;
		this.price = price;
	}

	public String getHeelsType() {
		return heelsType;
	}

	public void setHeelsType(String heelsType) {
		this.heelsType = heelsType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void welcome() {
		System.out.println("Welcome to the sandle section of "+this.name+" shop");
	}

	@Override
	public String toString() {
		return "Sandle [heelsType=" + heelsType + ", size=" + size + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
