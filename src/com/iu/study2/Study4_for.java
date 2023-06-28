package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			
		}
		
		int j=567;
		for(j=3;j>0;j--) {
			
		}
		
		//-------- 
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		
		System.out.println("횟수를 입력");
		int count=sc.nextInt();
		
		for(int c=count;c>0;c--) {
			System.out.println("hello");
		}
		
		
		
		

	}

}
