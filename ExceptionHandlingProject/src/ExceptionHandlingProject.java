
public class ExceptionHandlingProject {
	public static void main(String[] args) {
		System.out.println("Line1");
		System.out.println("Line2");
		if(50>55)
			throw new RuntimeException("Some problem 1...");
		
		System.out.println("Line3");
		System.out.println("Line4");
		if(50>5)
			throw new RuntimeException("Some problem 2...");
		
		System.out.println("Line5");
		System.out.println("Line6");
		System.out.println("Line7");
		if(50>5)
			throw new RuntimeException("Some problem 3...");
		
		System.out.println("Line8");
		System.out.println("Line9");
		System.out.println("Line10");
	}
}
