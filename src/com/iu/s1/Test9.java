package com.iu.s1;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("== Test9 Start ==");
		boolean check = true;		
		
		check = !check; // 대입. true를 false로 바꿔서 출력하라는 뜻
	
		if(!check) {
			System.out.println("Test");
		} // 이거 출력되는 이유: 위의 check = !check; 대입으로 check가 false로 바뀌어있음. !!!순서대로 해석해라!!! 
		// 지레짐작 하지말고 쓴대로 가는 거다. 코드 하나하나를 신중하게 봐야 된다.
		
		System.out.println(check); // 대입을 하세요가 없이 그대로 check의 값이 내려와서 false가 됨
		
		
		int age = 11; // =은 대입연산자 -> 이건 제일 마지막 순위로 한다(우선순위에서 제일 하위. 우측의 결과물을 마지막에 대입한다)
		
	// 삼항연산자--> 조건식 ? true일 때 실행하는 코드 : false일 때 실행하는 코드
	   String result = age > 19 ? "성년":"미성년"; // =는 오른쪽이 다 끝난 후 대입하라는 의미
	   System.out.println("Result: "+result);
	   System.out.println(3+2); // 우선순위를 따져보자: 괄호 안에 3+2 부터 먼저 하세요 
	   
	   System.out.println("1"+1+1); // 답:111 문자열+숫자=문자열 (+)연산자면 앞에서부터 순서대로 --> "1"+1부터 한다.
	   System.out.println("1"+1*3); 
	   System.out.println('1'+"1"); // 11. primitive 와 reference에서 +는 연결연산자
	   System.out.println(1+'1'+"1"); // i) 1+'1'=>int(4byte)+char(2byte)--> char가 int가 됨-->아스키코드로!!
	   System.out.println(1+'1');
	   
	   // 이 부분은 잘해야함. 데이터타입과 형변환, 변수 선언에 대한 개념을 정확히 알고 있어야 함. 
	   
		System.out.println("== End ==");

	}

}
