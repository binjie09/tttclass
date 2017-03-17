package com.tttclass.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudentMessageForm extends JDialog{
	private JTextField studentNumber;
	private JPasswordField studentFirstPassword;
	private JPasswordField studnetSecondPassword;
	private JTextField studentNickname;
	private JTextField studentClass;
	private JTextField studentTel;
	private Image image;
	private JButton studentImageButton;
	private JButton okButton;
	private JButton cancelButton;

	public StudentMessageForm(JFrame owner)
	{
		super(owner, "注册", true);
		setLayout(new BorderLayout());
		
		JPanel upPanel = new JPanel();
		upPanel.setLayout(new GridLayout(1, 2));
		JPanel panelMessage = new JPanel();
		panelMessage.setLayout(new GridLayout(6, 2));
		
		JLabel numberLabel = new JLabel("学号:");
		numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(numberLabel);
		panelMessage.add(studentNumber = new JTextField(""));
		upPanel.add(panelMessage);
		
		JLabel passwordFirstLabel = new JLabel("密码:");
		passwordFirstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(passwordFirstLabel);
		panelMessage.add(setStudentFirstPassword(new JPasswordField("")));
		upPanel.add(panelMessage);
		
		JLabel passwordSecondLabel = new JLabel("确认密码:");
		passwordSecondLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(passwordSecondLabel);
		panelMessage.add(setStudnetSecondPassword(new JPasswordField("")));
		upPanel.add(panelMessage);
		
		JLabel studentNicknameLabel = new JLabel("昵称:");
		studentNicknameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(studentNicknameLabel);
		panelMessage.add(studentNickname = new JTextField(""));
		upPanel.add(panelMessage);
		
		JLabel studentClassLabel = new JLabel("班级:");
		studentClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(studentClassLabel);
		panelMessage.add(studentNickname = new JTextField(""));
		upPanel.add(panelMessage);
		
		JLabel studentTelLabel = new JLabel("Tel:");
		studentTelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelMessage.add(studentTelLabel);
		panelMessage.add(studentTel = new JTextField(""));
		upPanel.add(panelMessage);
		add(upPanel, BorderLayout.NORTH);
		studentImageButton = new JButton("点击上传真人丑照");
		studentImageButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
		
			}
		});
		upPanel.add(studentImageButton);
		
		JPanel buttonPanel = new JPanel();
		JButton okButton = new JButton("确定");
		okButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
		
			}
		});
		buttonPanel.add(okButton);
		JButton cancelButton = new JButton("取消");
		cancelButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
		
			}
		});
		buttonPanel.add(cancelButton);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
	}
	
	public JTextField getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(JTextField studentNumber) {
		this.studentNumber = studentNumber;
	}

	public JTextField getStudentNickname() {
		return studentNickname;
	}

	public void setStudentNickname(JTextField studentNickname) {
		this.studentNickname = studentNickname;
	}

	public JTextField getStudentTel() {
		return studentTel;
	}

	public void setStudentTel(JTextField studentTel) {
		this.studentTel = studentTel;
	}

	public JTextField getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(JTextField studentClass) {
		this.studentClass = studentClass;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JDialog dialog = new StudentMessageForm(null);
		dialog.setVisible(true);
	}

	public JPasswordField getStudentFirstPassword() {
		return studentFirstPassword;
	}

	public JPasswordField setStudentFirstPassword(JPasswordField studentFirstPassword) {
		this.studentFirstPassword = studentFirstPassword;
		return studentFirstPassword;
	}

	public JPasswordField getStudnetSecondPassword() {
		return studnetSecondPassword;
	}

	public JPasswordField setStudnetSecondPassword(JPasswordField studnetSecondPassword) {
		this.studnetSecondPassword = studnetSecondPassword;
		return studnetSecondPassword;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
