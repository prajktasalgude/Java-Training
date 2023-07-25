
public class FinalFieldTest {

	public static void main(String[] args) {
		final float PI=3.14f;
		System.out.println("PI : "+PI);
		
		//PI=3.9f;
		//System.out.println("PI : "+PI);
		
		Circle circle1=new Circle(5.8f);
		Circle circle2=new Circle(6f);
		Circle circle3=new Circle(5.1f);
		Circle circle4=new Circle(7.8f);
		Circle circle5=new Circle(3.8f);
		
		circle1.calArea();
		circle2.calArea();
		circle3.calArea();
		circle4.calArea();
		circle5.calArea();
		
		Car c1=new Car("White","MH-13 CV4188");
		Car c2=new Car("Red","MH-13 C7188");
		Car c3=new Car("Black","MH-13 NN56898");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}

class Car{
	private String colour;
	private final String noPlate;
	public Car(String colour, String noPlate) {
		super();
		this.colour = colour;
		this.noPlate = noPlate;
	}
	
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", NoPlate=" + noPlate + "]";
	}
	
}

class Circle{
	private float radius;
	private static final float PI=3.14f;
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
	
	void calArea() {
		float area=PI*radius*radius;
		System.out.println("Area is : "+area);
	}
}