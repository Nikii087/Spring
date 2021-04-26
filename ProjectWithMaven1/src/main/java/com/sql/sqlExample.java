package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut1.Student;

public class sqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		String q="select * from  Student";
		NativeQuery nq= s.createSQLQuery(q);
		
		List<Object[]> list=nq.list();
		
		for(Object[] st:list)
		{
			System.out.println(Arrays.deepToString(st));
		}
		
		
		s.close();
		
		factory.close();
		

	}

}
