package com.tttclass.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.tttclass.entity.StudentBehave;

import com.tttclass.service.StudentService;
import com.tttclass.util.*;

/**
 * 查询单个学生上课表现信息
 * @author asus
 *
 */
@SuppressWarnings("serial")
public class StudentPerformanceForm extends JFrame
{
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtTimeBegin;
	private JTextField txtTimeEnd;
	private JTextArea txtBehave;
	private String firstLine = "记录编号               表现                  日期";
	private List<StudentBehave> sBehave = null;
	private StudentService ss = new StudentService();

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
					StudentPerformanceForm frame = new StudentPerformanceForm();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentPerformanceForm()
	{
		setTitle("查看学生课堂表现");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 632, 340);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtID = new JTextField();
		txtID.setFont(new Font(Constant.font, Font.PLAIN, 12));
		txtID.setBounds(10, 32, 125, 21);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtTimeBegin = new JTextField();
		txtTimeBegin.setFont(new Font(Constant.font, Font.PLAIN, 12));
		txtTimeBegin.setBounds(10, 100, 125, 21);
		contentPane.add(txtTimeBegin);
		txtTimeBegin.setColumns(10);
		txtTimeBegin.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		txtTimeEnd = new JTextField();
		txtTimeEnd.setFont(new Font(Constant.font, Font.PLAIN, 12));
		txtTimeEnd.setColumns(10);
		txtTimeEnd.setBounds(10, 156, 125, 21);
		contentPane.add(txtTimeEnd);
		txtTimeEnd.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

		txtBehave = new JTextArea();
		txtBehave.setFont(new Font(Constant.font, Font.PLAIN, 13));
		txtBehave.setBounds(152, 32, 454, 219);
		contentPane.add(txtBehave);
		txtBehave.setText(firstLine);
		
		JLabel lblNewLabel_1 = new JLabel("学号");
		lblNewLabel_1.setFont(new Font(Constant.font, Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 10, 101, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("时间区间");
		lblNewLabel_2.setFont(new Font(Constant.font, Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 63, 125, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("到");
		lblNewLabel_3.setFont(new Font(Constant.font, Font.PLAIN, 12));
		lblNewLabel_3.setBounds(60, 131, 20, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblPer = new JLabel("表现记录");
		lblPer.setFont(new Font(Constant.font, Font.PLAIN, 13));
		lblPer.setBounds(155, 10, 242, 27);
		contentPane.add(lblPer);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(589, 32, 17, 219);
		contentPane.add(scrollBar);
		
		JButton btnSave = new JButton("保存到本地");
		btnSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//这里写数据以表格形式 保存本地
			}
		});
		btnSave.setFont(new Font(Constant.font, Font.PLAIN, 13));
		btnSave.setForeground(Color.BLACK);
		btnSave.setBounds(60, 268, 123, 23);
		contentPane.add(btnSave);
		
		JButton btnPrint = new JButton("打印");
		btnPrint.setFont(new Font(Constant.font, Font.PLAIN, 13));
		btnPrint.setBounds(429, 268, 111, 23);
		contentPane.add(btnPrint);
		
		JButton btnSearch = new JButton("查看");
		btnSearch.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//这里调用张向阳写好的数据库操作 筛选某段时间内的学生表现 
			}
		});
		btnSearch.setFont(new Font(Constant.font, Font.PLAIN, 13));
		btnSearch.setBounds(27, 200, 93, 23);
		contentPane.add(btnSearch);
	}
}
