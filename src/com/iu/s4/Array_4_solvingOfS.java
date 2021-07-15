package com.iu.s4;

public class Array_4_solvingOfS {

	public static void main(String[] args) {

		int[] ar1 = new int[4];	
		
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=i+1;
		} // 이렇게 for문을 하나 더 추가하면 변수 하나만 바꾸면 값 전체를 바꿀 수 있다.
		
		int[] ar2 = new int[ar1.length+1];		
		
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=ar1[i];
		} // 깊은 복사(값 복사, 새로운 배열)
		
		ar2[ar1.length]=ar1.length+1;
		ar1 = ar2;	// 얕은 복사(주소 복사)
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]); 
		} // 얕은 복사로 ar2[]의 주소를 참조하게 됨

	}

}
