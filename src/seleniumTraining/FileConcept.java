package seleniumTraining;

public class FileConcept {
	
	public static void readFile() {
		System.out.println("Read File");
	}
	public void writeFile() {
		System.out.println("Write File");
	}

	public static void main(String[] args) {
		
		readFile();
		FileConcept.readFile();
		
		FileConcept fc = new FileConcept();
		fc.writeFile();

	}

}
