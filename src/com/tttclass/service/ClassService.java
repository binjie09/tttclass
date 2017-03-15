package com.tttclass.service;

import java.util.Date;
import java.util.List;

import com.tttclass.entity.ClassBehave;


import com.tttclass.util.CommonUtil;

public class ClassService
{
	

	public List<String> findAllClasses()
	{
		return null;
	}

	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber, Date beginDate,
			Date endDate)
	{
		return null;
	}

	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber,
			String beginDate, String endDate)
	{
		Date begin = CommonUtil.createDate(beginDate, true);
		Date end = CommonUtil.createDate(endDate, false);
		return findClassBehaveByClassNumber(cNumber, begin, end);
	}
}
