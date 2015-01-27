package vedad;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	
	public Student (String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * 
	 * @return
	 */
	public  String toXML (){			
		return "<firstName> " +firstName +" </firstName>" +"\n"
				+"<lastName> "+lastName +" </lastName>" +"\n"
				+"<age> " +age +" </age>" +"\n";		
	}
}
