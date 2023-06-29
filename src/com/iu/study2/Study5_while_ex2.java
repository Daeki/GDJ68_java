package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		//TRPG
		int hp=40;//유저의 HP
		int monsterHp=60;//몬스터의 HP
		int monsterPower=40;//몬스터의 공격력
					
				
		//유저정보 : hp, 몬스터 정보 :hp
		//1.평타 2.스킬 3.HP회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대3번까지만)
		//회복 : 회복량 0~40 까지 40X
		//도망 : 50%확률로 성공, 실패
		
		//monster
		//1 : 유저 공격 0~40의 공격을 유저에게
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				//Damage
				select = random.nextInt(11);
				monsterHp=monsterHp-select;
				System.out.println("몹에게 "+select+ " 피해를 주었습니다");
			}else if(select==2) {
				//스킬
			}else if(select==3) {
				//회복
			}else {
				//도망
				break;
			}
			
		}
		
		
		

	}

}
