package com.iu.study4.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum=50;
		this.instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		staticNum=20;
		//instanceMethod();
		//this.instanceNum=50;
		System.out.println("클래스메서드");
	}

}
