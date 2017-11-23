package com.xhx.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;


public class MyThrowsAdvice implements ThrowsAdvice {
	//异常通知
	public void afterThrowing(Method m,Object[] os,Object target,Exception e){
		
		System.out.println("出事了"+e.getMessage());
	}
}
