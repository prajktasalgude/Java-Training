
public class FurnitureTest {
	public static void main(String[] args) {
		CentreTable ct=new CentreTable();
		ct.name();
		ct.livingRoom();
		ct.material();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		TVUnit tvUnit=new TVUnit();
		tvUnit.name();
		tvUnit.livingRoom();
		tvUnit.fixed();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Sofa sofa=new Sofa();
		sofa.name();
		sofa.livingRoom();
		sofa.relax();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		StudyTable st=new StudyTable();
		st.name();
		st.office();
		st.material();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		OfficeChair oc=new OfficeChair();
		oc.name();
		oc.office();
		oc.comfort();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		DiningTable dt=new DiningTable();
		dt.name();
		dt.kitchen();
		dt.seats();

		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		KitchenTrolly kt=new KitchenTrolly();
		kt.name();
		kt.kitchen();
		kt.look();
		
	}
}


interface Furniture{
	void name();
}

abstract class LivingRoomFurniture implements Furniture{
	abstract void livingRoom();
}

abstract class OfficeFurniture implements Furniture{
	abstract void office();
}

abstract class KitchenFurniture implements Furniture{
	abstract void kitchen();
}

class CentreTable extends LivingRoomFurniture{
	public void name() {
		System.out.println("This is centre table");
	}
	
	void livingRoom() {
		System.out.println("Centre table is placed in living room");
	}
	
	void material() {
		System.out.println("This centre table is made up of glass");
	}
}

class TVUnit extends LivingRoomFurniture{
	public void name() {
		System.out.println("This is TV Unit");
	}
	
	void livingRoom() {
		System.out.println("TV unit is placed in living room");
	}
	
	void fixed() {
		System.out.println("This TV unit is fixed to wall");
	}
}

class Sofa extends LivingRoomFurniture{
	public void name() {
		System.out.println("This is sofa");
	}
	
	void livingRoom() {
		System.out.println("Sofa is placed in living room");
	}
	
	void relax() {
		System.out.println("This sofa is relaxing");
	}
}


class StudyTable extends OfficeFurniture{
	public void name() {
		System.out.println("This is Study table");
	}
	
	void office() {
		System.out.println("Study table is placed in office");
	}
	
	void material() {
		System.out.println("This study tble is made up of wood");
	}
}

class OfficeChair extends OfficeFurniture{
	public void name() {
		System.out.println("This is office chair");
	}
	
	void office() {
		System.out.println("Office chair is placed in office");
	}
	
	void comfort() {
		System.out.println("This study office chair is very comfortable");
	}
}

class DiningTable extends KitchenFurniture{
	public void name() {
		System.out.println("This is dining table");
	}
	
	void kitchen() {
		System.out.println("Dining table is placed in kitchen");
	}
	
	void seats() {
		System.out.println("This dining tble is 6 seater");
	}
}

class KitchenTrolly extends KitchenFurniture{
	public void name() {
		System.out.println("This is kitchen trolly");
	}
	
	void kitchen() {
		System.out.println("Kitchen trolly is placed in kitchen");
	}
	
	void look() {
		System.out.println("This kitchen trolly is looking beautiful");
	}
}














