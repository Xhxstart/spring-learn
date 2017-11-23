package com.xhx.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class APP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/xhx/dispatch/beans.xml");
		DBUtil db = (DBUtil) ac.getBean("dbutil2");
		System.out.println(db.getName()+" 养 "+db.getDrivername());
	}

}
