package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		//배열(arrya)
		int num=0;
		int num2=2;
		double d=3.12;
		
		//데이터타입 변수명
		//모을려고하는 데이터타입 [] 변수명 = new 모을려고하는데이터타입[갯수];
		int [] nums = new int [2];
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);
		System.out.println(nums);
		//배열 사용 : 배열의변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);
		//문자열 3개를 모을 배열 선언
		String [] names = new String[3];
		System.out.println(names);
		System.out.println(names[0]);
		
		int [] nums2 = {1,2,3};
		
		int nums3 [] = new int [3];
		
		

	}

}
