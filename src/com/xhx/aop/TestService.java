package com.xhx.aop;

public class TestService implements TestServiceInterface,TestServiceInterface2{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void SayHello(){
		System.out.println("hi  "+name);
		/*int i=9/0;*/
	}

	@Override
	public void SayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye  "+name);
	}
}
