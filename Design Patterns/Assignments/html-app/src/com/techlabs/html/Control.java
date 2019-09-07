package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class Control implements IHtmlElement{

	private String tag;
	private String type;
	StringBuilder strBuild = new StringBuilder();
	
	public Control(String tag) {
		this.tag = tag;
	}
	
	public Control(String tag, String type) {
		this.tag = tag;
		this.type = type;
	}
	
	@Override
	public StringBuilder parseHtml() {
		if(type!=null)
		strBuild.append("<" + tag + " type=" + type + ">");
		if(type == null)
		strBuild.append("<" + tag + ">");
		return strBuild;
	}

}
