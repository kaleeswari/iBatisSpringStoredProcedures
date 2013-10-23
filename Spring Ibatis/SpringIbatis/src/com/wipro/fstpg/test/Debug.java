package com.wipro.fstpg.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.fstpg.dao.*;
import com.wipro.fstpg.pojo.*;



public class Debug {

	public static void main(String[] args) throws IOException, SQLException {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/wipro/fstpg/resources/context/spring_mvc_context.xml");
		StudentDao studentDao = (StudentDao) factory.getBean("studentdao");

		new Debug().getAll(studentDao);

		new Debug().get(studentDao);
		
		//new Debug().add(studentDao);
		
		//new Debug().modify(studentDao);
		
		//new Debug().delete(studentDao);
		
		new Debug().getStoredProcedure(studentDao);
		
		new Debug().getStoredProcedureUsingId(studentDao);
		
		
	}

	public void getAll(StudentDao studentDao) {
		System.out.println("Inside Get all Student details");
		System.out.println("------------------------------");
		List<Student> students = studentDao.getAll();
		for (Student student : students) {
			System.out.print("Student Id :"+student.getStuId() + "\t");
			System.out.print("Student Name:"+student.getStuName() + "\t");
			System.out.print("Student Gender:"+student.getStuGender() + "\t");
			System.out.println("Student Age:"+student.getStuAge() + "\n");
		}
	}

	public void get(StudentDao studentDao) {
		System.out.println("\nInside Get details for particular id");
		System.out.println("------------------------------------");
		Student student = studentDao.get(1L);
		System.out.print(student.getStuId() + "\t");
		System.out.print(student.getStuName() + "\t");
		System.out.print(student.getStuGender() + "\t");
		System.out.println(student.getStuAge() + "\n");
	}

	public void add(StudentDao studentDao) {
		System.out.println("\nInside Insert Method");
		System.out.println("--------------------");
		Student student = new Student();
		student.setStuName("Sarav");
		student.setStuGender("Male");
		student.setStuAge(26L);
		studentDao.insert(student);
		System.out.println("Data inserted Successfully\n");
	}

	public void modify(StudentDao studentDao) {
		System.out.println("\nInside Update Method");
		System.out.println("--------------------");
		Student student = new Student();
		student.setStuId(7L);
		studentDao.update(student.getStuId());
		System.out.println("Updated Successfully\n");
		
	}

	public void delete(StudentDao studentDao) {
		System.out.println("\nInside Delete Method");
		System.out.println("--------------------");
		Student student = new Student();
		student.setStuId(7L);
		studentDao.delete(student.getStuId());
		System.out.println("Deleted Successfully\n");
	}
	
	public void getStoredProcedure(StudentDao studentDao)
	{
		System.out.println("\nInside Stored procedure Call for fetch all Student Details");
		System.out.println("----------------------------------------------------------");
		List<Student> students = studentDao.getStoredProcedure();
		for (Student student : students) {
			System.out.print("Student Id :"+student.getStuId() + "\t");
			System.out.print("Student Name:"+student.getStuName() + "\t");
			System.out.print("Student Gender:"+student.getStuGender() + "\t");
			System.out.print("Student Age:"+student.getStuAge() + "\t");
			System.out.print("Student Mark1:"+student.getMark1()+ "\t");
			System.out.print("Student Mark2:"+student.getMark2()+ "\t");
			System.out.print("Student Mark3:"+student.getMark3()+ "\n");
		}
	}
	
	
	public void getStoredProcedureUsingId(StudentDao studentDao) {
		Student student = studentDao.getStoredProcedureById(1L);
			System.out.println("\nInside Stored procedure Call for fetch Student detail for particular id");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("Student Id :"+student.getStuId() + "\t");
			System.out.print("Student Name:"+student.getStuName() + "\t");
			System.out.print("Student Gender:"+student.getStuGender() + "\t");
			System.out.println("Student Age:"+student.getStuAge() + "\n");
		
	}

}
