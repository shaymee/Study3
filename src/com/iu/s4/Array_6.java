package com.iu.s4; //알고리즘: 문제를 어떻게 해결하느냐 and 얼마나 빨리 실행시키도록 하나

public class Array_6 {

	public static void main(String[] args) {
		int [] ar = {3, 5, 1, 7, 4}; // 5개의 data, 크기==5칸
		
//		int idx = 0;
		for(int idx=0;idx<ar.length-1;idx++) {
		for(int i=idx+1;i<ar.length;i++) { // 크기가 5일 때 4번 비교, 6일 때 5번 비교 ...
			if(ar[idx]<ar[i]) {		
				int tmp = ar[i]; // 빈공간 만들어주기
				ar[i] = ar[idx];
				ar[idx] =tmp; 				
			}		// 노트에 바뀌는 값이나 순서 적어보고 코드를 적어넣고 손으로 써보면서 계산하면 이해가 빨라짐. 순서를 써놓고.	
		}
	}
				
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			
	
	
			//정렬
			//방식1. 높은 것에서 낮은 순으로  	:	내림차순 desc(descending) 7, 5, 4, 3, 1
			//방식2. 낮은 것에서 높은 순으로	: 	오름차순 asc(ascending)   1, 3, 4, 5, 7
			//정렬해서 출력하고자 한다
			
			
	}
		System.out.println("fin.");
	}
}