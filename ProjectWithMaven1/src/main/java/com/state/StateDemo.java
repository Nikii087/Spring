
package com.state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut1.Certificate;
import com.tut1.Student;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Transient 
		//Persistent
		//Detached
		//Remove
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		 Student st=new Student();
	        st.setId(3);
	        st.setName("Nikita");
	        st.setCity("mlg");
	        st.setCerti(new Certificate("java hibernet","2 months"));
	        //Transient
	        
	        Session session=factory.openSession();
	        
	       Transaction tx=session.beginTransaction();
	        
	        session.save(st);
	        
	        //Persistent
	       
	        
	        tx.commit();
	        
	        //Detached
	        session.close();
		
		factory.close();

	}

}
