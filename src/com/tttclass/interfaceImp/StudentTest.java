package com.tttclass.interfaceImp;

import java.util.List; 
 
import org.junit.Test;

import com.tttclass.entity.Faculty;
import com.tttclass.entity.Student;

public class StudentTest {
	
	 private StudentDaoImp studentDaoImp = new StudentDaoImp();
	 private FacultyDaoImpl facultyDaoImpl = new FacultyDaoImpl();
	
	@Test
	public void text1() {
		Student student = new Student("20-22", "张三","54354534","14-1", "12345", "c:/teretrw");
		studentDaoImp.create(student);  
	}
	
	@Test
	public void text2(){
		String value = "20-11";
		Student student = studentDaoImp.findByID(value);  
	}
	
	@Test
	public void text3(){
		List<Student> stu = studentDaoImp.findAll();
		System.out.println(stu.size());
	}
	
	@Test
	public void text4(){
		//studentDaoImp.deleteByID("20"); 
		//studentDaoImp.updatePhoto("10", "c:/jed");
		List<Student> stu =  studentDaoImp.findByName("张");
		System.out.println(stu.get(1).toString());
	}
	
	@Test
	public void text5(){  
		
	}
     
	@Test
	public void text6() {
		Faculty fac = new Faculty("20", "张三", "黄天", "3232142", "f:/321kondowq"); 
		facultyDaoImpl.create(fac); 
	}
	
}
