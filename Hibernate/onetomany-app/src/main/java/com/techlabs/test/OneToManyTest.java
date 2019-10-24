package com.techlabs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Department;
import com.techlabs.model.Employee;

public class OneToManyTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		SessionFactory factory = cfg.configure("hibernate-cfg.xml").buildSessionFactory();
		
		Department dept1 = new Department();
		
		Department dept2 = new Department();
		
		Set<Employee> employees1 = new HashSet<Employee>();
		Set<Employee> employees2 = new HashSet<Employee>();
		
		dept1.setId(1);
		dept1.setName("Coding");
		
		dept2.setId(2);
		dept2.setName("HR");
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Sachin");
		emp1.setDept(dept1);
		
		Employee emp2 = new Employee();	
		emp2.setId(102);
		emp2.setName("Virat");
		emp2.setDept(dept1);
		
		Employee emp3 = new Employee();
		emp3.setId(103);
		emp3.setName("Dhoni");
		emp3.setDept(dept2);
		
		Employee emp4 = new Employee();
		emp4.setId(104);
		emp4.setName("Hardik");
		emp4.setDept(dept2);
		
        Session session = factory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		employees1.add(emp1);
		employees1.add(emp2);
		employees2.add(emp3);
		employees2.add(emp4);	
		
		dept1.setEmployees(employees1);
		dept2.setEmployees(employees2);
		
		session.save(dept1);
		session.save(dept2);
	
		txn.commit();
		
		session.close();
		
		
	}
}
