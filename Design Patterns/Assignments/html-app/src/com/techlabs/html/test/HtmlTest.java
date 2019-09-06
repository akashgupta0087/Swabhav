package com.techlabs.html.test;

import com.techlabs.html.Control;
import com.techlabs.html.ControlGroup;

public class HtmlTest {
	public static void main(String[] args) {
		ControlGroup html = new ControlGroup("html");
		ControlGroup head = new ControlGroup("head");
		ControlGroup body = new ControlGroup("body");
		
		html.add(head);
		html.add(body);
		
		body.add(new Control("input"));
		body.add(new Control("br"));
		
		
		html.parseHtml();
		
	}

}
