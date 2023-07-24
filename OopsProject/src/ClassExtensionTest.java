
public class ClassExtensionTest {

	public static void main(String[] args) {
		
		/*Doctor x=new Doctor();
		x.diagnose();
		x.charge();
		x.prescribe();
		//x.cut();
		//x.stitch();
		*/
		
		/*Surgeon x=new Surgeon();
		x.diagnose();
		x.charge();
		x.prescribe();
		x.cut();
		x.stitch();
		*/
		
		/*HeartSurgeon x=new HeartSurgeon();
		x.diagnose();
		x.charge();
		x.prescribe();
		x.cut();
		x.stitch();
		*/		
		
		/*Doctor x=new Surgeon();
		x.diagnose();
		x.charge();
		x.prescribe();
		//x.cut();
		//x.stitch();
		*/
		
		Doctor x=new HeartSurgeon();
		x.diagnose();
		x.charge();
		x.prescribe();
		//x.cut();
		//x.stitch();
	
		
		/*Surgeon x=new HeartSurgeon();
		x.diagnose();
		x.charge();
		x.prescribe();
		x.cut();
		x.stitch();
		*/
		
		/* if (x instanceof Doctor) {
			System.out.println("It's a doctor");
		}
		else {
			System.out.println("It's not a doctor");
		}
		System.out.println("----------");
		
		if (x instanceof Surgeon) {
			System.out.println("It's a surgeon");
		}
		else {
			System.out.println("It's not a surgeon");
		}
		System.out.println("----------");
		
		if (x instanceof HeartSurgeon) {
			System.out.println("It's a HeartSurgeon");
		}
		else {
			System.out.println("It's not a HeartSurgeon");
		}
		System.out.println("----------");
	
	*/
	}
}

class Doctor{
	void diagnose() {
		System.out.println("ENT");
	}
	
	void prescribe() {
		System.out.println("RGB pills");
	}
	
	void charge() {
		System.out.println("Charges 300/-");
	}
	
}

class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("CT Scan/MRI Reports");
	}
	
	void prescribe() {
		System.out.println("Expensive pills");
	}
	
	void charge() {
		System.out.println("Charges 1000/-");
	}
	
	void cut() {
		System.out.println("Surgeon cuts");
	}
	
	void stitch() {
		System.out.println("Surgeon stitches");
	}
}

class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("ECG Reports");
	}
	
	void prescribe() {
		System.out.println("Expensive pills plus yoga and exercise");
	}
	
	void charge() {
		System.out.println("Charges 3000/-");
	}
}