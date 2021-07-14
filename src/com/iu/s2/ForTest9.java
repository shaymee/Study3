package com.iu.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Test");
		// https://github.com/Daeki <-- 다른 답안 보고 싶으면 여기로 들어가~!

		
		
		//FPS
		// 탄창 3개
		// 한 탄창에 30발
		// 단발모드(방아쇠 한번에 1발 소비), 점사모드(방아쇠 한번에 3발 소비)
		// 프로그램 시작할때 물어봄 1번->단발?. 2번-> 점사?
		// 1번- 탕! 소리 *30번
		// 한탄창 비우면
		// 두번째 탄창 갈아낄때 또 물어봄 단발? 점사?
		// 2번 - 타타탕 *10번
		// 세번째 탄창 갈아낄때 또 물어봄. 단발? 점사?
		
		Scanner sc = new Scanner(System.in);

//		int num = 0;
			
//		for(int i=1;i<4;i++) {
//			System.out.println("모드를 선택하세요");
//			System.out.println("1번:단발모드, 2번:점사모드");
//			num = sc.nextInt();
//			if(num==1) {		
//				for(int tan=1;tan<31;tan++) {
//					System.out.println("탕!"+tan+"번째");
//				} 
//				
//			 } else if(num==2) {
//					for(int tata=1;tata<11;tata++) {
//						System.out.println("타타탕!"+tata+"번째");
//					}
//				}
//			}
		
// 자꾸 바뀌는 건 변수로 사용하세요!
		
		for(int tan=0;tan<3;tan++) {
			System.out.println("1. 단발 : 2. 점사");
			int select = sc.nextInt();
			String sound = "탕";
			int num = 1;
			if(select != 1) {
				sound="타타탕";
				num=3;
			}		
			for(int i=0;i<30;i=i+num) {
				System.out.println(sound);
			}
		}		
		
		
		System.out.println("게임종료");
				
		System.out.println("fin.");

	}

}

//for(int tan=0;tan<3;tan++) {
//	System.out.println("1. 단발 : 2. 점사");
//	int select = sc.nextInt();
//	
//	for(int i=0;i<30;i++) {
//		if(select==1) {
//			System.out.println("탕!");
//		} else if(select==2){
//			i=i+2;
//			System.out.println("타타탕!");					
//		}
//	}
//}		



//for(int tan=0;tan<3;tan++) {
//	System.out.println("1. 단발 : 2. 점사");
//	int select = sc.nextInt();
//	String sound = "탕";
//	int count = 30;
//	if(select != 1) {
//		sound="타타탕";
//		count=10;
//	}		
//	for(int i=0;i<count;i++) {
//		System.out.println(sound+count+"번째");
//	}
//}		