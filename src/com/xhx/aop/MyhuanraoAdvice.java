package com.xhx.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyhuanraoAdvice implements MethodInterceptor{
	//环绕通知
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用方法前");
		Object ob= arg0.proceed();
		/*Object ob= null;*/
		System.out.println("调用方法后");
		return ob;
	}

}
