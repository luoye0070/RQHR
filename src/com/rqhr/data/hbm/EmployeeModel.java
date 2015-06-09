package com.rqhr.data.hbm;

import com.rqhr.model.DataModel;

public class EmployeeModel extends DataModel {
	private String userName;
	private String passWord;
	private String phoneSn;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPhoneSn() {
		return phoneSn;
	}
	public void setPhoneSn(String phoneSn) {
		this.phoneSn = phoneSn;
	}
}
