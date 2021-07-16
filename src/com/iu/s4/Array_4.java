package com.iu.s4;

public class Array_4 {
	public static void main(String[] args) {
		int [] ar1 = new int[3];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		// 한번 만들어진 배열은 4칸으로 늘리거나 2칸으로 줄일 수 없다
		
		//ar1에 4라는 data를 추가하고싶음
		//아래 반복문을 돌렸을 때 1,2,3,4가 나오게 하는것
		//꼼수:이미 배열이 만들어져있으니-->새로운 배열을 하나 더 만드는 거
		//깊은복사(배열 복사 응용)
		
		int[] ar2 = new int[ar1.length+1];		
		ar2[ar1.length] = 4;
		
		//for 문 한번 더 들어가야함
		//if문이 필요하다면 써도 됨. 꼭 필요하진 않다고 함
		//이전에 배웠던 것들은 내가 원하는대로 쓰면됨
		//프린트만 하는게 아니라 한개 더 추가해서 배열을 복사하려는 의도
		
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=ar1[i];
		}
		
		ar1 = ar2;
			
		for(int i=0;i<ar1.length;i++) {	
			System.out.println(ar1[i]);
			
			// 코드를 짤 때 , 나중에 데이터 바뀌거나 수정이 일어났을 때를 대비해야함
		} // 이 for문도 main메서드 stack 안에 있는 것. for문도 stack임
		
		
		System.out.println("fin.");
	}
}
