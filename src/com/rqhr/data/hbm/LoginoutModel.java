package com.rqhr.data.hbm;

import java.util.Date;

import com.rqhr.model.DataModel;

public class LoginoutModel extends DataModel {
	public long id;
	public Date date;
	public Date time;
	public int type;//0,1分别表示登陆和登出
	public EmployeeModel employee;//员工
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public EmployeeModel getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}
	
}
