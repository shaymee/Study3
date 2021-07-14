package com.google.s3.zz;

public class ForTest2 {

	public static void main(String[] args) {
	
		System.out.println("증감연산자");
		int num=0;
		
		++num;
		System.out.println(num); //1
		
		num++;
		System.out.println(num); //2
		
		int check1 = ++num; // 우측의 결과물 낸 뒤 좌측에 대입
		System.out.println("Num: "+num); //3
		System.out.println("Check1: "+check1); //3
		
		check1 = num++;
		System.out.println("Num: "+num); //4
		System.out.println("Check1: "+check1); // 3 ㅋㅋ
		
		// 단독으로 쓸 땐 선행, 후행 값이 같음
		// But, 다른 애들이랑 쓸 때는 선행, 후행이 의미가 달라짐
		// 선행은 나부터 먼저 1 상승(선행은 제일 먼저), 후행은 대입연산자부터 계산한 후 1상승(후행은 맨 마지막에 하라는 의미)
		
		System.out.println(++num); //5, 1상승 먼저하고 출력
		System.out.println(num++); //5, 출력 먼저하고 그 다음에 1증가시켜라
		System.out.println(num); //6, 윗줄 출력 후 1증가 시켰으니 여기선 6이 나옴
		
		System.out.println("End");

	}

}
