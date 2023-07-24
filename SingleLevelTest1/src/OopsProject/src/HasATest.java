
public class HasATest {
	public static void main(String[] args) {
		Human theHuman=new Human();
		theHuman.breathing();
		theHuman.thinking();
		theHuman.drinkLemonJuice();
		theHuman.doPranayama();
	}
}

class Heart{
	void pumping() {
		System.out.println("Heart is pumping...");
	}
}

class Brain{
	void analyzing() {
		System.out.println("Brain is analyzing...");
	}
}

class Kidney{
	void filterBlood() {
		System.out.println("Filtering the blood...");
	}
}

class Lungs{
	void oxygenateBlood() {
		System.out.println("Oxygenating blood...");
	}
}

class Mammal{
	
}

class Human extends Mammal{
	private Heart myHeart=new Heart();
	private Brain myBrain=new Brain();
	private Kidney leftKidney =new Kidney();
	private Kidney rightKidney =new Kidney();
	private Lungs rightLung=new Lungs();
	private Lungs leftLung=new Lungs();
	void breathing() {
		System.out.println("Human is breathing...");
		myHeart.pumping();
	}
	
	void thinking() {
		System.out.println("Human is thinking...");
		myBrain.analyzing
		();
	}
	
	void drinkLemonJuice() {
		System.out.println("drinking lemon juice...");
		leftKidney.filterBlood();
		rightKidney.filterBlood();
	}
	
	void doPranayama() {
		System.out.println("Doing Pranayama...");
		rightLung.oxygenateBlood();
		leftLung.oxygenateBlood();
	}
}