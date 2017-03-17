package com.tttclass.client;

/**
 * duty = 0 代表学生 ， 1代表教务人员
 */
public class User {
	private String name;
	private char[] password;
	private int duty;
	
	public User(String aName, char[] aPassword, int aduty) {
		name = aName;
		password = aPassword;
		duty = aduty;
	}
	
	public int getDuty() {
		return duty;
	}

	public void setDuty(int duty) {
		this.duty = duty;
	}

	public String getName() {
		return name;
	}

	public char[] getPassword() {
		return password;
	}

	public void setName(String aName) {
		name = aName;
	}

	public void setPassword(char[] aPassword) {
		password = aPassword;
	}
}
