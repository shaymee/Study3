package com.iu.s4;

import java.util.Scanner;

public class Array_5 { /** 이건 혼자 꼭 다시 해봐.... */

	public static void main(String[] args) {
		
		//1. 정보출력 : n칸짜리 배열 출력
		//2. 정보추가 : 추가할 숫자를 입력하세요->한칸 늘리고 추가할 숫자 삽입
		//3. 정보삭제 : 이 배열 마지막 값 삭제하고 한칸 줄이는 것 --> 0칸되면 "더이상 지울 데이터가 없습니다" 출력
		//4. 종료
		Scanner sc = new Scanner(System.in);		
		
		int select = 0;
		boolean flag = true;
		int[] ar = {45, 52, 76}; 
		int[] ar2 = new int[ar.length+1];
		
		for(int i=0;i<ar.length;i++) {
			ar2[i]=ar[i];
		}
		// 써야할 값이 정해져있다면 윗줄처럼 이런 식으로도 쓸 수 있음. 미리 세팅 가능 
		//int[] ar = new int[3];
		//ar[0]=45;
		//ar[1]=52;
		//ar[2]=76; 이거랑 같은 의미. 근데 나중엔 잘 안 쓴다고 함
		
		while(flag) {
			System.out.println("숫자를 입력하세요");
			select = sc.nextInt();
			switch(select) {
			case 1 : 
				for(int i=0;i<ar.length;i++) {
					System.out.println("ar["+i+"] : " + ar[i]);
					if(i == ar.length-1) {
						System.out.println("배열 크기 : " + ar.length);	
					}				
				}
				break;
			case 2 : 
				System.out.println("추가할 숫자를 입력하세요");
				ar2[ar.length] = sc.nextInt();
				ar=ar2;
				break;
			case 3 :
				System.out.println("3. 정보 삭제");			
				break;
				
			default :
				System.out.println("4. 종료");
				flag=false;
			
			}
		}
		
		
// if(ar.length==0){
//		continue // break 해도 된대
//		
		
		
//		while(flag) {
//			if(num==1) {
//			System.out.println("1.정보출력 2.정보추가 3.정보삭제 4.종료");
//			System.out.println("숫자를 입력하세요");
//			num = sc.nextInt();
//			System.out.println("정보를 출력합니다");
//			} else if(num==2) {
//			System.out.println("정보를 추가합니다");
//			} else if(num==3) {
//			System.out.println("정보를 삭제합니다");
//			} else {
//			System.out.println("프로그램을 종료합니다");	
//			flag = false;
//			}
//			
//		}
		
		System.out.println("fin.");
	}

}
