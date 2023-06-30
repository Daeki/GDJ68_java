package com.iu.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명();
		Rifle rifle = new Rifle();
		
		//멤버들 사용법
		//1. 멤버변수 변수명.멤버변수명
		//2. 멤버메서드 변수명.멤버메서드명()
		
		//메서드 호출
		//rifle.shoot1();
		//rifle.shoot2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 단발 2. 점사");
		int select = sc.nextInt();
		System.out.println("총알 수 입력");
		int b=sc.nextInt();//30
		if(select==1) {
			
			rifle.shoot1(b);
			System.out.println(b);
		}else {
			rifle.shoot2(1, "sss", null);;
		}
		
		

	}

}
