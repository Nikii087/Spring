package com.tut1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student st1=new Student();
        st1.setId(2);
        st1.setName("Nikita");
        st1.setCity("nsk");
        
        
        Certificate ct=new Certificate();
        ct.setCourse("Android");
        ct.setDuration("2 months");
        st1.setCerti(ct);
        
        Student st2=new Student();
        st2.setId(3);
        st2.setName("Shruti");
        st2.setCity("dhule");
        
        Certificate ct2=new Certificate();
        ct2.setCourse("java");
        ct2.setDuration("2 months");
        st2.setCerti(ct2);
        

        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(st1);
        session.save(st2);
        
        tx.commit();
        
        session.close();
        
        
        
        
        factory.close();

	}

}
