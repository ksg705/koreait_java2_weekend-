package com.kita.second.level2;

public class Mapletest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer();
		Magician mg = new Magician();

//		adv.mp = 10;
		mg.mp = 10;
		
		mg.attack();
//		mg.jump();
		mg.teleport();
	}

}
