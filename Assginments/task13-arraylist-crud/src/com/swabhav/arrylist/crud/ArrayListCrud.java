package com.swabhav.arrylist.crud;

import java.util.ArrayList;

public class ArrayListCrud implements ICrudable{

	ArrayList<String> list = new ArrayList<String>();
	
	@Override
	public void create(String s) {
		list.add(s);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String read() {
		String result = "";
		for(int i = 0; i < list.size(); i++) {
			result = result+ " " + list.get(i);
		}
		return result;
	}

	@Override
	public void update(int i, String s) {
		list.set(i, s);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int i) {
		list.remove(i);
		// TODO Auto-generated method stub
		
	}
	

}
