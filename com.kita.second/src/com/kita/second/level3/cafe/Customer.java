package com.kita.second.level3.cafe;

public class Customer {
	MenuItem order(Menu menu) {
		return new MenuItem("아메리카노", 1500);
		
	}
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");
	}
}
