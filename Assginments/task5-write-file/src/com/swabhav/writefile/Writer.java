package com.swabhav.writefile;

import java.io.*;

public class Writer {
	public void writeFile(String file) {
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write("Hello World!");
			System.out.println("File has been successfully written");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
