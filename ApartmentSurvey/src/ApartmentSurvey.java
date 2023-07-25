
public class ApartmentSurvey {

	public static void main(String[] args) {
		House.setApartmentName("Raj Residency");
		House h1=new House(101,6,"Patil");
		House h2=new House(102,4,"Kulkarni");
		House h3=new House(201,3,"Gupta");
		
		h1.showDetails();
		h2.showDetails();		
		h3.showDetails();
	}

}

class House{
	private static String apartmentName;
	private final int flatNo;
	private int noOfPeople;
	private String owner;

	public static String getApartmentName() {
		return apartmentName;
	}

	public static final void setApartmentName(String apartmentName) {
		House.apartmentName = apartmentName;
	}

	public House(int flatNo, int noOfPeople, String owner) {
		super();
		this.flatNo = flatNo;
		this.noOfPeople = noOfPeople;
		this.owner = owner;
	}
	
	public static void welcome() {
		System.out.println("---------Welcome to "+apartmentName+"---------");
	}
	
	public void showDetails() {
		welcome();
		System.out.println("Apartment name : "+apartmentName);
		System.out.println("Owner name : "+owner);
		System.out.println("Flat number : "+flatNo);
		System.out.println("People in this flat : "+noOfPeople);
	}
	
}