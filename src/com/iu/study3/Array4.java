package com.iu.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		System.out.println("지울려고하는 idx번호를 입력하세요");
		int idx = sc.nextInt();
		
		int [] copyNums = new int [nums.length-1];
		
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(idx==i) {
				continue;
			}
			copyNums[index]=nums[i];
			index++;
		}
		
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		
		
		
		

	}

}
