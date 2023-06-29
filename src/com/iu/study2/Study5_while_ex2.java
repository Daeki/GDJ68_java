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
		//평타 : 0~10 이하의 공격이 몬스터에게 적용
		//스킬 : 0~30 이하의 공격이 몬스터에게 적용(최대3번까지만)
		//회복 : 회복량 0~40 까지 40X
		//도망 : 50%확률로 성공, 실패
		
		//monster
		//1 : 유저 공격 0~40의 공격을 유저에게
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		int skillCount=3;
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				//Damage
				select = random.nextInt(11);
				monsterHp=monsterHp-select;
				System.out.println("몹에게 "+select+ " 피해를 주었습니다");
				if(monsterHp<1) {
					System.out.println("몹이 죽었어요");
					break;
				}
				
			}else if(select==2) {
				//스킬
				if(skillCount>0) {
					select = random.nextInt(31);
					monsterHp=monsterHp-select;
					System.out.println("몹에게 "+select+ " 피해를 주었습니다");
					if(monsterHp<1) {
						System.out.println("몹이 죽었어요");
						break;
					}
					skillCount--;
				}else {
					System.out.println("마나가 부족합니다");
				}
			}else if(select==3) {
				//회복
				select = random.nextInt(41);
				hp=hp+select;
				if(hp>40) {
					hp=40;
				}
				System.out.println("Hp를 회복했어요");
			}else {
				select = random.nextInt(1001);
				if(select%2 != 0) {
					System.out.println("도망 성공");
					break;
				}else {
					System.out.println("도망 실패");
				}
			}//유저의 끝
			
			select=random.nextInt(41);
			hp=hp-select;
			System.out.println("유저에게 "+select+ " 피해를 주었습니다");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
			
		}//while 끝
		
		
		

	}

}
