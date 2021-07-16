package com.iu.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// $$ 이것도 따로 연습해봐라 머릿속에 박힐 때까지 $$
		
		System.out.println("배열의 크기를 입력하세요");
		int count = sc.nextInt();
		int[] nums = new int[count];
		/** 각 인덱스번호에 숫자 입력 */
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+1+" 번째 번호 입력");
			nums[i]=sc.nextInt();
		} // 내 생각: for문으로 이미 값을 한번 넣어둬서 아래의 for문에서 값이 출력되는거
		

		// index 번호는 0부터 시작, +1씩 증가. <--이 기본개념을 잘 기억
		/** 배열하고 가장 잘 어울리는 것은 반복문 for문! cuz 배열은 횟수가 정해져 있음(크기, 칸수) */
		for(int i=0;i<nums.length;i++) // for문의 조건식에 배열의 크기를 담는 변수를 입력(세련된 방법)
		System.out.println(nums[i]);		
		
		
		System.out.println("fin. ");
	}

}
