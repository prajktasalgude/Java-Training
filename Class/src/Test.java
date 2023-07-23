
public class Test {

	public static void main(String[] args) {
		College c1=new College("Karajgi","Kharat",3000,"Orchid","Solapur",50,6);
		c1.getInfo();
		c1.addDepartment("Chemical");
		c1.getInfo();
		c1.addDepartment("BioChemical", "Rathod");
		c1.getInfo();
	}
	

}
