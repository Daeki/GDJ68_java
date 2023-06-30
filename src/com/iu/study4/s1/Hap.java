package com.iu.study4.s1;

public class Hap {
	
	public int h1(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
	}
	
	public boolean h2(int num) {
		//홀수면 true, 짝수면 false 리턴
		boolean result=false;
		if(num%2 !=0) {
			//result=true;
			result = !result;
		}
		
		return result;
		
	}
	
	public int [] h3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
		//int [] ar = new int[count];
		return new int[count];
	}

}
