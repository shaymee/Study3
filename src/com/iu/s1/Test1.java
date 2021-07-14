package com.iu.s1;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("===Test1 start===");

		int num1 = 3;
		int num2 = 4;
		
		boolean check = num1 > num2; // boolean의 값은 true or false.
		boolean check2 = num1!=num2; // 프로그램에서 !는 반대(같지 않다)의 의미가 있다.
		boolean check3 = num1 == num2;
		boolean check4 = num1 <= num2;
		
		
		System.out.println(check);
		System.out.println(check2);
		System.out.println(check3);
		System.out.println(check4);
		
	}

}
