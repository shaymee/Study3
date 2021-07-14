package com.iu.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분초 출력
		//0분0초 0분1초 0분2초 ... 0분59초
		//1분0초 1분1초 1분2초 ... 1분59초
		//...
		//59분0초 59분2초 59분3초 ... 59분59초
		//1시간0분0초(끝부분)
		
		//분, 초를 입력받는다. ex)1분, 10초
		//내가 입력한 분, 초를 받으면 그 즉시 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int inMin = sc.nextInt();
		System.out.println("초를 입력하세요");
		int inSec = sc.nextInt();
	//	boolean flag = true;
		
		for(int min=0;min<60;min++) {			
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
			if(min==inMin && sec==inSec) {
		//		flag = !flag;
				break;
				}
		}
			if(min==inMin)
				break;			
		}		
		
		
		System.out.println("fin.");
	
 }
}
