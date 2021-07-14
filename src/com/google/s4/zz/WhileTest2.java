package com.google.s4.zz;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");					
				
		//1번 누르면 로그인
		// -> id, pw 입력창
		// -> 로그인 판단
		// -> 로그인 성공하면 그 즉시 종료
		// -> 로그인 실패시 다시 로그인 or 종료 나오는거		
		//2번 누르면 즉시 종료 
		
		// 틀렸을 경우에 나가고 싶을 때 나갈 수 있게
		// 로그인이 성공했을 때 게임을 시작
		// rpg 게임
		// 최초레벨은 1부터 시작, 만렙은 15
		// 렙1일때 최초gold:0
		// 렙 5를 달성했을때 1000gold 받음
		// 레벨10을 달성했을때 2000gold 받음
		// 레벨 15(만렙)를 달성했을때 3000gold 받음
		
		// 모든 몬스터의 경험치는 동일(1->2 : 3마리, 2->3 :6마리, 3->4 : 9마리 , ... 14->15 : 42마리)
		// ex) 1->2:3마리
		// 몬스터1마리 사냥 출력
		// 몬스터2마리 사냥	 출력
		// 몬스터3마리 사냥 출력
		// 축하! 레벨업! 2렙이 됐어용! 출력
		// 2->3: 6마리
		// 몬스터1마리 사냥 출력
		// 몬스터2마리 사냥 출력
		// 몬스터3마리 사냥 출력
		// 몬스터4마리 사냥 출력
		// 몬스터5마리 사냥 출력
		// 몬스터6마리 사냥 출력
		// 레벨업!
		//15가 되는 순간 끝
		//최종적으로 게임이 다끝나면 
		// 최종레벨 출력
		// 최종보유gold 출력(0+1000+2000+3000=6000gold)
		
		Scanner sc = new Scanner(System.in);				
		int id = 1234;
		int pw = 5678;
		
		int yId = 0;
		int yPw = 0;
		boolean flag = true;
		//boolean check = yId==id && yPw==pw;
		
		while(flag) {
			System.out.println("1번-로그인, 2번-게임 종료");
			int select = sc.nextInt();
			
			if(select==1) {
			System.out.println("아이디를 입력해주세요");	
			yId = sc.nextInt();
			System.out.println("패스워드를 입력해주세요");
			yPw = sc.nextInt();			
			
				if(yId == id && yPw == pw) {
					System.out.println("로그인에 성공하셨습니다");
					break;
					
				} else {
					System.out.println("로그인에 실패하셨습니다");
					System.out.println("다시 로그인 하시겠습니까?");
				}	
			
			} else if(select==2) {
				System.out.println("프로그램을 종료합니다");
				break;
			
			}
			
		}
			
		if(yId == id && yPw == pw) {
			
			int level=0;
			int num=15;
			
			System.out.println("게임을 시작하겠습니다");
			System.out.println("당신의 시작레벨은 1입니다. 사냥을 시작합니다");	
			
			for(level=1;level<=num;level++) {	
				int yLev=level;		
				int monster=0;

				
				if(level==num) {
					System.out.println("!!! 게임 클리어 !!!");
					System.out.println("최종레벨: "+yLev);
					int sum=0;
					for(int i=1;i<=(yLev+1)/5;i=i+1) {
						sum=sum+i;						
						if(i ==(yLev+1)/5)
							System.out.println("최종골드: "+sum*1000);
				}
				
					break;
				}

				if(yLev<num) {
					for(monster=1;monster<=level*3;monster++) {
						System.out.println(monster+"번째 몬스터 처치");											
				}
					System.out.println("축하합니다! "+(yLev+1)+" 레벨 달성!");
						if(yLev%5 == 4) {
							int getlev = yLev+1;
							int gold = getlev*200;		
							
							System.out.println(getlev+" 레벨 특전: "+"+"+gold+" Gold 지급");
										
						}						
			}						
		}					
		}
		System.out.println("fin.");

	}
}