package vedad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class test {
	public static void main(String[] args) throws SAXException, IOException {
		Student v1 = new Student("Vedad", "Zornic", 23);
		Student v2 = new Student("Emir", "Imamovic", 22);
		Student v3 = new Student("Ademovic", "Mustafa", 21);
		Student v4 = new Student("Gordan", "Sajevic", 24);
		BitCamp b = new BitCamp();
		b.addStudent(v1);
		b.addStudent(v4);
		b.addStudent(v3);
		b.addStudent(v2);		
		
		try {
			DocumentBuilder docRead = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		    Document xmldoc = docRead.parse(new File("/Users/vedadzornic/Documents/workspace/LabS12D02/testing.xml"));
		    System.out.println(xmldoc.getDocumentElement().getTextContent());
		    xmldoc.
		} catch (ParserConfigurationException e1) {			
		}		
		
	/*	System.out.println("<BitCamp>");
		System.out.println(b.toXML());
		System.out.println("</BitCamp>");*/
	}
}
