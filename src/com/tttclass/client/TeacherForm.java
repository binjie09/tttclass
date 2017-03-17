package com.tttclass.client;

import java.awt.*;
import javax.swing.*;

public class TeacherForm extends JFrame {
	
	public TeacherForm()
	{
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu searchMenu = new JMenu("搜索");
		menuBar.add(searchMenu);
		JMenuItem searchStudentStatus = new JMenuItem("学生状态");
		searchMenu.add(searchStudentStatus);
		
		setTitle("教师端");
		setSize(600, 400);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JFrame frame = new TeacherForm();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

}
