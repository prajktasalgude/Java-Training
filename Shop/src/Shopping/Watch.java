package Shopping;

public class Watch implements Shop{
	private String name;
	private String type;					//smart,solar,analogue
	private String usedBy;					//ladies,gents
	private int price;

	public Watch(String name,String type, String usedBy, int price) {
		super();
		this.name=name;
		this.type = type;
		this.usedBy = usedBy;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsedBy() {
		return usedBy;
	}
	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void welcome() {

		System.out.println("Welcome to the watch section of "+this.name+" shop");
		
	}

	@Override
	public int getPrice() {
		return price;
	}

}
