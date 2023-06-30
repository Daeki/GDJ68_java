package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		//
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);
		
		//h2 결과 출력
		boolean check = hap.h2(20);
		System.out.println(check);
		//h3 length 출력
		int [] ar = hap.h3(7);
		System.out.println(ar.length);
		//*2
		System.out.println(sum*2);

	}

}
