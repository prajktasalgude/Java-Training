
public class OutfitTest {

	public static void main(String[] args) {
		UpperOutfit upper=new UpperOutfit(800,"Pink","Kurti","M");
		LowerOutfit lower=new LowerOutfit(1200,"Black","Jeans","M");
		Footwear footwear=new Footwear(650,"Black","Sandle",7);
		OutfitMatch newOutfit=new OutfitMatch();
		Outfit outfit=newOutfit.checkMatch(upper,lower,footwear);
		System.out.println(outfit.toString());
		
	}

}

class OutfitMatch{
	
	Outfit checkMatch(UpperOutfit upper,LowerOutfit lower,Footwear footwear) {
		Outfit outfit=new Outfit();
		outfit.setTotalCost(upper.getCost()+lower.getCost()+footwear.getCost());
		outfit.setType(upper.getType()+" & "+lower.getType());
		if(upper.getColour()==footwear.getColour() || lower.getColour()==footwear.getColour())
		{
			outfit.setMatch(true);
		}
		else {
			outfit.setMatch(false);
		}
		return outfit;
	}
	
}

class Outfit{
	private int totalCost;
	private boolean isMatch;
	private String type;
	
	public Outfit() {
		
	}
	
	public Outfit(int totalCost, boolean isMatch, String type) {
		super();
		this.totalCost = totalCost;
		this.isMatch = isMatch;
		this.type = type;
	}
	
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public boolean isMatch() {
		return isMatch;
	}
	public void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Outfit [totalCost=" + totalCost + ", isMatch=" + isMatch + ", type=" + type + "]";
	}
	
	
	
}

class UpperOutfit{
	private int cost;
	private String colour;
	private String type; //shirt,t-shirt,kurta
	private String size;
	public UpperOutfit(int cost, String colour, String type, String size) {
		super();
		this.cost = cost;
		this.colour = colour;
		this.type = type;
		this.size = size;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}

class LowerOutfit{
	private int cost;
	private String colour;
	private String type; //pant,plazo,leggings,jeans
	private String size;
	public LowerOutfit(int cost, String colour, String type, String size) {
		super();
		this.cost = cost;
		this.colour = colour;
		this.type = type;
		this.size = size;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}

class Footwear{
	private int cost;
	private String colour;
	private String type; //shoes,sandle,slipper
	private int size;
	public Footwear(int cost, String colour, String type, int size) {
		super();
		this.cost = cost;
		this.colour = colour;
		this.type = type;
		this.size = size;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
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
	
}









