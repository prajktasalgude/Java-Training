

public class Overloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		a.add(5,9);
		a.add(5,7.9f);
		a.add(4.5f,8);
		a.add(4.0f,8.3f);
		a.add(4,9,67);
	}

}

class Addition{
	void add() {
		System.out.println("Can add numbers");
	}
	
	void add(int a, int b ) {
		System.out.println("int,int: "+(a+b));
	}
	
	void add(int a,float b) {
		System.out.println("int,float: "+(a+b));
	}
	
	void add(float a,int b) {
		System.out.println("float,int: "+(a+b));
	}
	
	void add(float a,float b) {
		System.out.println("float,float: "+(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("int,int,int: "+(a+b+c));
	}
	
}