package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		Random random = new Random();
		int result = random.nextInt(10);
		
		while(check) {
			System.out.println("0-10미만 숫자 입력");
			int num= sc.nextInt();
			
			if(result==num) {
				System.out.println("정답입니다");
				check=!check;
				break;
			}else {
				System.out.println("틀렸습니다");
			}
			
			
		}//while 끝
		
		

	}

}
