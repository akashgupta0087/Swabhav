package com.swabhav.propertyfile;

import java.util.*;  
import java.io.*;

public class PropertyTest {
	   
	public static void main(String[] args){  
	    FileReader reader;
		try {
			reader = new FileReader("resources/db.properties");
			Properties p=new Properties();  
		    p.load(reader);  
		    System.out.println(p.getProperty("user"));  
		    System.out.println(p.getProperty("password")); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
	    
	      
	     
	}  
	}  
