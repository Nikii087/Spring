package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEid(1);
		e1.setName("Nishu");
		
		e2.setEid(2);
		e2.setName("pooja");
		
		Proj p1=new Proj();
		Proj p2=new Proj();
		
		p1.setPid(12);
		p1.setPname("Library Management System");
		
		p2.setPid(13);
		p2.setPname("Student Management");
		
		
		List<Emp> list=new ArrayList<Emp>();
		
		List<Proj> list1=new ArrayList<Proj>();
		
		list.add(e1);
		list.add(e2);
		
		list1.add(p1);
		list1.add(p2);
		
		e1.setProjects(list1);
		p2.setEmps(list);
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		tx.commit();
		
		session.close();

		System.out.println("Done....");

		factory.close();

	}

}