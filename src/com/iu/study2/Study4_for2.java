package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		for(int dan=2;dan<10;dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.println(dan+"*"+i+"="+3*i);
//			}
//		}
		
		//종료할 분, 초를 입력받아서
		//해당 분초가 되면 종료
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		
		boolean check=false;
		
		for(int min=0;min<6;min++) {
						
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+":"+sec);
				if(min==m&&sec==s) {
					check=true;
					min=6;
					break;
				}
				
			}
			
//			if(check) {
//				break;
//			}
			
			
		}
		
		
		
		
//		for(int i=0;i<5;i++) {
//			int num= random.nextInt(3);//0 ~3 미만의 정수 한개를 랜덤
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i=5;
//				break;
//				
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
		System.out.println("프로그램 종료");
	}

}
