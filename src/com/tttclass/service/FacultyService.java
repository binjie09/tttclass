package com.tttclass.service;

import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import com.tttclass.entity.Faculty;
import com.tttclass.interfaceImp.FacultyDaoImpl;


public class FacultyService
{
	private FacultyDaoImpl FacultyDaoImplOfService = new FacultyDaoImpl(); 
	public void createFaculty(String fID, String fUsername, String fRealname,
			String fPassword, String fPhotoPath)
	{
		Faculty facultyOfService = new Faculty(fID, fUsername, fRealname, fPassword, fPhotoPath);
		this.FacultyDaoImplOfService.create(facultyOfService);
	}

	public void updateFaculty(String fID, String fUsername, String fRealname,
			String fPassword, String fPhotoPath)
	{
		Faculty facultyOfService1 = new Faculty(fID, fUsername, fRealname, fPassword, fPhotoPath);
		this.FacultyDaoImplOfService.update(facultyOfService1);;
	}

	public void updateFacultyPhoto(String fID, String photoPath)
	{
		this.FacultyDaoImplOfService.updatePhoto(fID, photoPath);
	}

	public void deleteFacultyByID(String fID)
	{
		this.FacultyDaoImplOfService.deleteById(fID);
	}

	public List<Faculty> findAllFaculties()
	{
		return this.FacultyDaoImplOfService.findAll();
	}

	public List<Faculty> findFaclutyByRealname(String fRealname)
	{
		return this.FacultyDaoImplOfService.findByRealname(fRealname);
	}

	public Faculty findFacultyByUsername(String fUsername)
	{
		return this.FacultyDaoImplOfService.findByUsername(fUsername);
	}

	public Faculty findFacultyByID(String fID)
	{
		return this.findFacultyByID(fID);
	}

	// Highgui 这个是什么？
	public Mat findFacultyPhotoByID(String fID)
	{
		this.FacultyDaoImplOfService.findPhotoByID(fID);
		return Highgui.imread("");
	}
}
