package com.swabhav.readfile.test;

import java.util.*;
import com.swabhav.readfile.Reader;

public class FileReaderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Reader r = new Reader();
	
		System.out.println("Which type if file do you want to read: ");
		System.out.println("1. Txt file \n2. Html File \n3. Xml File \n4. Csv File");
		int choice;
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		System.out.println(" ");
		String file = null;
		
		switch(choice) {
		case 1:
			file = "resources/TextFile.txt";
			break;
		case 2:
			file = "resources/HtmlFile.html";
			break;
		case 3:
			file = "resources/XmlFile.xml";
			break;
		case 4:
			file = "resources/CsvFile.csv";
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		r.readFile(file);
		
	}

}
