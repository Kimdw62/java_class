package com.wxfx.smart;

public class Child {
	private int age;
	private String name;
	
	public Child(int age, String name) {
		setAge(age);
		setName(name);
//		this.age = age;
//		this.name = name;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
			return;
		}
		this.age = age;
	}
	
	public void setName(String name) {
		if(name == null) {
			this.name = "이름을 확인 하세요!!!";
			return;
		}
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
	}
}
