package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.tut1.Student;



public class SecondCache {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session s1 = factory.openSession();
		
		Student student=s1.get(Student.class, 6);
		System.out.println(student);

		s1.close();

		Session s2 = factory.openSession();
		Student student1=s2.get(Student.class, 6);
		System.out.println(student1);

		s2.close();

	}

}
