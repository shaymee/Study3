package com.google.s2.zz;

import java.util.Scanner;

public class Test6 {   /** 개쩌는 문제가 있는 Class page */

	public static void main(String[] args) {
		System.out.println("=== Test6 Start ===");
	/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세용");		
		int num = 4; 
		num = sc.nextInt();
		if(num%2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		           */
		
		//Q)kor, eng, math 입력
		//총점, 평균 계산
		//평균이 60점 이상이면 합격, 아니면 불합격을 출력해주세요.		
		
		
		
		Scanner sc = new Scanner(System.in);
		int yKor = 0;
		int yEng = 0;
		int yMath = 0;
		int yTotal = 0;
		double avg = 0;
		System.out.println("kor 성적을 입력하세요");
		yKor = sc.nextInt();
		System.out.println("eng 성적을 입력하세요");
		yEng = sc.nextInt();
		System.out.println("math 성적을 입력하세요");
		yMath = sc.nextInt();

		yTotal = yKor + yEng + yMath;
		avg = yTotal/3.0;
		String result = "불합격";
		
		//Q)단일 if문 만으로 합/불을 구현 할 수 있는가?
		
		if(avg>=60) {
			result = "합격"; //이 조건문이 false가 되면 result 변수값 적용이 안됨!
		}				

		System.out.println(result); /** 개쩌는문제!! 이 문제의 요지 : 코딩은 순서대로 진행된다 + 문자열의 활용 */
		// 프로그램의 원리 : 위에서부터 아래로 내려오는 것. 덮어 씌우기가 가능!
		
	/*	if(yTotal/3 >= 60) {
			System.out.println("^합격^");
			System.out.println("평균:"+avg);
			System.out.println("총점:"+yTotal);
		} else {
			System.out.println("ㅠ불합격ㅠ");
			System.out.println("평균:"+avg);
			System.out.println("총점:"+yTotal);
		}  
		    */
		
		System.out.println("Test6 Finish");
	}   

}
