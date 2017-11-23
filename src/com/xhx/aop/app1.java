package com.xhx.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class app1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/xhx/aop/beans.xml");
		TestServiceInterface ts = (TestServiceInterface) ac.getBean("proxyFactoryBean");
		ts.SayHello();
		((TestServiceInterface2)ts).SayBye();
	}

}
