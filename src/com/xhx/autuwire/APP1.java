package com.xhx.autuwire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class APP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/xhx/autuwire/beans.xml");
		Master master = (Master) ac.getBean("master");
		System.out.println(master.getName()+" 养 "+master.getDog().getName());
	}

}
