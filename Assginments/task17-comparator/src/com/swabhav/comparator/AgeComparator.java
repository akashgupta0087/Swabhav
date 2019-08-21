package com.swabhav.comparator;

import java.util.*;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.age > student2.age)
			return 1;
		if(student1.age < student2.age)
			return -1;
		return 0;
	}

}
