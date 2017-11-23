package com.xhx.colleotion;

public class Department {
	private String name;
	
	private String age;

	public Department(){
		
	}
	public Department(String name, String age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Department(String name, String age) {");
	}

	public Department(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
