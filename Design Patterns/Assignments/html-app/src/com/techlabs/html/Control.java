package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class Control implements IHtmlElement{

	private String tag;
	
	public Control(String tag) {
		this.tag = tag;
	}
	
	@Override
	public void parseHtml() {
		System.out.println("<" + tag +">");
	}

}
