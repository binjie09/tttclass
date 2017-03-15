package com.tttclass.database.interfac;

import java.util.List;

import com.tttclass.entity.Faculty;

public interface FacultyDbo
{

	public List<Faculty> findAll();

	public List<Faculty> findByRealname(String fRealname);

	public Faculty findByUsername(String fUsername);

	public Faculty findByID(String fID);
	
	public void create(Faculty faculty);

	public void update(Faculty faculty);

	public void updatePhoto(String fID, String photoPath);

	public void deleteById(String fID);

	public String findPhotoByID(String fID);
}
