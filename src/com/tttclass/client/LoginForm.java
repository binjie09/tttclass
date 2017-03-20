package com.tttclass.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.tttclass.JavavcCameraTest;
import com.tttclass.entity.Faculty;
import com.tttclass.service.FacultyService;
import com.tttclass.util.CommonUtil;

public class LoginForm extends JPanel { 
	private JTextField username;
	private JPasswordField password;
	private JButton loginButton;
	private JButton registerButton;
	private JDialog dialog;
	private ButtonGroup group;
	private JRadioButton studentRadio;
	private JRadioButton teacherRadio;
	private boolean ok;

	public LoginForm() {
		setLayout(new GridLayout(3, 1));
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((d.width + this.getWidth()) / 2, (d.height + this.getHeight())/2);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		JLabel userNameLabel = new JLabel("用户名:");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(userNameLabel);
		panel.add(username = new JTextField(""));
		JLabel passwordLabel = new JLabel("密码:");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(passwordLabel);
		panel.add(password = new JPasswordField(""));
		add(panel);

		registerButton = new JButton("登陆");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					new JavavcCameraTest(0);//0表示第一个摄像头设备
				} catch (org.bytedeco.javacv.FrameGrabber.Exception e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
				dialog.setVisible(false);
			}
		});

		loginButton = new JButton("注册");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				StudentMessageForm stuReg = new StudentMessageForm(null);
				stuReg.setVisible(true);
			
				dialog.setVisible(false);
				
			}
		});

		JPanel radioPanel = new JPanel();
		group = new ButtonGroup();
		studentRadio = new JRadioButton("学生", true);
		teacherRadio = new JRadioButton("教务人员", false);
		group.add(studentRadio);
		group.add(teacherRadio);
		radioPanel.add(new JLabel("你猜?"));
		radioPanel.add(studentRadio);
		radioPanel.add(teacherRadio);
		add(radioPanel);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(registerButton);
		buttonPanel.add(loginButton);
		add(buttonPanel);

	}

	/**
	 * Sets the dialog defaults.
	 * 
	 * @param u
	 *            the default user information
	 */
	public void setUser(User u) {
		username.setText(u.getName());
	}

	/**
	 * Gets the dialog entries.
	 * 
	 * @return a User object whose state represents the dialog entries
	 */
	public User getUser() {
		return new User(username.getText(), password.getPassword(), studentRadio.isSelected() == true ? 0 : 1);
	}

	/**
	 * Show the chooser panel in a dialog
	 * 
	 * @param parent
	 *            a component in the owner frame or null
	 * @param title
	 *            the dialog window title
	 */
	public boolean showDialog(Component parent, String title) {
		ok = false;

		// locate the owner frame

		Frame owner = null;
		if (parent instanceof Frame)
			owner = (Frame) parent;
		else
			owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);

		// if first time, or if owner has changed, make new dialog

		if (dialog == null || dialog.getOwner() != owner) {
			dialog = new JDialog(owner, true);
			dialog.add(this);
			dialog.getRootPane().setDefaultButton(loginButton);
			dialog.pack();
		}

		// set title and show dialog

		dialog.setTitle(title);
		dialog.setVisible(true);
		return ok;
	}

	/**
	 * test the dialog
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm dialog = new LoginForm();
					dialog.showDialog(null, "登陆");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
