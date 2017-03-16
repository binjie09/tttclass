package com.tttclass.service;

import java.util.Date;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import com.tttclass.entity.Student;
import com.tttclass.entity.StudentBehave;

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
	public void createStudent(String sID, String sName, String sClassNumber,
			String sPhoneNumber, String sPhotoPath)
	{
		
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
		
	}

	public void updateStudentPhoto(String sID, String photoPath)
	{
		
	}

	public void deleteByID(String sID)
	{
		
	}

	public List<Student> findAllStudents()
	{
		return null;
	}

	public Student findStudentByID(String sID)
	{
		return null;
	}

	public List<Student> findStudentsByClass(String sClassNumber)
	{
		return null;
	}

	public List<Student> findStudentByName(String sName)
	{
		return null;
	}

	public Mat findStudentPhotoByID(String sID)
	{
		return Highgui.imread(" ");
	}

	public List<StudentBehave> findStudentBehaveByID(String sID, Date beginDate,
			Date endDate)
	{
		return null;
	}
	
	public List<StudentBehave> findStudentBehaveByID(String sID, String beginDate,
			String endDate)
	{
		Date begin = CommonUtil.createDate(beginDate, true);
		Date end = CommonUtil.createDate(endDate, false);
		return findStudentBehaveByID(sID, begin, end);
	}
}
