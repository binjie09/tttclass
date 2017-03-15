package com.tttclass.entity;

import java.sql.Date;

public class ClassBehave
{
	private int cbID;
	private String classNumber;
	private int missNumber;
	private int focusNumber;
	private String classBehave;
	private Date date;

	public int getCbID()
	{
		return cbID;
	}

	public void setCbID(int cbID)
	{
		this.cbID = cbID;
	}

	public String getClassNumber()
	{
		return classNumber;
	}

	public void setClassNumber(String classNumber)
	{
		this.classNumber = classNumber;
	}

	public int getMissNumber()
	{
		return missNumber;
	}

	public void setMissNumber(int missNumber)
	{
		this.missNumber = missNumber;
	}

	public int getFocusNumber()
	{
		return focusNumber;
	}

	public void setFocusNumber(int focusNumber)
	{
		this.focusNumber = focusNumber;
	}

	public String getClassBehave()
	{
		return classBehave;
	}

	public void setClassBehave(String classBehave)
	{
		this.classBehave = classBehave;
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
