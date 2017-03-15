package com.tttclass.database.interfac;

import java.util.Date;
import java.util.List;

import com.tttclass.entity.Student;
import com.tttclass.entity.StudentBehave;

public interface StudentDbo
{
	public void create(Student student);

	public void update(Student student);

	public void updatePhoto(String sID, String photoPath);

	public void deleteByID(String sID);

	public List<Student> findAll();

	public Student findByID(String sID);

	public List<Student> findByClass(String sClassNumber);

	public List<Student> findByName(String sName);

	public String findPhotoByID(String sID);
	
	public boolean checkOnline(Student student);
	
	public boolean isSleep(Student student);

	public List<StudentBehave> findBehaveBysID(String sID, Date beginDate, Date endDate);
}
