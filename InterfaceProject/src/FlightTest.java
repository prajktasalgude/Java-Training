
public class FlightTest {
	public static void main(String[] args) {
		CommercialFlight commercialFlight=new CommercialFlight();
		commercialFlight.checkIdentity();
		commercialFlight.checkTicket();
		commercialFlight.fly();
		commercialFlight.land();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		FighterFlight fighterFlight =new FighterFlight();
		fighterFlight.armMissiles();
		fighterFlight.fly();
		fighterFlight.fireMissile();
		fighterFlight.land();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		CargoFlight cargoFlight =new CargoFlight();
		cargoFlight.loading();
		cargoFlight.fly();
		cargoFlight.carryGoods();
		cargoFlight.land();
	}
}


interface Flying{
	void fly();
}

interface Landing {
	void land();
}

interface Ticketing{
	void checkTicket();
}

interface Fighting{
	void fireMissile();
}

interface Carrying{
	void carryGoods();
}

abstract class Flight implements Flying, Landing{
	
}

class CommercialFlight extends Flight implements Ticketing{

	@Override
	public void fly() {
		System.out.println("Commercial flight is flying");	
	}

	@Override
	public void land() {
		System.out.println("Commercial flight is landing");		
	}

	@Override
	public void checkTicket() {
		System.out.println("Commercial flight is checking ticket");	
	}
	
	public void checkIdentity() {
		System.out.println("Commercial flight is checking identity");
	}
	
}

class FighterFlight extends Flight implements Fighting{

	@Override
	public void fly() {
		System.out.println("fighter flight is flying");	
	}

	@Override
	public void land() {
		System.out.println("Fighter flight is landing");
	}

	@Override
	public void fireMissile() {
		System.out.println("Fighter flight is firing missile");
	}
	
	public void armMissiles() {
		System.out.println("Fighter flight is arming the missiles");
	}
	
}


class CargoFlight extends Flight implements Carrying{

	@Override
	public void fly() {
		System.out.println("Cargo flight is flying");	
	}

	@Override
	public void land() {
		System.out.println("Cargo flight is landing");
	}

	@Override
	public void carryGoods() {
		System.out.println("Cargo flight is carrying goods");
		
	}
	
	public void loading() {
		System.out.println("Cargo flight is loading goods");
	}
	
}



