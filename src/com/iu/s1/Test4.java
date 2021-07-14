package com.iu.s1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("===Test4 start===");
		// 10대 유무를 판별 
		// 나이가 10~19(10<=나이<=19)
		// 키보드로부터 나이를 입력 받음
		// 10대면 청소년 출력하고 종료		
		// 아니면 그냥 종료
		
	/**	System.out.println("나이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = 0;
		a = sc.nextInt();
		
		if(a>=20) {
			System.out.println("틀");		
		} else if(a<20) if(10<=a){
			System.out.println("급식");
		} else if(a<=9) {
			System.out.println("잼민이");
		
		}    */
		
		// 1) age<20 으로 우선 걸러진 후 -> 2) 10<=age
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age>=10 && age<20) {           // &&:and 연산(불리언끼리의 연산엔 && 두개), ||:or 연산.
			System.out.println("삐빅- 급식입니다");
		} else if(age>=20) { 
			System.out.println("넌 뭐야? 틀?");
		} else if(age<=10) {
			System.out.println("넌 잼민이구나ㅎ");
		}
		// if문 중괄호를 안치면 바로 다음 줄 한 코드만 실행 됨.
		
	/*	if(age<20) {
			if(age>=10) {
				System.out.println("\"10대입니다\"");								
			}
		}   */
		
		
		
		
		
		
		System.out.println("===Finish===");

	}

}
