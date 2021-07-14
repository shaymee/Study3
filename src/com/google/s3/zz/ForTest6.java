package com.google.s3.zz;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		System.out.println("ForTest6 Start");
		
		Scanner sc = new Scanner(System.in);		
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 PW
		int pw = 5678;
		
		//최대 5번까지 로긴 기회를 줌
		//Q1) 최대 5번 로그인 시도->할수있는 코드를 만들어줘~ 5번 넘어가면 PRGRAM 종료시켜줭
		
		//로그인 성공하면 거기서 종료
		int yId = 0;
		int yPw = 0;
//		int result = 0;
		boolean flag = false; // 꼭 boolean이 아니어도 됨!
		
		for(int i=1; i<=5;i++) {
			if(i != 1) {
				System.out.println(i+"번째 시도");
			}
			System.out.println("ID를 입력하세요");
			yId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			yPw = sc.nextInt();
			
			if(yId==id && yPw==pw) {
				flag = !flag; //!는 부정(반대) 의미 ==> flag에 true를 넣을거에요 라는 뜻
//				result=1;
				break;
			} 			
				
			System.out.println("로그인 실패");
			 
		}//for문의 끝	
			
		//for문 종료 조건: 로그인 성공 or 5번 모두 실패
		
		// flag가 true면 로그인 성공, false면 모두 실패
		
		if(flag) {  // flag 자체가 t/f니까 flag만 넣어도 됨..!
		System.out.println("로그인 성공");
		} else {		
		System.out.println("은행 내방 요망");
		}
		
		// 강사님 say: 필요에 따라 다른 형태의 변수(변수 선언)를 추가해서 신호를 추가할 수도 있어야 함!!
				
		System.out.println("fin.");

	}
// System.out.println("로그인 성공");	
	
}
