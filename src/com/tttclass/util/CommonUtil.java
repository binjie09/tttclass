package com.tttclass.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CommonUtil
{
	public static String getFilePath()
	{
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		jfc.showDialog(new JLabel(), "确定");
		return jfc.getSelectedFile() == null ? null
				: jfc.getSelectedFile().getAbsolutePath();
	}

	@SuppressWarnings("deprecation")
	public static Date createDate(String dateString, boolean isBegin)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try
		{
			date = df.parse(dateString);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		if (!isBegin)
		{
			date.setHours(23);
			date.setMinutes(59);
			date.setSeconds(59);
		}
		return date;
	}

	public static void showMessageBox(String message)
	{
		JOptionPane.showMessageDialog(null, message, "提示", JOptionPane.OK_OPTION);
	}
}
