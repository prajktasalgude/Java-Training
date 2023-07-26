
public class CustomeException {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(LowFuelException ex1) {
			System.out.println("Key Issue : "+ex1);
		} catch (ACNotWorkingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

class LowFuelException extends Exception
{
	LowFuelException(String msg) {
		super(msg);
	}
}

class ACNotWorkingException extends Exception
{
	ACNotWorkingException(String msg) {
		super(msg);
	}
}

class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class TyrePuncturedException extends RuntimeException
{
	TyrePuncturedException(String msg) {
		super(msg);
	}
}

class SpeedLimitExceedException extends RuntimeException
{
	SpeedLimitExceedException(String msg) {
		super(msg);
	}
}

class Car
{
	boolean keyFound=false;
	boolean isFuelSufficient=false;
	boolean ACWorking=false;
	
	Car() throws CarKeyNotFoundException,LowFuelException,ACNotWorkingException
	{
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
		}
		
		double value2 = Math.random()%10;
		
		if(value2>=0.80) {
			isFuelSufficient=true;
		}
		if(isFuelSufficient==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new LowFuelException("Hey...there is no sufficient fuel in the car...");
			
		}
		
double value3 = Math.random()%10;
		
		if(value3>=0.80) {
			ACWorking=true;
		}
		if(ACWorking==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new ACNotWorkingException("Hey...AC is not working...");
			
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			
			if(value>0.95) {
				TyrePuncturedException ex1 = new TyrePuncturedException("Oh No!!! Tyre is punctured....");
				throw ex1;
			}
			
			if(value>0.95) {
				SpeedLimitExceedException ex1 = new SpeedLimitExceedException("Oh No!!! Tyre is punctured....");
				throw ex1;
			}
		}
	}
}