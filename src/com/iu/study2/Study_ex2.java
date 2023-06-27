package com.iu.study2;

import java.util.Scanner;

public class Study_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 Data
		int id=1234;
		int pw=5678;
		
		boolean loginResult=false;//true 로그인성공, false 로그인 실패
		
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인성공, 로그인 실패
		System.out.println("ID를 입력하세요");
		int yId=sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw=sc.nextInt();
		
		if(yId==id && yPw==pw) {
			System.out.println("로그인 성공");
			loginResult=!loginResult;
			//loginResult=true;
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		//--- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1.정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		
		if(loginResult) {
			System.out.println("1.정규직, 2.계약직");
			int select=sc.nextInt();
			System.out.println("급여 입력");
			int salary=sc.nextInt();
			
			switch(select) {
			case 1:
				double tax1 = salary*0.03;
				tax1 = tax1 + salary*0.02;
				tax1 = tax1 + salary*0.01;
				tax1 = tax1 + salary*0.01;
				salary = (int)(salary-tax1);
//				System.out.println("실 급여 : "+salary);
				break;
			case 2:
				salary = (int)(salary*0.967);
//				System.out.println("실 급여 : "+salary);
				break;
			default:
				System.out.println("잘못 눌렀습니다");
				loginResult=false;
			}
			
			if(loginResult) {
				System.out.println("실 급여 : "+salary);
			}
		}
		
		System.out.println("프로그램이 종료");
	}

}
