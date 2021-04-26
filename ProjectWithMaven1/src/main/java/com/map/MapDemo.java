package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question

		Question q1 = new Question();
		q1.setQuestion("What is java");
		q1.setQuestionId(3);

		Answer ans = new Answer();
		ans.setAnswer("Java is programming languauge");
		ans.setAnswerId(306);
		ans.setQuestion(q1);

		Answer ans1 = new Answer();
		ans1.setAnswer("We can make softwres with help of java");
		ans1.setAnswerId(307);
		ans1.setQuestion(q1);

		Answer ans2 = new Answer();
		ans2.setAnswer("It is robust language");
		ans2.setAnswerId(308);
		ans2.setQuestion(q1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);
		q1.setAnswers(list);

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(q1);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);

		tx.commit();

		Question newQ = (Question) session.get(Question.class, 2);
		System.out.println(newQ.getQuestionId());
		System.out.println(newQ.getQuestion());
		//lazy loading
		System.out.println(newQ.getAnswers().size());
		
		
		

		for (Answer a : newQ.getAnswers()) {
			System.out.println(a.getAnswer());
		}

		session.close();

		System.out.println("Done....");

		factory.close();

	}

}
