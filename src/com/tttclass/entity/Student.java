package com.tttclass.entity;

public class Student
{
	private String sID;
	private String sName;
	private String sClassNumber;
	private String sPhoneNumber;
	private String sPhotoPath;
	
	public Student(String ID, String Name, String ClassNumber, String PhoneNumber, String PhotoPath)
	{
		this.sID = ID;
		this.sName = Name;
		this.sClassNumber = ClassNumber;
		this.sPhoneNumber = PhoneNumber;
		this.sPhotoPath = PhotoPath;
	}
	
	public String getsID()
	{
		return sID;
	}

	public void setsID(String sID)
	{
		this.sID = sID;
	}

	public String getsName()
	{
		return sName;
	}

	public void setsName(String sName)
	{
		this.sName = sName;
	}

	public String getsClassNumber()
	{
		return sClassNumber;
	}

	public void setsClassNumber(String sClassNumber)
	{
		this.sClassNumber = sClassNumber;
	}

	public String getsPhoneNumber()
	{
		return sPhoneNumber;
	}

	public void setsPhoneNumber(String sPhoneNumber)
	{
		this.sPhoneNumber = sPhoneNumber;
	}

	public String getsPhotoPath()
	{
		return sPhotoPath;
	}

	public void setsPhotoPath(String sPhotoPath)
	{
		this.sPhotoPath = sPhotoPath;
	}
}
