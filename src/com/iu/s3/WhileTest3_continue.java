package com.iu.s3;

public class WhileTest3_continue {

	public static void main(String[] args) {
				
		for(int i =0;i<10;i++) {
			
			if(i%2 != 0) {
				 // 홀수
				continue; // 홀수일 때는 밑으로 가지말고 즉시 다시 위의 증감식으로 올라가세요라는 뜻
							// 가끔 쓰는 거라고 하셨음
			}
			
			System.out.println(i); // 짝수
		}

	}

}
