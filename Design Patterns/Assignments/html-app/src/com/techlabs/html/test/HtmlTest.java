package com.techlabs.html.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlabs.html.Control;
import com.techlabs.html.ControlGroup;

public class HtmlTest {
	public static void main(String[] args) {
		ControlGroup html = new ControlGroup("html");
		ControlGroup head = new ControlGroup("head");
		ControlGroup body = new ControlGroup("body","cyan");
		
		html.add(head);
		html.add(body);
		
		body.add(new Control("input","text"));
		body.add(new Control("br"));
		body.add(new Control("br"));
		body.add(new Control("input","text"));
		
		
		StringBuilder strBuild = html.parseHtml();
		
		
		File file = new File("Resources/demo.html");
		try(BufferedWriter bwriter = new BufferedWriter(new FileWriter(file))){
			bwriter.write(strBuild.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
