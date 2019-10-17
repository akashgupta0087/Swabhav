package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;
import com.techlabs.service.StudentService2;

public class StudentTest {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService svc = appContext.getBean("studentSVC", StudentService.class);
		
		System.out.println(svc.getStudents().size());
		
		System.out.println(svc.getStudents().hashCode());
		
		StudentService2 svc2 = appContext.getBean("studentSVC2", StudentService2.class);
		
		System.out.println(svc.getStudents().hashCode());
	}

}
