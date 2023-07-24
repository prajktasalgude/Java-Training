
public class SingleLevelTest1 {

	public static void main(String[] args) {
		Person person1=new Person('f',"Seema",25);
		person1.show();
		System.out.println("----------");
		Person person2=new Person(24);
		Person person3=new Person('f');
		Person person4=new Person("R@m");
		Student student=new Student();
		System.out.println("----------");
		Employee employee=new Employee();
	}

}
class Person{
	private char gender;
	private String name;
	private int age;
	
	Person(){
		System.out.println("Person() constructor...");
	}
	
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
		this();
		if(gender=='M'||gender=='F'||gender=='T'||gender=='m'||gender=='f'||gender=='t'){
			this.gender = gender;
		}
		else {
			//throw new RuntimeException("Invalid gender....");
			RuntimeException runtimeGenderEx=new RuntimeException("Invalid gender....");
			throw runtimeGenderEx;
		}
		if(name.matches("^[a-zA-Z]*$")) {
			this.name = name;
		}
		else {
			//throw new RuntimeException("Invalid name....");
			RuntimeException runtimeNameEx=new RuntimeException("Invalid name....");
			throw runtimeNameEx;
		}
		if(age>=1&&age<=120) {
			this.age = age;
		}
		else {
			//throw new RuntimeException("Invalid age....");
			RuntimeException runtimeAgeEx=new RuntimeException("Invalid age....");
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
	
	Student(){
		System.out.println("Student() constructor...");
	}

	public Student(int rollNo, String stream, float marks) {
		super();
		this.rollNo = rollNo;
		this.stream = stream;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("--------EDUCATIONAL----------");
		System.out.println("Roll no. : "+rollNo);
		System.out.println("stream : "+stream);
		System.out.println("Marks : "+marks);
	}
	
}

class Employee extends Student{
	private int empNo;
	private String companyName;
	private String designation;
	private int salary;
	
	Employee(){
		System.out.println("Employee() constructor...");
	}

	public Employee(int empNo, String companyName, String designation, int salary) {
		super();
		this.empNo = empNo;
		this.companyName = companyName;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("--------EMPLOYMENT----------");
		System.out.println("Employee no. : "+empNo);
		System.out.println("Company name : "+companyName);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	
}