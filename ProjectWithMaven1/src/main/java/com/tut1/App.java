package com.tut1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
        //Creating Student
        
        Student st=new Student();
        st.setId(1);
        st.setName("Niki");
        st.setCity("pachora");
        
        //Creating object class of Address
        
        Address ad=new Address();
        ad.setStreet("G.R");
        ad.setCity("NSK");
        ad.setOpen(true);
        //ad.setImage(image);
        //ad.setAddedDate( new Date());
        ad.setX(1234);
        
        
        //Reading image
        FileInputStream fis=new FileInputStream("src/main/java/k.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        tx.commit();
        
        session.close();
        
        System.out.println("Done....");
        
    }
}
