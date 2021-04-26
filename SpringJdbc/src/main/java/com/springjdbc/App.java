package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("MyProgram is Started");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		Student student = new Student();
//		student.setId(125);
//		student.setName("Divya");
//		student.setCity("Pachora");
//
//		int result = studentDao.insert(student);
//
//		System.out.println("The row inserted: " + result);

//       Student student=new Student();
//       student.setId(121);
//       student.setName("sharu");
//       student.setCity("dhule");
//       int result=studentDao.change(student);
//       System.out.println("The row updated: "+result);
//       
//       int r=studentDao.delete(1);
//       System.out.println("The row Deleted: "+r);

//		Student r = studentDao.getStudent(122);
//		System.out.println("Data are: " + r);

		List<Student> students = studentDao.getAllStudents();
		for(Student s:students)
		{
			System.out.println(s);
		}

	}
}
