package Shopping;

public interface Shop{
	static String city="Pune";
	void welcome();
	int getPrice();
}

abstract class Footwear implements Shop{
	final int shopNo;
	String name;
	
	public Footwear(int shopNo, String name) {
		super();
		this.shopNo = shopNo;
		if(Validator.checkStringWithSpace(name)) {
			this.name = name;
		}
		else {
			//throw new RuntimeException("Invalid name....");
			RuntimeException runtimeNameEx=new RuntimeException("Invalid name...."+name);
			throw runtimeNameEx;
		}
	}
	
}

class Validator {
	static boolean checkNumber(int num,int minValue,int maxValue) {
		return num>=minValue && num<=maxValue?true:false;
	}
	
	static boolean checkNumber(float num,float minValue,float maxValue) {
		return num>=minValue && num<=maxValue?true:false;
	}
	
	static boolean checkStringWithSpace(String string) {
		return string.matches("^[a-zA-Z,' ']*$")?true:false;
	}
	
	static boolean checkStringWithoutSpace(String string) {
		return string.matches("^[a-zA-Z]*$")?true:false;
	}
}