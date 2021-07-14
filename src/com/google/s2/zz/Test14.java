package com.google.s2.zz;

public class Test14 { /** switch문의 응용 문제 */

	public static void main(String[] args) {
		System.out.println("Test14 Start");

		int avg = 97;
		
		switch(avg/10) {
	//	case 10: // break가 없으니 break가 있는 case 9까지 내려가서 끝남. 그 과정에서 print A가 출력됨.
				// switch문에 대한 이해를 묻는 문제: 코딩은 위에서 아래로 순차대로 움직이는 놈이다 진짜..!!
		case 9, 10:		// 와, 그냥 반점 찍는것도 되네 ㅋㅋㅋ	
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:	
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;				
		}	
		
		
		System.out.println("End");
	}

}
