package com.google.s2.zz;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("Test11 Start");
		
		//Q)국어, 영어, 수학을 Scanner를 통해 입력
		//총점, 평균 계산
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외 나머지는 F를 출력

		Scanner sc = new Scanner(System.in);
		int kor = 1;
		int eng = 1;
		int math = 1;
		int total = 0;
		double avg = 0;
		
		System.out.println("국어 성적을 입력하세요");
		kor=sc.nextInt();
		System.out.println("영어 성적을 입력하세요");
		eng=sc.nextInt();
		System.out.println("수학 성적을 입력하세요");
		math=sc.nextInt();		
		
		total = kor + eng + math;
		avg = (int)(total/3.0*100)/100.0 ; // 소숫점 둘째자리까지만 표현했음!!
		System.out.println("평균: "+avg);
		
		if(avg>=90) {
			System.out.println("부여학점: "+"A");
		} else if(avg>=80) {
			System.out.println("부여학점: "+"B");
		} else if(avg>=70) {
			System.out.println("부여학점: "+"C");
		} else if(avg>=60) {
			System.out.println("부여학점: "+"D");
		} else {
			System.out.println("부여학점: "+"F");
		}
		
		System.out.println("End");

	}

}
