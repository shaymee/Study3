package com.google.s2.zz;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("== Test8 Start ==");
		
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println("== Test8 End ==");

	}

}
