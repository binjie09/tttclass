package com.tttclass.client;


import java.awt.*;
import javax.swing.*;

import com.tttclass.service.ClassService;


@SuppressWarnings("serial")
public class MainForm extends JFrame
{
	public MainForm()
	{
		setSize(600, 400);
		setTitle("主窗体");
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JFrame frame = new MainForm();
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
