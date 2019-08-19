package com.swabhav.arrylist.crud;

import java.util.ArrayList;

public interface ICrudable {
	void create(String s);
	String read();
	void update(int i, String s);
	void delete(int i);

}
