package com.iu.s3;

import java.util.Scanner;

public class WhileTest2_RpgHW {

	public static void main(String[] args) {
		
		System.out.println("WhileTest2_RpgHW Start");
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		// 시작하자마자 무한반복을 만든다
		boolean flag = true; // while문을 돌리는 용도로 사용 -> 재활용
		
		while(flag) {
			System.out.println("1.로그인  2.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("ID 입력");
				int yId = sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break; // break를 써서 나왔으니 flag는 true로 빠져나옴 // 대신에 종료도 break로 돼있으면 꼬임
				} else {
					System.out.println("로그인 실패");
					System.out.println("재시도 하시겠습니까?");
				}
				
			} else {
				System.out.println("종료");
				flag = false; // 반복문 종료하는 법: 조건식을 false 만들거나 or break를 쓰거나
			}
		}
		
		//로그인 판단
	//	flag=false; // 강사님tip) 코드입력 다 끝나면 꼭 삭제(코드입력 중 로그인과정 생략을 위해) 
		if(flag) {   // flag를 재활용하니 변수 낭비도 안하고 깔끔하다
			System.out.println("로그인 성공했을 때 실행");
			
			int level = 1; // 초기레벨1
			int gold = 0;  // 초기골드0
			
			for(level=1;level<15;level++) {
				//Gold 지급
				if(level%5==0) {
					gold = gold + level/5*1000;
					System.out.println(level/5*1000+" gold 지급");
				} 
				System.out.println("현재 레벨 : "+level);
				
				//사냥
				for(int mon=0;mon<level*3;mon++) {
				System.out.println(mon+1+" 마리 사냥 성공");				
				}
				System.out.println("==== 축 레벨업 ====");			
			}
			
			System.out.println("최종 레벨 : "+level); //for문 안에서 선언된 변수가 아니라 바깥에서 선언돼서 쓸 수 있음
			gold = gold + level/5*1000;
			System.out.println("최종 Gold : "+gold);
		}	
			
			System.out.println("fin.");
	}

}

