package com.iu.s1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("Test10 Start");
		
		Scanner sc = new Scanner(System.in);
		int select = 1;
		System.out.println("희망하시는 항목을 입력하세요");
		select = sc.nextInt();
		
		if(select==1) {
			System.out.println("입금");
		} else if(select==2){
			System.out.println("출금");
		} else if(select==3){
			System.out.println("이체");
		} else {
			System.out.println("조회");
		} 
		
		
		
		System.out.println("End");

	}

}
