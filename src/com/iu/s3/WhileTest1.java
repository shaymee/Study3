package com.iu.s3;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		System.out.println("WhileTest1 Start");
		//0-4까지 출력		
	//	for(int i=0;i<5;i++) {
	//		System.out.println(i);
	//	}
		
		// while문으로
		// while(조건식){}
		Scanner sc = new Scanner(System.in);
		
		boolean check=true;
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료하겠습니다"); //메뉴같은거 만들때, 무한반복 훈련일 때
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break; // 이 break는 반복문 보조문이 아니라 switch 조건문의 예약어(switch에서만 벗어나는 break)
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default : // 여기 안에 break만 쓰면 while에서 못나감
				System.out.println("종료");
				check = !check; // check를 false로 써서 while문 종료하는 방법밖에 안남음2
				break;
			}
//			
			
//			if(select==1) {
//				System.out.println("회원가입 코드 진행");				
//			} else if(select==2) {
//				System.out.println("로그인 코드 진행");
//			} else {
//				System.out.println("종료하겠습니다");
//				check = !check;				
//			//	break; 도 쌉가능 -> 원리: 조건문이 false가 나거나 break;가 입력돼야 해당 조건문 종료
//			}
		}
		
		
		System.out.println("fin.");

		}

}

//boolean check=true;
//while(check) {
//	System.out.println("1. 회원가입");
//	System.out.println("2. 로그인");
//	System.out.println("3. 종료하겠습니다"); //메뉴같은거 만들때, 무한반복 훈련일 때
//	
//}