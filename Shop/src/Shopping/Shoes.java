package Shopping;


public class Shoes extends Footwear{
	private String type;							//sneakers,sports,formal
	private int size;
	private String brand;
	private int price;
	private String hasLaces;
	
	public Shoes(int shopNo, String name, String type, int size, String brand, int price) {
		super(shopNo, name);
		this.type = type;
		this.size = size;
		this.brand = brand;
		this.price = price;
	}

	public Shoes(int shopNo, String name, String type, int size, String brand, int price, String hasLaces,String thickness,String colourOfLaces) {
		super(shopNo, name);
		this.type = type;
		this.size = size;
		this.brand = brand;
		this.price = price;
		this.hasLaces = hasLaces;
		if(hasLaces=="Yes") {
			Laces laces=new Laces(thickness,colourOfLaces);
		}
	}

	public Shoes(int shopNo, String name, String type, int size, String brand, int price, String hasLaces) {
		super(shopNo, name);
		this.type = type;
		this.size = size;
		this.brand = brand;
		this.price = price;
		this.hasLaces = hasLaces;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getHasLaces() {
		return hasLaces;
	}

	public void setHasLaces(String hasLaces) {
		this.hasLaces = hasLaces;
	}
		
	public void welcome() {
		System.out.println("Welcome to the shoe section of "+this.name+" shop");
	}
}

class Laces{
	private String thickness;
	private String colour;
	
	public Laces(String thickness, String colour) {
		super();
		this.thickness = thickness;
		this.colour = colour;
	}
	
	public String getThickness() {
		return thickness;
	}
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}