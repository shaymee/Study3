package com.iu.s4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) { //변수명 args, args의 데이터타입은 String[]
		System.out.println("Array_1 Start");
		
		//11, 20, 32 <- 리터럴(상수형)
//		int num1 = 11;
//		int num2 = 20;
//		num2 = 30; // 20의 data는 사라짐 -> 변수 하나에는 하나의 data만 다룰 수 있음
		
		//(모으려고 하는)데이터타입 [] 변수명; = new 모으려고하는데이터타입[모으는 갯수];
		int [] numbers = new int[3]; // 아직은 모은게 아니라 모으려고 하는 준비. 3칸짜리 집합을 만든 것.
		
		//numbers의 데이터타입은?? int[] ->int배열 타입 (절대 int타입 아님!)
		
		System.out.println(numbers); // int[]을 가리키는 주소가 들어가 있음. [I@123a439b
		
		numbers[0]=10; // 몇번째 칸을 쓸거냐~ 0-> 첫번째 칸, numbers[0]까지는 int type임. 그래서 int값 넣을 수있다
		numbers[1]=20; //
		numbers[2]=30; //
		//10,20,30이란 값을 numbers 변수 하나로 핸들링할 수 있음

		System.out.println(numbers[0]); // 10
		System.out.println(numbers[2]); // 30
		
		System.out.println("배열의 크기: " + numbers.length); // 배열의 크기가 몇칸이냐? -> 3, length는 int형?
		
		System.out.println("------구분선------");
		
		/** q) 3.12, 2.3, 4.123, 5.0 을 담을 수 있는 배열 선언하고, 데이터 대입 */
		double[] nums = new double[4];
		nums[0]=3.12;
	//	nums[1]=2.3;
		nums[2]=4.123;
		nums[3]=5.0;
		
		System.out.println(nums[0]); // 3.12
		System.out.println(nums[1]); // 자동값 0.0
		System.out.println(nums[2]); // 4.123
		System.out.println(nums[3]); // 5.0
		System.out.println("배열의 크기: " + nums.length); // 4

		//그렇다면 nums[4]의 값은?
//		System.out.println(nums[4]); // --> error 발생. why? 4번index로 가면 "없음!" ->그래서 error 발생
		
		/** q)문자열을 담을 배열 3칸짜리를 생성하고
		      아무것도 담지 말고 모두 출력해보세요 */
		String[] words = new String[3];
		System.out.println(words[0]); // -> 값: null
		System.out.println(words[1]); // -> 값: null
		System.out.println(words[2]); // -> 값: null
		
		/** q)Scanner 타입을 모을 배열 2칸짜리를 생성해서
		      입력 없이 모두 출력	*/
		Scanner[] scn = new Scanner[2];
		System.out.println(scn[0]); // null : Reference type임 -> 레퍼런스타입 초기값은 전부 null
		System.out.println(scn[1]); // null
		// 내가 모으려하는 데이터타입의 제한이 없다(배열에는 데이터타입의 제한은 X)
		// 원칙은 같은 데이터타입끼리 모을 수 있다
		
		
		
		
		System.out.println("fin. ");

	}

}
