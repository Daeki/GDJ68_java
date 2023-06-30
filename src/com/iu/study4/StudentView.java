package com.iu.study4;

public class StudentView {
	
	//Student 정보를 출력
	//view
	public void view(Student student) {
	
		System.out.println(student.name);
		System.out.println(student.gender);
	}
	
	//viewAll
	//모든 student들 정보를 출력
	//단, viewAll 매개변수는 딱 한개만 선언
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].gender);
		}
	}

}
