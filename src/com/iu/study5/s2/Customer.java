package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Product product) {
		this.money = this.money-product.getPrice();
		this.point=this.point+product.getPoint();
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
	public void buy(Product [] products) {
		for(int i=0;i<products.length;i++) {
			this.buy(products[i]);
		}
	}
	
//	public void buy(Tv computer) {
//		this.money = this.money-computer.getPrice();
//		this.point=this.point+computer.getPoint();
//	}

}
