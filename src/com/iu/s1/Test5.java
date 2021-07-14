package com.iu.s1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("=== Test5 Start ===");
		
	//	
		
	//	System.out.println("ID를 입력하세요");
		// ID 입력 후 저장
	//	System.out.println("PW를 입력하세요");
		// PW 입력 후 저장
		
		// 회원가입시 입력한 ID -> 숫자로(문자열 아직 안 배웠으니까) 
		
		Scanner sc = new Scanner(System.in);
	   	int id = 1234;
		int pw = 5678;
		
		System.out.println("ID를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw = sc.nextInt();

		// 로그인이 성공하면 -> 로그인 성공 출력 , 실패하면 그대로 종료
		
		if(yId==id && yPw == pw) {
			System.out.println("띠링~ 로그인에 성공하셨습니다");
		} else if(yId==id) {
				if(yPw!=pw) {
			System.out.println("비밀번호를 다시 확인해주세요");
			}
		}	else if(yId!=id) {
			System.out.println("존재하지 않는 아이디입니다");
		}             
	
	/*
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		System.out.println("ID를 입력해주세요");			
		int yId = sc.nextInt();
		System.out.println("PW를 입력해주세요");	
		int yPw = sc.nextInt();
		
		if(yId == id && yPw == pw) {
			System.out.println("로그인이 성공했습니다");
		} else {
			System.out.println("로그인에 실패했습니다");
		       */
				
		System.out.println("=== Finish ===");

	}

}
