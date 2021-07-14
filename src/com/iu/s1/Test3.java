package com.iu.s1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("===Test3 start===");
		// Q)쇼핑몰의 총주문금액 입력
		// 총주문금액이 30000원 이하면 배송비 3000원이 추가됨 else 0원
		
		// 총주문금액 출력
		// ex) 총주문금액 : 25000 -> 28000 출력
		// ex) 총주문금액 : 35000 -> 35000 출력
		
	/**	
		int A = 65000; // 총주문금액을 담을 변수
		System.out.println("총주문금액을 입력하세요!");
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		
		// 배송비 3000원 추가 코드
		if(A<=30000) {
			int A1 = A + 3000;			
			System.out.println("최종결제금액:"+A1+"원");
			System.out.println("배송비 +3000원");
		} else {	
			int A2 = A;			
			System.out.println("최종결제금액:"+A2+"원");
			System.out.println("배송비 무료!");
		}   */

		Scanner sc = new Scanner(System.in); // 실행 중에 데이터 키보드로부터 입력 받을 방법, 준비
		
		System.out.println("주문금액을 입력하세요");
		int price = 35000;
		price = sc.nextInt(); // 콘솔창에 입력 받을 때까지 기다리고 있음
		if(price <= 30000) {
			price = price + 3000;
		}
		System.out.println("총금액 : "+price);
		
		
		
		
		System.out.println("===Test3 finish===");
	}

}
