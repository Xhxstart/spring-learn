package com.xhx.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.cglib.proxy.MethodProxy;

public class MyMethodBeformAdvice implements MethodBeforeAdvice,AfterReturningAdvice{
	@Override
	/**
	 * method :被调用的方法名
	 * args :给method传递的参数
	 * target :目标对象
	 * 
	 * 
	 * */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("前置记录日志之。。。"+method.getName());

	}
	
	/**
	 * method :被调用的方法名
	 * args :被调用的方法名
	 * arg0 :目标对象
	 * 
	 * 
	 * */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("后置记录日志之。。。"+arg1.getName()+arg2.toString());
	}

	/*@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用方法前");
		Object ob= arg0.proceed();
		System.out.println("调用方法后");
		return ob;
	}
*/
}
