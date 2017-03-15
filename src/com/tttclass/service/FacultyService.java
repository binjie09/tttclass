package com.tttclass.service;

import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import com.tttclass.entity.Faculty;


public class FacultyService
{
	
	public void createFaculty(String fID, String fUsername, String fRealname,
			String fPassword, String fPhotoPath)
	{
		
	}

	public void updateFaculty(String fID, String fUsername, String fRealname,
			String fPassword, String fPhotoPath)
	{
		
	}

	public void updateFacultyPhoto(String fID, String photoPath)
	{
		
	}

	public void deleteFacultyByID(String fID)
	{
		
	}

	public List<Faculty> findAllFaculties()
	{
		return null;
	}

	public List<Faculty> findFaclutyByRealname(String fRealname)
	{
		return null;
	}

	public Faculty findFacultyByUsername(String fUsername)
	{
		return null;
	}

	public Faculty findFacultyByID(String fID)
	{
		return null;
	}

	public Mat findFacultyPhotoByID(String fID)
	{
		return Highgui.imread("");
	}
}
