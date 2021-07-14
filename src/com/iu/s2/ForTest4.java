package com.iu.s2;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("ForTest4 Start");
		
		// 1+2+3+4+5=15
		// 1+2+3+...+100,000,000 = ??
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");
		int count = sc.nextInt();
		int total=0;
		
		for(int i=1;i<=count;i++) {
			total = total+i;
			if(i==count)
			System.out.println(total);
		}
		
		System.out.println("total: "+total);
		
		System.out.println("fin.");

	}

}
