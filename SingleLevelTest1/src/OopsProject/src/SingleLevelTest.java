public class SingleLevelTest {
	public static void main(String[] args) {
	
		Point2D p2d = new Point2D(100,200);
		p2d.showPoint();
		
		System.out.println("-----------");
		
		Point3D p3d = new Point3D(500,600,700);
		p3d.showPoint();
	
		System.out.println("-----------");

		ColouredPoint3D cp3d = new ColouredPoint3D(45,89,67,"Red");
		cp3d.showPoint();
		
		System.out.println("-----------");
		
		Coloured2D c2d = new Coloured2D(45,89,"Red");
		c2d.showPoint();
	}
}

class Point2D
{
	private int x;
	private int y;
	
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}

class Coloured2D extends Point2D{
	String colour;
	Coloured2D(int x,int y,String colour){
		super(x, y);
		this.colour=colour;
	}
	
	void showPoint() {
		super.showPoint(); 
		System.out.println("col: "+colour);

}
}

class Point3D extends Point2D
{
	private int z; 
	
	Point3D(int x, int y,   int z) {
		super(x,y); 
		this.z = z;
		}

	void showPoint() {
		super.showPoint();
		System.out.println("z : "+z);
	}
}

class ColouredPoint3D extends Point3D
{
	private String color;
	
	ColouredPoint3D(int x, int y,   int z, String color) {
		super(x,y,z); 
		this.color = color;
	}

	void showPoint() {
		super.showPoint(); 
		System.out.println("col: "+color);

	}
}
