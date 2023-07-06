package com.iu.study4.s2;

public class StudentView {
	
	public void view(Student student) {
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getAvg());
	}
	
	public void view(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
			Student student =students[i];
//			System.out.println(student.name);
//			System.out.println(student.num);
//			System.out.println(students[i].avg);
			this.view(student);
			System.out.println("=======================");
		}
		
	}

}
