package com.tttclass.entity;

import java.sql.Date;

public class StudentBehave
{
	private String sbID;
	private String sID;
	private String sName;
	private String sBehave;
	private Date date;
	
	public String getSbID()
	{
		return sbID;
	}

	public void setSbID(String sbID)
	{
		this.sbID = sbID;
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

	public String getsBehave()
	{
		return sBehave;
	}

	public void setsBehave(String sBehave)
	{
		this.sBehave = sBehave;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
}
