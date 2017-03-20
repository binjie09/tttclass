package com.tttclass.entity;

public class Faculty
{
	private String fID;
	private String fUsername;
	private String fRealname;
	private String fPassword;
	private String fPhotoPath;

	public Faculty(String ID, String Username, String Realname, String Password,
			String PhotoPath)
	{
		this.fID = ID;
		this.fUsername = Username;
		this.fRealname = Realname;
		this.fPassword = Password;
		this.fPhotoPath = PhotoPath;
	}

	public String getfID()
	{
		return fID;
	}

	public void setfID(String fID)
	{
		this.fID = fID;
	}

	public String getfUsername()
	{
		return fUsername;
	}

	public void setfUsername(String fUsername)
	{
		this.fUsername = fUsername;
	}

	public String getfRealname()
	{
		return fRealname;
	}

	public void setfRealname(String fRealname)
	{
		this.fRealname = fRealname;
	}

	public String getfPassword()
	{
		return fPassword;
	}

	public void setfPassword(String fPassword)
	{
		this.fPassword = fPassword;
	}

	public String getfPhotoPath()
	{
		return fPhotoPath;
	}

	public void setfPhotoPath(String fPhotoPath)
	{
		this.fPhotoPath = fPhotoPath;
	}
}
