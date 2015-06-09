package com.rqhr.data.hbm;

import java.util.Date;

import com.rqhr.model.DataModel;

public class WorkAttendanceModel extends DataModel {
	public long id;
	public Date date;
	public Date arriveTime;
	public Date leaveTime;
	public EmployeeModel employee;
	
	
}
