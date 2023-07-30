
public class Validator {
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