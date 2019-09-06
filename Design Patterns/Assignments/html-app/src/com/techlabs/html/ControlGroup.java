package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlElement{

	private String tag;
	private List<IHtmlElement> controlGroupList = new ArrayList<IHtmlElement>();
	
	public ControlGroup(String tag) {
		this.tag = tag;
	}
	
	public void add(IHtmlElement tag) {
		controlGroupList.add(tag);
	}
	
	@Override
	public void parseHtml() {
		System.out.println("<" + tag +">");
		for(IHtmlElement tag:controlGroupList) {
			tag.parseHtml();
		}
		System.out.println("</" + tag +">");
	}

}
