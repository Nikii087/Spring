package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut1.Student;

public class HqlExample {

	

	private static long[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session s=factory.openSession();
        
        //Select 
        String query="from Student where city=:x";
        //single:unique
        //multiple:List
        
        Query q=s.createQuery(query);
        
        q.setParameter("x", "mlg");
        
        List<Student> list=q.list();
        for(Student student:list)
        {
        	System.out.println(student.getName()+":"+student.getCerti().getCourse());
        }
        
        System.out.println("-----------------------------------------------");
        
       //Delete
       Transaction tx=s.beginTransaction();
//       Query q2=s.createQuery("delete from Student s where s.city=:c");
//       
//       q2.setParameter("c", "pc");
//       int r=q2.executeUpdate();
//      
//       System.out.println("Deleted");
//       System.out.println(r);
       
       //Update
       
       Query q3=s.createQuery("update Student set city=:c where name=:n ");
       
       q3.setParameter("c", "nsk");
       q3.setParameter("n", "Nikita");
       
       int r=q3.executeUpdate();
       System.out.println(r+"Updated");
       
       tx.commit();
        
        //How to execute join query
       
       Query q4=s.createQuery("select q.question,q.questionId ,a.answer from Question as q INNER JOIN q.answers as a");
       List<Object[]> list2=q4.getResultList();
       for(Object[] arr :list2);
       {
    	   System.out.println(Arrays.toString(arr));
       }
       
       s.close();
        
        factory.close();
        

	}

}
