
public class SingleLevelTest1 {

	public static void main(String[] args) {
		Person person1=new Person('f',"Seema",25);
		person1.show();
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		Person person2=new Person(24);
		Person person3=new Person('f');
		Person person4=new Person("Raju");
		
		
		Student student=new Student('M',"Ram",25,354,"GE CA","CSE",888);
		student.show();
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		Employee employee=new Employee('M',"Seeta",23,234,"Walchand Solapur","Mech Engg",998,2345,"Dassault Systems","Software developer",75000);
		employee.show();
	}

}
class Person{
	private char gender;
	private String name;
	private int age;

	Person(int age){
		this('M',"NONAME",age);
	}
	
	Person(char gender){
		this(gender,"NONAME",25);
	}
	
	Person(String name){
		this('F',name,25);
	}
	
	Person(char gender,String name){
		this(gender,name,25);
	}

	Person(String name,int age){
		this('F',name,age);
	}
	
	Person(char gender,int age){
		this(gender,"NONAME",age);
	}
	
	public Person(char gender, String name, int age) {
		if(gender=='M'||gender=='F'||gender=='T'||gender=='m'||gender=='f'||gender=='t'){
			this.gender = gender;
		}
		else {
			//throw new RuntimeException("Invalid gender....");
			RuntimeException runtimeGenderEx=new RuntimeException("Invalid gender...."+gender);
			throw runtimeGenderEx;
		}
		if(Validator.checkStringWithoutSpace(name)) {
			this.name = name;
		}
		else {
			//throw new RuntimeException("Invalid name....");
			RuntimeException runtimeNameEx=new RuntimeException("Invalid name...."+name);
			throw runtimeNameEx;
		}
		if(Validator.checkNumber(age,1,120)) {
			this.age = age;
		}
		else {
			//throw new RuntimeException("Invalid age....");
			RuntimeException runtimeAgeEx=new RuntimeException("Invalid age...."+age);
			throw runtimeAgeEx;
		}
		
	}
	
	public void show() {
		System.out.println("--------PERSONAL----------");
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
	}
	
}

class Student extends Person{
	private int rollNo;
	private String collegeName;
	private String stream;
	float marks;
	
	public Student(char gender, String name, int age, int rollNo,String collegeName, String stream, float marks) {
		super(gender,name,age);
		if(Validator.checkNumber(rollNo,1,500)) {
			this.rollNo = rollNo;
		}
		else {
			RuntimeException runtimeRollNoEx=new RuntimeException("Invalid roll number...."+rollNo);
			throw runtimeRollNoEx;
		}
		
		if(Validator.checkStringWithSpace(collegeName)) {
			this.collegeName = collegeName;
		}
		else {
			RuntimeException runtimeCollegeNameEx=new RuntimeException("Invalid college name...."+collegeName);
			throw runtimeCollegeNameEx;
		}
		
		if(Validator.checkStringWithSpace(stream)) {
			this.stream = stream;
		}
		else {
			RuntimeException runtimeStreamEx=new RuntimeException("Invalid stream...."+stream);
			throw runtimeStreamEx;
		}
		if(Validator.checkNumber(marks,0,1000)) {
			this.marks = marks;
		}
		else {
			RuntimeException runtimeMarksEx=new RuntimeException("Invalid marks...."+marks);
			throw runtimeMarksEx;
		}
	}
	
	public void show() {
		super.show();
		System.out.println("--------EDUCATIONAL----------");
		System.out.println("Roll no. : "+rollNo);
		System.out.println("College name : "+collegeName);
		System.out.println("stream : "+stream);
		System.out.println("Marks : "+marks);
	}
	
}

class Employee extends Student{
	private int empNo;
	private String companyName;
	private String designation;
	private int salary;
	
	public Employee(char gender, String name, int age, int rollNo,String collegeName, String stream, float marks, int empNo, String companyName, String designation, int salary) {
		super(gender,name,age,rollNo,collegeName,stream,marks);
		if(Validator.checkNumber(empNo, 0,5000)) {
			this.empNo = empNo;
		}
		else {
			RuntimeException runtimeEmpNoEx=new RuntimeException("Invalid employment number...."+empNo);
			throw runtimeEmpNoEx;
		}
		if(Validator.checkStringWithSpace(companyName)) {
			this.companyName = companyName;
		}
		else {
			RuntimeException runtimeCompanyNameEx=new RuntimeException("Invalid company name...."+companyName);
			throw runtimeCompanyNameEx;
		}
		if(Validator.checkStringWithSpace(designation)) {
			this.designation = designation;
		}
		else {
			RuntimeException runtimeDesignationEx=new RuntimeException("Invalid designation...."+designation);
			throw runtimeDesignationEx;
		}
		if(Validator.checkNumber(salary, 0,500000)) {
			this.salary = salary;
		}
		else {
			RuntimeException runtimeSalaryEx=new RuntimeException("Invalid salary...."+salary);
			throw runtimeSalaryEx;
		}
		
	}
	
	public void show() {
		super.show();
		System.out.println("--------EMPLOYMENT----------");
		System.out.println("Employee no. : "+empNo);
		System.out.println("Company name : "+companyName);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	
}