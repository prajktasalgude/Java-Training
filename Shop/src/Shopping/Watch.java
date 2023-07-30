package Shopping;

public class Watch implements Shop{
	
	private String type;					//smart,solar,analogue
	private String usedBy;					//ladies,gents
	private int price;

	public Watch(String type, String usedBy, int price) {
		super();
		this.type = type;
		this.usedBy = usedBy;
		this.price = price;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
