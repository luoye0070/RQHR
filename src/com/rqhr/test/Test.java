package com.rqhr.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rqhr.data.dao.impl.SimpleDao;
import com.rqhr.data.hbm.EmployeeModel;
import com.rqhr.data.hbm.TestModel;
import com.rqhr.model.DataModel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session session=sf.openSession();
//		
//		session.beginTransaction();
//		EmployeeModel employeeModel=new EmployeeModel();
//		employeeModel.setUserName("dave1");
//		employeeModel.setPassWord("12446565");
//		employeeModel.setPhoneSn("234536436456");
//		session.save(employeeModel);
//		session.getTransaction().commit();
//		
//		List eList=session.createCriteria(EmployeeModel.class).list();
//		
//		System.out.println("eList:"+eList);
//		
//		session.close();
		
		EmployeeModel employeeModel=new EmployeeModel();
		employeeModel.setId(1);
		employeeModel.setUserName("dave1");
		employeeModel.setPassWord("12446565");
		employeeModel.setPhoneSn("234536436456");
//		
//		EmployeeModel employeeModel1=new EmployeeModel();
//		employeeModel1.setPassWord("12446565");
		
		
		SimpleDao simpleDao=new SimpleDao();
//		System.out.println(simpleDao.delete(employeeModel1)+"-"+employeeModel1.getId());
		
		DataModel result=null;
		System.out.println(simpleDao.findAll(employeeModel,result));
		
		
		System.out.println(simpleDao.save(employeeModel)+"-"+employeeModel.getId());
//		
//		employeeModel.setPhoneSn("134566");
//		System.out.println(simpleDao.update(employeeModel)+"-"+employeeModel.getId());
//		
//		//employeeModel=(EmployeeModel) simpleDao.get(employeeModel.getClass(),16);
//		//System.out.println("get->"+employeeModel.getId());
//		
//		System.out.println("delete->"+simpleDao.delete(employeeModel.getClass(),16));
//		
//		
//		simpleDao.delete(employeeModel);
//		
//		System.out.println("get after delete->"+employeeModel.getId());
//		
//		System.out.println("get->"+simpleDao.get(employeeModel.getClass(),16));
//		
//		simpleDao.delete(new TestModel());
		
	}

}
