
public abstract class Director {
	protected String owner;

	public Director(String owner) {
		this.owner = owner;
	}
	
	public void getInfo() {
		System.out.println("\nName of director is : "+owner);
	}
	
}
