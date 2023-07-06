package com.iu.study4.s4;

public class Product {
	
	private String name;
	private int price;
	
	public void setPrice(int price) {
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
	}
	
	public int getPrice() {
		if(price<1) {
			this.price=1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}

}
