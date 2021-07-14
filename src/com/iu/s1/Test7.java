package com.iu.s1;

public class Test7 {

	public static void main(String[] args) {
		System.out.println("=== Test7 Start ===");
		boolean check=true; // check 자체가 boolean 타입. -> if문에서 실행이 됨
		
		if(check) {			
			System.out.println("조건식이 True입니다");
		}
		
		check=false;
		// check==true : check가 true가 맞습니까? 라는 의미
		if(check) {
			System.out.println("조건식 22222가 true면 실행");
		}
		
		
		
		
		
		System.out.println("=== Test7 Finish ===");

	}

}
