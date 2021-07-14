package com.iu.s2;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		System.out.println("ForTest3 Start");
		
		Scanner sc = new Scanner(System.in);		
		
		// 원하는 종료 시간을 입력 받기
		// ex.12초 입력 받으면
		// 0초,1초, ... ,12초 끝
		// 단, 60이라는 상수는 변경 불가능
		
		System.out.println("종료 시간을 입력하세요");
		int cho=sc.nextInt(); // 반복문 영역 밖에 변수 선언
		
//		for(int sec=0;sec>=0;sec++) {		
//			System.out.println(sec+"초");
//			if(sec == cho)
//				sec=sec*9999; // sec=60;이나 sec=59; 넣어도 되네. 오히려 이 코드가 더 깔끔하네.				
//		}
		
		for(int sec=0;sec<60;sec++) {		
			System.out.println(sec+"초");
			if(sec == cho)
				break;  // 오, break 쓰니까 더 편하네. 이건 내일(7/14) 배운데!!
				
		}
		
		
		
		
		System.out.println("fin.");

	}

}
