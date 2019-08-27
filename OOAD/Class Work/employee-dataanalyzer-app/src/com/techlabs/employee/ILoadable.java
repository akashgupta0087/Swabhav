package com.techlabs.employee;

import java.util.LinkedHashSet;

public interface ILoadable<T> {
	LinkedHashSet<T> loadData();
}

