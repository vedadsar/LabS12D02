package vedad;

import java.util.ArrayList;

public class BitCamp {
	private  ArrayList<Student> listOfStudents;
	private int numberOfStudents;
	
	public BitCamp(){
		this.listOfStudents = new ArrayList<Student>();		
	}
	
	public String toXML(){
		String printXML = "";
		printXML += "<numberOfStudents> " +listOfStudents.size() +" </numberOfStudents>\n";
		for(int i=0;i<listOfStudents.size();i++){
			printXML += "<Student> " +"\n";
			printXML += listOfStudents.get(i).toXML();
			printXML += "</Student> " +"\n";
		}
		return printXML;
	}
	
	public void addStudent(Student s){
		listOfStudents.add(s);
	}
}
