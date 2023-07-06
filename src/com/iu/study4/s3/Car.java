package com.iu.study4.s3;

public class Car {
	String company; //default
	String brand;
	public String color;
	int price;
	
	//생성자(Constructor)
	//접근지정자 클래스명과동일한이름([매개변수들 선언]){}
	public Car() {
		//기본생성자
		
		this("A7");
//		this.company="AUDI";
//		
//		this.color="PINK";
//		this.price=9985;
	}
	
	public Car(String brand) {
		this(brand, "PINK");
//		this.company="AUDI";
//		this.brand=brand;
//		this.color="PINK";
//		this.price=9985;
		
	}
	
	public Car(String brand, String color) {
		this(brand, color, 9985);
//		this.company="AUDI";
//		this.brand=brand;
//		this.color=color;
//		this.price=9985;
	}
	
	public Car(String brand, String color, int price) {
		this.company="AUDI";
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price+"만원");
	}

}
