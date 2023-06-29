package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int [] nums = new int[6];
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
				//중복 확인 코드
				//i:0 이면 X
				//i:1 이면 0 비교
				//i:2 이면 0,1 비교
				//i:3 이면 0,1,2 비교
				//...
			}
			
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(nums[i]>nums[j]) {
					int tmp=nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		
		
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		

	}

}
