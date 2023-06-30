package com.iu.study4;

public class Soldier {
	
	String grade;
	int num;
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
	} 

}
