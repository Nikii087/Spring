package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut1.Student;

public class FirstCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session s = factory.openSession();
		
		Student student=s.get(Student.class, 6);
		System.out.println(student);
		System.out.println("Working start");
		Student student1=s.get(Student.class, 6);
		System.out.println(student1);
		System.out.println(s.contains(student1));
		
		

		s.close();
		factory.close();

	}

}
