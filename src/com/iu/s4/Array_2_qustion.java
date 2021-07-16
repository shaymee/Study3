package com.iu.s4;

import java.util.Scanner;

public class Array_2_qustion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// $$ 이것도 따로 연습해봐라 머릿속에 박힐 때까지 $$
		
		System.out.println("과목의 수를 입력하세요");
		int count = sc.nextInt();
		int[] nums = new int[count];
		/** 각 인덱스번호에 숫자 입력 */
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+1+" 번째 점수 입력");
			nums[i]=sc.nextInt();
		} 		
		
		//indx 0으로 시작, 1씩
		int total = 0;
		for(int i=0;i<nums.length;i++) {
		System.out.println(i+1+"번째 점수 : "+nums[i]);
		total = total+nums[i]; //누적함수		
		}
		double avg = total/(double)nums.length;		
		// 총점과 평균 출력
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		System.out.println("fin. ");
}

}