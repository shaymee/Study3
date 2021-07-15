package com.iu.s3;

import java.util.Scanner;

public class WhileTest3 { // 문자열(레퍼런스타입)끼리의 비교

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name = "iu";
		System.out.println(name=="iu"); // 이건 같다(true)라고 이야기 해줌.
		System.out.println("이름을 입력하세요");
		String name2 = sc.next(); // next() 라고 쓰면 키보드로부터 문자열 입력 받을 수 있음
		System.out.println(name==name2); // false라고 나옴

		//문자열(레퍼런스 타입)끼리는 위처럼 쓰면 같을 때도 있고, 다를 때도 있음.
	}

}
