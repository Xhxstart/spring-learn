package com.xhx.colleotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/xhx/colleotion/beans.xml");
		Department departmentac = (Department) ac.getBean("Department");
		System.out.println(departmentac.getName());
	}

}
