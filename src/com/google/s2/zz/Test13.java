package com.google.s2.zz;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("Test13 Start");
		
		// 요금조회는 1번
		// 상품가입은 2번
		// 고장신고는 3번
		// 상담원연결 0번
		// 잘못누르셨 나머지번호
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원 연결은 0번입니다");
		int select=1;
		select = sc.nextInt(); // 또복습)오른쪽이 왼쪽에 담긴다
		
		
		switch(select) {
		case 1: 
			System.out.println("요금조회입니다.");
			break;
		case 2:
			System.out.println("상품가입입니다.");
			break;
		default:
//			int num = 10;
			System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
//			System.out.println("요금조회는 1번, 상품가입은 2번, 고장신고는 3번, 상담원 연결은 0번입니다");
			break;
		case 3:
			System.out.println("고장신고입니다.");
			break;
		case 0:
			System.out.println("상담원 연결입니다.");
			break;
		}
		
		if(select>0) {
			int num2 = 20; // 이 놈을 if문 영역 밖에다 선언하면 쓸 수 있음
		}
		// 중괄호는 영역을 나타냄. 영역이 끝나면 영역 내 선언된 변수도 사라짐. 그러나
		// 그 영역 안에서는 쓸 수 있음(사라지기 전까지는 가능)
		
	//	System.out.println(num2); 
		System.out.println(select);
	//	System.out.println(num); // 왜 select는 출력되는데 num은 출력 안되느냐?
		
		
		
		System.out.println("End");
	}

}
