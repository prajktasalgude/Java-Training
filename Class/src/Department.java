
public class Department extends College{
	private String hODName;
	private String departmentName;
	
	public Department(String owner,String principal, int noOfStudents, String name, String city, int placementPercent, int noOfDepartments, String departmentName) {
		super(owner, principal, noOfStudents, name, city, placementPercent, noOfDepartments);
		this.departmentName=departmentName;
		this.hODName="Not decided yet!!";
	}
	
	public Department(String owner,String principal, int noOfStudents, String name, String city, int placementPercent, int noOfDepartments,String hODName, String departmentName) {
		super(owner, principal, noOfStudents, name, city, placementPercent, noOfDepartments);
		this.hODName = hODName;
		this.departmentName = departmentName;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("Department name is : "+departmentName);
		System.out.println("Name of HOD is : "+hODName+"\n");
	}
	
	public int newAdmission(int newEntries) {
		return super.newAdmission(newEntries);
	}	
	
	public void changeHOD(String hODName) {
		this.hODName=hODName;
	}
}
