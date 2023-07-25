
public class KiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kite.showKiteCount();
		
		Kite kite1=new Kite("Param","Red",60);
		kite1.showKiteCount();
		kite1.showKite();
		
		Kite kite2=new Kite("Priti","Pink",50);
		kite2.showKiteCount();
		kite2.showKite();
		
		Kite kite3=new Kite("Pooja","Blue",60);
		kite3.showKiteCount();
		kite3.showKite();
		
		Kite kite4=new Kite("Rutuja","Yello",40);
		kite4.showKiteCount();
		kite4.showKite();
		
		Kite kite5=new Kite("Geet","Red",55);
		kite5.showKiteCount();
		kite5.showKite();
		
		Kite.showKiteCount();
		
	}

}

class Kite{
	private String owner;
	private String colour;
	private int length;
	
	private static int kiteCount;
	
	public Kite(String owner, String colour, int length) {
		super();
		this.owner = owner;
		this.colour = colour;
		this.length = length;
		kiteCount++;
	}
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);
	}
	
	public void showKite() {
		System.out.println("Owner : "+this.owner);
		System.out.println("Colour : "+this.colour);
		System.out.println("Height : "+this.length);
		showKiteCount();
	}
	
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", colour=" + colour + ", length=" + length + "]";
	}
	
	
}
