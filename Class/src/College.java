
public class College extends Director {
	private String principal;
	private int noOfStudents;
	private String name;
	private String city;
	private int placementPercent;
	private int noOfDepartments;
	
	public College(String owner,String principal, int noOfStudents, String name, String city, int placementPercent, int noOfDepartments) {
		super(owner);
		this.principal = principal;
		this.noOfStudents = noOfStudents;
		this.name = name;
		this.city = city;
		this.placementPercent = placementPercent;
		this.noOfDepartments= noOfDepartments;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("College name is : "+name);
		System.out.println("It is located in : "+city);
		System.out.println("The principal of ths college is : "+principal);
		System.out.println(noOfStudents+" students have took admission in this college");
		System.out.println("There are "+noOfDepartments+" in this college");
		System.out.println("This college has "+placementPercent+" % placements last year");
	}
	
	public int newAdmission(int newEntries) {
		noOfStudents+=newEntries;
		return noOfStudents;
	}
	
	public void addDepartment(String departmentName) {
		this.noOfDepartments++;
		Department newDepartment=new Department(this.owner, this.principal, this.noOfStudents, this.name, this.city, this.placementPercent, this.noOfDepartments, departmentName);
		newDepartment.getInfo();
	}
	
	public void addDepartment(String departmentName, String hODName) {
		this.noOfDepartments++;
		Department newDepartment=new Department(this.owner, this.principal, this.noOfStudents, this.name, this.city, this.placementPercent, this.noOfDepartments, departmentName, hODName);
		newDepartment.getInfo();
	}
		
}
