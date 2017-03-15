package com.tttclass.database.interfac;

import java.util.Date;
import java.util.List;

import com.tttclass.entity.ClassBehave;

public interface ClassDbo
{
	public List<String> findClasses();

	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber, Date beginDate,
			Date endDate);
}
