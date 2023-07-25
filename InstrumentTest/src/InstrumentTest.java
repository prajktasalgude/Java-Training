
public class InstrumentTest {
	public static void main(String[] args) {
		
		Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		ElectronicGuitar electGuitar=new ElectronicGuitar();
		electGuitar.use();
		electGuitar.tuneStrings();
		electGuitar.play();
		electGuitar.pluck();
		electGuitar.preset();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Cello cello = new Cello();
		cello.use();
		cello.tuneStrings();
		cello.play();
		cello.bow();
		cello.longBowing();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Fluet fluet=new Fluet();
		fluet.use();
		fluet.play();
		fluet.blowAir();
		fluet.sidwayUse();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Harmonium harmonium=new Harmonium();
		harmonium.use();
		harmonium.play();
		harmonium.blowAir();
		harmonium.bellowsUse();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Tabla tabla=new Tabla();
		tabla.use();
		tabla.play();
		tabla.tuneSurface();
		tabla.towDrums();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Dhol dhol=new Dhol();
		dhol.use();
		dhol.play();
		dhol.tuneSurface();
		dhol.bifacial();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		SurgicalCutter sc=new SurgicalCutter();
		sc.use();
		sc.sterile();
		sc.operate();
		sc.cut();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		SurgicalNeedle sn=new SurgicalNeedle();
		sn.use();
		sn.sterile();
		sn.operate();
		sn.stitch();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		Glucometer glucometer=new Glucometer();
		glucometer.use();
		glucometer.operate();
		glucometer.reader();
		glucometer.prick();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		ECGMachine ecg=new ECGMachine();
		ecg.use();
		ecg.operate();
		ecg.reader();
		ecg.attachElectrodes();
	
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}

abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
}

class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");
	}
}

class ElectronicGuitar extends Guitar{
	public void use() {
		System.out.println("Using Electronic Guitar...");
	}
	void play() {
		System.out.println("Playing Electronic Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Electronic Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Electronic Guitar...");
	}
	void preset() {
		System.out.println("Presetting the Electronic Guitar...");
	}
}

class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");
	}
	
}

class Cello extends Violin{
	public void use() {
		System.out.println("Using Cello...");
	}
	void play() {
		System.out.println("Playing Cello...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Cello...");

	}
	void bow() {
		System.out.println("Bowing Strings of Cello...");
	}
	void longBowing() {
		System.out.println("Long Bowing Cello...");
	}
}

class Fluet extends AirBasedMusicalInstrument{
	public void use(){
		System.out.println("Using fluet...");
	}
	
	void play() {
		System.out.println("Playing fluet...");
	}
	
	void blowAir() {
		System.out.println("Blowing air in fluet...");
	}
	
	void sidwayUse() {
		System.out.println("Fluet is getting used sideways to blow the air...");
	}
}

class Harmonium extends AirBasedMusicalInstrument{
	public void use(){
		System.out.println("Using harmonium...");
	}
	
	void play() {
		System.out.println("Playing harmonium...");
	}
	
	void blowAir() {
		System.out.println("Blowing air in harmonium...");
	}
	
	void bellowsUse() {
		System.out.println("Bellows are getting pressed to pass the air...");
	}
}

class Tabla extends DrumBasedMusicalInstrument{
	public void use(){
		System.out.println("Using tabla...");
	}
	
	void play() {
		System.out.println("Playing tabla...");
	}
	
	void tuneSurface() {
		System.out.println("Tuning surface of tabla...");
	}
	
	void towDrums() {
		System.out.println("Using both the drums of tabla...");
	}
}

class Dhol extends DrumBasedMusicalInstrument{
	public void use(){
		System.out.println("Using tabla...");
	}
	
	void play() {
		System.out.println("Playing tabla...");
	}
	
	void tuneSurface() {
		System.out.println("Tuning surface of tabla...");
	}
	
	void bifacial() {
		System.out.println("Using both the sides of tabla...");
	}
}

abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument{
	abstract void sterile();
}

abstract class PathalogicalInstrument extends MedicalInstrument{
	abstract void reader();
}

class SurgicalCutter extends SurgicalInstrument{
	public void use() {
		System.out.println("Using surgical cutter...");
	}
	
	void operate() {
		System.out.println("Operating surgical cutter...");

	}
	
	void sterile() {
		System.out.println("Sterilizing surgical cutter...");
	}
	
	void cut() {
		System.out.println("Cutting using surgical cutter...");
	}
}

class SurgicalNeedle extends SurgicalInstrument{
	public void use() {
		System.out.println("Using surgical needle...");
	}
	
	void operate() {
		System.out.println("Operating surgical needle...");

	}
	
	void sterile() {
		System.out.println("Sterilizing surgical needle...");
	}
	
	void stitch() {
		System.out.println("Stitching the cut using surgical needle...");
	}
}

class Glucometer extends PathalogicalInstrument{
	public void use() {
		System.out.println("Using glucometer...");
	}
	
	void operate() {
		System.out.println("Operating glucometer...");
	}
	
	void reader() {
		System.out.println("Reading data on glucometer...");
	}
	
	void prick() {
		System.out.println("Pricking on finger...");
	}
}

class ECGMachine extends PathalogicalInstrument{
	public void use() {
		System.out.println("Using ECG Machine...");
	}
	
	void operate() {
		System.out.println("Operating ECG Machine...");
	}
	
	void reader() {
		System.out.println("Reading data on report created by ECG Machine...");
	}
	
	void attachElectrodes() {
		System.out.println("Attaching electrodes...");
	}
}






