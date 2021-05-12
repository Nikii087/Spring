package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student=new Student(11,"puja","pc");
//		int r=studentDao.insert(student);
//		System.out.println("inserted: "+r);
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
		System.out.println("Press 1: For add new student");
		System.out.println("Press 2: For display all  student");
		System.out.println("Press 3: For display single students");
		System.out.println("Press 4: For update student");
		System.out.println("Press 5: For delete student");
		System.out.println("Press 6: Exit");
		
		try
		{
			Integer input=Integer.parseInt(br.readLine());
			
			switch(input)
			{
				case 1:
					//Add new student
					System.out.println("Enter user id");
					int uId=Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name");
					String uName=br.readLine();
					
					System.out.println("Enter user city");
					String uCity=br.readLine();
					
					Student student=new Student();
					student.setId(uId);
					student.setName(uName);
					student.setCity(uCity);
					
					int r=studentDao.insert(student);
					System.out.println("Student added: "+r);
					
					break;
				case 2:
					//Display all student
					System.out.println("***********************************");
					List<Student> allStudents=studentDao.getAllStudent();
					for(Student st:allStudents)
					{
						System.out.println("Id   :"+st.getId());
						System.out.println("Name :"+st.getName());
						System.out.println("City :"+st.getCity());
						System.out.println("____________________________");
					}
					
					break;
				case 3:
					//Display single student
					System.out.println("Enter user id");
					int userId=Integer.parseInt(br.readLine());
					Student student1=studentDao.getStudent(userId);
					System.out.println("Id   :"+student1.getId());
					System.out.println("Name :"+student1.getName());
					System.out.println("City :"+student1.getCity());
					System.out.println("____________________________");
					break;
				case 4:
					//Update student
					System.out.println("Enter user id");
					int userId1=Integer.parseInt(br.readLine());
					Student student2=studentDao.getStudent(userId1);
					System.out.println("Id   :"+student2.getId());
					System.out.println("Name :"+student2.getName());
					System.out.println("City :"+student2.getCity());
					System.out.println("____________________________");
					
//					System.out.println("Enter user id");
//					int uId1=Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name");
					String uName1=br.readLine();
					
					System.out.println("Enter user city");
					String uCity1=br.readLine();
					
					
					//student2.setId(uId1);
					student2.setName(uName1);
					student2.setCity(uCity1);
					
					studentDao.updateStudent(student2);
					System.out.println("Data updated: ");
					
					break;
				case 5:
					//Delete student
					System.out.println("Enter user id");
					int id=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student Deleted");
					
					break;
				case 6:
					//Exit
					go=false;
					break;
				
			
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Invalid output try with another one");
			System.out.println(e.getMessage());
		}
		}
		System.out.println("Thank u for using my application");

    }
}
