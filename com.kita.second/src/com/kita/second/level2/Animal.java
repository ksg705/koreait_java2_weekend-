package com.kita.second.level2;

public abstract class Animal {
	String name;
	int age;
	private String type;
	public Animal(String name) {
//		super();
		this.name = name;
	}
	void cry() {
		System.out.println("동물이 운다.");
	}
	
	
	private void method() {}
}
