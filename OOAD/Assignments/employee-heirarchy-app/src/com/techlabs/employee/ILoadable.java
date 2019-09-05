package com.techlabs.employee;

import java.util.HashMap;

public interface ILoadable<T> {
	HashMap<Integer,Employee> loadData();
}

