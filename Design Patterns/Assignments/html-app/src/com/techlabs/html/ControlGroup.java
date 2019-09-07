package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlElement {

	private String tag;
	private String bgColor;
	private List<IHtmlElement> controlGroupList = new ArrayList<IHtmlElement>();
	StringBuilder strBuild = new StringBuilder();

	public ControlGroup(String tag) {
		this.tag = tag;
	}

	public ControlGroup(String tag, String bgColor) {
		this.tag = tag;
		this.bgColor = bgColor;
	}

	public void add(IHtmlElement tag) {
		controlGroupList.add(tag);
	}

	@Override
	public StringBuilder parseHtml() {
		if (bgColor == null)
			strBuild.append("<" + tag + ">" + "\n");
		if (bgColor != null)
			strBuild.append("<" + tag + " bgcolor=" + bgColor + ">" + "\n");
		for (IHtmlElement tag : controlGroupList) {
			strBuild.append(tag.parseHtml() + "\n");
		}
		strBuild.append("</" + tag + ">");
		return strBuild;
	}

}
