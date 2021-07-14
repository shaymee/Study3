package com.google.s3.zz;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		System.out.println("ForTest1 Start");
		
		/** 반복문의 흐름, 순서를 잘 보고 기억해라! */
		//첫번째. 초기식 선언; 두번째. 조건식(true면 { } 실행하러 내려감). 세번째. 영역 끝( } )을 만나면 증감식으로 올라감
		//네번째. 다시 조건식으로 감. 다섯번째. true면 { } 실행하러 감. 여섯번째. 영역 끝( } ) 만나고 다시 증감식으로 올라감
		//일곱번째. 다시 조건식으로 감. ......... 마지막. i=5가 됐을 때(false가 되면) 반복문을 벗어나서 밑으로 내려감. 
		
/**		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요");
		int count = sc.nextInt();
		int num = 0;

		for(int i=0;i<count;i++) {
			System.out.println("Hello"+num); // num 대신 i를 써도 됨
			num++;  // 메모장을 활용해 여러 변수들의 흐름을 파악해봐라. 
						// 익숙해지기전까진 꼭 이 버릇을 들여야 한다. 추측하다가 실수함.(강사님 tip)
		}				// +num 대신 +i를 해도 동일한 결과가 나온다.
						//for(  ) 내에 선언된 변수는 지역 변수라서 영역 밖으로 나오면 int i는 없는 애가 됨
		              // 다시 int i=0; 해도  중복 선언이 아니다!! 
		*/
		
		
		// Q)0-20 미만 사이에 짝수만 출력
		
		/** if문 활용X */
		for(int i=0;i<20;i=i+2) {
			System.out.println(i);
		}
		
		/** if문 활용 */
//		for(int i=0;i<20;i++) {
//			if(i%2==0) 
//			System.out.println(i);
//			
//		}
		
		
		
		
		
		
		System.out.println("End");

	}

}
