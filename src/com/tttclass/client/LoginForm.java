package com.tttclass.client;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.tttclass.entity.Faculty;
import com.tttclass.service.FacultyService;
import com.tttclass.util.CommonUtil;

@SuppressWarnings("serial")
public class LoginForm extends JFrame
{
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	public static String username;
	
	/**
	 * 打开登陆窗口
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LoginForm frame = new LoginForm();
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
	 * 生成登陆窗口
	 */
	public LoginForm()
	{
		setTitle("登陆");
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 167);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		//txtUsername.setFont(new Font(Constant.font, Font.PLAIN, 16));
		txtUsername.setBounds(67, 15, 188, 21);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 58, 188, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("用户名");
		//lblNewLabel.setFont(new Font(Constant.font, Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 118, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密   码");
		//lblNewLabel_1.setFont(new Font(Constant.font, Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 52, 81, 31);
		contentPane.add(lblNewLabel_1);
		
		//进行一些登陆检验
		JButton btnLogin = new JButton("登录");
		//btnLogin.setFont(new Font(Constant.font, Font.PLAIN, 13));
		btnLogin.addActionListener(new ActionListener()
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				FacultyService fs = new FacultyService();
				String fUsername = txtUsername.getText();
				Faculty f = fs.findFacultyByUsername(fUsername);
				if (f != null)
				{
					String fPassword = passwordField.getText().toString().trim();
					if (f.getfPassword().equals(fPassword))
					{
						//MainWindow mw = new MainWindow();
						username = fUsername;
						dispose();
						//mw.setVisible(true);
					}
					else
					{
						CommonUtil.showMessageBox("密码错误！");
					}
				}
				else
				{
					CommonUtil.showMessageBox("用户名不存在！");
				}
			}
		});
		btnLogin.setBounds(20, 93, 93, 25);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("退出");
		//btnCancel.setFont(new Font(Constant.font, Font.PLAIN, 13));
		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		btnCancel.setBounds(144, 93, 93, 25);
		contentPane.add(btnCancel);
	}
}
