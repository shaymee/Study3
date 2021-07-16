package com.iu.s4;

public class Array_3 {

	public static void main(String[] args) {
		
		// 그림을 많이 그려봐라. 이해하기 편하고 나중을 위해서 좋다.
		
		int[] ar1 = new int[2]; // heap영역에 int타입 2칸 만들어서 ar1에 시작 주소를 넣으세요
		ar1[0] = 10;
		ar1[1] = 20;
		
		int[] ar2; // 선언만 해놓음.
		// 얕은 복사(주소를 복사)
		ar2 = ar1; // ar2는 int타입이 아님. int[] 타입임 // ar1 ar2 는 같은 주소를 공유(참조)하고 있음

		System.out.println(ar2[0]); // 내 예상답: 10
		
		ar1[1]=1111;
		System.out.println(ar2[1]); // 예상답: 1111
		// 얕은 복사 , 깊은 복사
		
		int[] ar3 = new int[ar1.length];
		System.out.println(ar3[0]); // ar3가 가리키는 곳에 가서 인덱스 0번을 꺼내세요. 예상답: 0
		for(int i=0;i<ar1.length;i++) {
			// 깊은 복사deep copy(새로운 배열을 만들고, 값을 복사)
			ar3[i]=ar1[i];
		}//for문이 끝나고나서
		System.out.println(ar3[0]); // 예상답:10 
		
		
		ar1[0]=2222;
		System.out.println(ar3[0]); // 예상답:10 ,ar1[0]과 주소가 다르니까(값을 복사한거지, 주소를 복사한건 아님)
		
		
		
		
	/**	int a1 = 10;
		int a2= 0;
		
		a2=a1; // = 는 같다의 의미가 아니라 그냥 대입 연산자다 이걸 꼭 숙지해라 진짜....
		System.out.println(a2); // 10
		
		a1 = 1;
		
		System.out.println(a2); // 10 or 1 ? 내생각엔 1 -> 땡ㅠㅠ  */
		
		System.out.println("fin. ");
	}

}
