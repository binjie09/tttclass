package com.tttclass.service;

import java.util.Date;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import com.tttclass.entity.Student;
import com.tttclass.entity.StudentBehave;
import com.tttclass.interfaceImp.StudentDaoImp;
import com.tttclass.util.CommonUtil;

public class StudentService
{
	/**
	 * 创建学生信息
	 * @param sID
	 * @param sName
	 * @param sClassNumber
	 * @param sPhoneNumber
	 * @param sPhotoPath
	 */
	
	private StudentDaoImp StudentDaoImptOfService = new StudentDaoImp();
	public void createStudent(String sID, String sName, String sClassNumber,
			String sPhoneNumber, String sPhotoPath)
	{
		Student studentOfService = new Student(sID, sName, sClassNumber, sPhoneNumber, sPhotoPath);
		this.StudentDaoImptOfService.create(studentOfService);
	}
	/**
	 * 更新学生信息
	 * @param sID
	 * @param sName
	 * @param sClassNumber
	 * @param sPhoneNumber
	 * @param sPhotoPath
	 */
	public void updateStudent(String sID, String sName, String sClassNumber,
			String sPhoneNumber, String sPhotoPath)
	{
		Student studentOfService1 = new Student(sID, sName, sClassNumber, sPhoneNumber, sPhotoPath);
		this.StudentDaoImptOfService.update(studentOfService1);
	}

	public void updateStudentPhoto(String sID, String photoPath)
	{
		this.StudentDaoImptOfService.updatePhoto(sID, photoPath);
	}

	public void deleteByID(String sID)
	{
		this.StudentDaoImptOfService.deleteByID(sID);
	}

	public List<Student> findAllStudents()
	{
		return this.StudentDaoImptOfService.findAll();
	}

	public Student findStudentByID(String sID)
	{
		return this.findStudentByID(sID);
	}

	public List<Student> findStudentsByClass(String sClassNumber)
	{
		return this.StudentDaoImptOfService.findByClass(sClassNumber);
	}

	public List<Student> findStudentByName(String sName)
	{
		return this.StudentDaoImptOfService.findByName(sName);
	}

	// 不知道 Highgui？？
	public Mat findStudentPhotoByID(String sID)
	{
		// return this.StudentDaoImptOfService.findPhotoByID(sID);
		return Highgui.imread(" ");
	}

	public List<StudentBehave> findStudentBehaveByID(String sID, Date beginDate,
			Date endDate)
	{
		return this.StudentDaoImptOfService.findBehaveBysID(sID, beginDate, endDate);
	}
	
	public List<StudentBehave> findStudentBehaveByID(String sID, String beginDate,
			String endDate)
	{
		Date begin = CommonUtil.createDate(beginDate, true);
		Date end = CommonUtil.createDate(endDate, false);
		return findStudentBehaveByID(sID, begin, end);
	}
}
