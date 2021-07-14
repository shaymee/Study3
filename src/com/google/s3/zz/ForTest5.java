package com.google.s3.zz;

import java.util.Scanner;

public class ForTest5 { // 이건 내가 문제도 만들고 풀기도 해야됑 ㅠ.ㅠ

	public static void main(String[] args) {
		System.out.println("ForTest5 Start");
		
		Scanner sc = new Scanner(System.in);
			
		//과목수만큼 점수 입력
		//0+30+ 50+ 70
		
		System.out.println("과목수 입력");
		int count=sc.nextInt(); // count 과목수
		int total=0; //총합을 담을 변수
		double avg=0.0; //평균을 담을 변수
		
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번째 점수 입력");
			int point=sc.nextInt();
			total = total+point;
			
		}		
		
		avg=(double)total/count;
		
		//총점 평균 계산 후 출력
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		
		
		
		System.out.println("fin.");

	}

}
