package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("갤럭시북");
		computer.setCpu("i9");
		computer.setColor("WHITE");
		computer.setPrice(2000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("좋은tv");
		tv.setInch(100);
		tv.setColor("BLACK");
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		phone.setColor("APPLE");
		phone.setModelName("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("PINK");
		phone.setPrice(1800000);
		phone.setPoint(15);
		
		Customer winter = new Customer();
		winter.buy(tv);
		
		//2개
		Product [] products = new Product[2];
		products[0]=tv;
		products[1]=phone;
		
		winter.buy(products);
		
		

	}

}
