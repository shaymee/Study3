package com.iu.s1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("== Test8 Start ==");
		
		Scanner sc = new Scanner(System.in);
//  ctrl+/ --> 전체 단일 주석, ctrl+/ --> 주석해제
		int kor = 0; 
		int eng = 0; 
		int math = 0; 
		int total = 0; 
		double avg = 0;

		System.out.println("kor 성적을 입력하세요");
		kor = sc.nextInt();
		System.out.println("eng 성적을 입력하세요");
		eng = sc.nextInt();
		System.out.println("math 성적을 입력하세요");
		math = sc.nextInt();

		// Q) 합격 기준
		// 평균이 60점 이상
		// +과목당 40점 이상
		
		total = kor + eng + math;
		avg = total/3.0;
		boolean check;
		check = kor>=40 && eng>=40 && math>=40;
		
	/** 답안1) if-else문 + 논리연산자 활용
	 	
		if(check) {
			if(avg>=60) {
			System.out.println("합격");
			}			
		} else {
			System.out.println("불합격");
		}
		     */
		
	/* 답안2) if문 + 문자열 + 논리연산자 활용
	 
		String result = "불합격";
		
		if(check && avg>=60) {
			result = "합격";
		}
		
		System.out.println(result); 
			*/
	
//	 강사님 풀이1) 강사님 왈 "이 코드는 너무 복잡한게 단점"
//	 if(avg>=60) {
//		 if(kor>=40) {
//			 if(eng>=40) {
//				 if(math>=40) {
//					 System.out.println("합격");		
//				 } else {
//					 System.out.println("수학 과락 불합격");
//				 } else {
//					 System.out.println("영어 과락 불합격");
//				 } else {
//					 System.out.println("국어 과락 불합격");
//				 }
//			 }
//		 }
//	 }  		

//		강사님 풀이2) 논리연산자 && 활용
				
//		 if(avg>=60) {
//			 if(kor>=40 && eng >=40 && math>=40) {  // 중간에 if-else문이 set
//			 System.out.println("합격");
//		 } else {
//			 System.out.println("불합격");
//		 } else {									// 맨 위, 맨 아래 if-else문이 set
//			 System.out.println("불합격");
//		 }
		
//		강사님 풀이3) &&을 활용해 더 간단히 코드를 표현

		if(avg>=60 && kor>=40 && eng >=40 && math>=40) {
			System.out.println("합격");
		} else { 
			System.out.println("불합격");
		}	 
			 
			 
		System.out.println("== Test8 End ==");

	}

}	
