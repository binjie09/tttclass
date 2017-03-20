package com.tttclass.service;

import java.util.Date;
import java.util.List;

import com.tttclass.entity.ClassBehave;
import com.tttclass.interfaceImp.*;
import com.tttclass.util.CommonUtil;;

public class ClassService
{
	
	private ClassDaoImpl classDaoImpOfService = new ClassDaoImpl();
	public List<String> findAllClasses()
	{
		return classDaoImpOfService.findClasses();
	}

	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber, Date beginDate,
			Date endDate)
	{
		return classDaoImpOfService.findClassBehaveByClassNumber(cNumber, beginDate, endDate);
	}

	public List<ClassBehave> findClassBehaveByClassNumber(String cNumber,
			String beginDate, String endDate)
	{
		Date begin = CommonUtil.createDate(beginDate, true);
		Date end = CommonUtil.createDate(endDate, false);
		return classDaoImpOfService.findClassBehaveByClassNumber(cNumber, begin, end);
	}
}
