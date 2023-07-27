import java.util.Scanner;

public class IterationTest {
	public static void main(String[] args) {
	
		Demo demoRef = new Demo();
		demoRef.demo();

	}
}
interface Reward {
	void utilize();
}
class Cheque implements Reward {
	public void utilize() {
		System.out.println("Dropping the cheque in the bank...");
	}
}
class Cash implements Reward {
	public void utilize() {
		System.out.println("Putting the cash in the wallet...");
	}
}
class HolidayPackage implements Reward {
	public void utilize() {
		System.out.println("Enjyoing the holiday package....");
	}
}

class Demo
{
	void demo() {
		
		System.out.println("Which magician type you want ? ");
		Scanner scanner = new Scanner(System.in);
		
		String theHint = scanner.next();
		
		Magician magician = EventAgency.getMagician(theHint);
		SavingsAccount savObj = new SavingsAccount();
		Magic magic = magician.doTrick(savObj);
		magic.show();
		
	}
}

class EventAgency {
	public static Magician getMagician(String hint) {
		Magician magician = null;
		if(hint.equalsIgnoreCase("hats")) {
			magician = new HatMagician();
		}
		else if(hint.equalsIgnoreCase("cards")) {
			magician = new CardMagician();
		} 
		else if(hint.equalsIgnoreCase("fire")) {
			magician = new FireMagician();
		}
		return magician;
	}
}

interface Account {
	void withdraw(float  amt);
	void deposit(float amt);
}
class SavingsAccount implements Account {
	public void withdraw(float amt) {
		System.out.println("withdrawing..."+amt);
	}
	public void deposit(float amt) {
		System.out.println("depositing...."+amt);
	}
}

interface Magician
{
	Magic doTrick(Account acc);	
}

class CardMagician implements Magician
{
	public Magic doTrick(Account accRef) {
		System.out.println("Hiding some cards under the sleeves....");
		Magic magic = new CardMagic();
		accRef.deposit(5000);
		return magic;
	}
}

class HatMagician implements Magician
{
	public Magic doTrick(Account accRef) {
		System.out.println("Hiding the parrot under the Hat....");
		Magic magic = new HatMagic();
		accRef.deposit(6000);
		return magic;
	}
}

class FireMagician implements Magician
{
	public Magic doTrick(Account accRef) {
		System.out.println("Hiding some cards under the sleeves....");
		Magic magic = new FireMagic();
		accRef.deposit(5000);
		return magic;
	}
}

interface Magic
{
	void show();
}
class CardMagic implements Magic
{
	public void show() {
		System.out.println("Showing cards...in a magical way....");
	}
}

class FireMagic implements Magic
{
	public void show() {
		System.out.println("Showing cards...in a magical way....");
	}
}

class HatMagic implements Magic
{
	public void show() {
		System.out.println("Showing hats  and parrot...in a magical way....");
	}
}
