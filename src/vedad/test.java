package vedad;

public class test {
	public static void main(String[] args) {
		Student v1 = new Student("Vedad", "Zornic", 23);
		Student v2 = new Student("Emir", "Imamovic", 22);
		Student v3 = new Student("Ademovic", "Mustafa", 21);
		Student v4 = new Student("Gordan", "Sajevic", 24);
		
		
		
		BitCamp b = new BitCamp();
		b.addStudent(v1);
		b.addStudent(v4);
		b.addStudent(v3);
		b.addStudent(v2);
		
		System.out.println("<BitCamp>");
		System.out.println(b.toXML());
		System.out.println("</BitCamp>");
	}
}
