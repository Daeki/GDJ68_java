package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {
	
	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출
		//2. 학생정보 출력-- SV에서 출력
		//3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		int select=0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students= null;
		
		while(true){
		
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			select = sc.nextInt();
			if(select==1) {
				students= studentService.makeStudents();
			}else if(select==2) {
				studentView.view(students);
			}else if(select==3) {
				//1. findBynum
				Student student = studentService.findByNum(students);
				//2. viewOne
				studentView.view(student);
				
			}else {
				System.out.println("종료 합니다");
				break;
			}
		}
		
		
	}

}
