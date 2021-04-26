package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class Cascading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		Question q1=new Question();
		q1.setQuestion("What is PHP");
		q1.setQuestionId(122);
		
		Answer a1=new Answer();
		a1.setAnswerId(192);
		a1.setAnswer("It is programming language");
		Answer a2=new Answer();
		a2.setAnswerId(193);
		a2.setAnswer("It is language");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		
		q1.setAnswers(list);
		Transaction tx=s.beginTransaction();
		s.save(q1);
		
		tx.commit();
		s.close();
		factory.close();

}
}
