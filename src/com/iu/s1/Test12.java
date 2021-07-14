package com.iu.s1;

public class Test12 { /** switch문 공부 */

	public static void main(String[] args) {
		System.out.println("Test12 Start");
		
		int num = 1;
		/** 메뉴 만들 때 switch문 많이 활용함 */
		switch(num) { // switch(num) <-- 이렇게 해도 됨. 정수식도 어쨌든 숫자 1개만 오게 하면 됨.
		case 1:
			System.out.println("case 1");
			break; // 선택된 지점부터 밑으로 내려오는 건 똑같음. 
		case 2: 	// break를 만나거나 switch의 끝부분( } )을 만나야 종료됨.		
			System.out.println("case 2");
			break; //break 지워도 문법적 오류는 아님. 근데 break가 없으면 계속해서 내려감.
		case 4:
			System.out.println("case 4");
			break;
		default : // switch문에서 default는 if-else문의 else에 해당.
			System.out.println("그외 나머지"); // 꼭 default가 맨 마지막에 와야 되는 건 아님. if-else문과의 차이점
			break; // 마지막에 있는 break는 써도 되고 안 써도 되고.. 
		}
		
		System.out.println("End");
	}

}
