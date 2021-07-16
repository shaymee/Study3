package com.iu.s4;

import java.util.Scanner;		

public class Array_8_1 {

	public static void main(String[] args) {
		//1.로그인
		//2.회원가입(단, 회원가입시 같은 아이디가 있을 때를 처리해야함)
		//3.종료
		
		int [] ids = {1111, 2222, 3333, 4444};
		int [] pws = {1112, 2223, 3334, 4445};
		
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		int yid = 0;
		int ypw = 0;
		int nid = 0;
		int npw = 0;
		
		boolean turn = true;
				
		while(turn) {			

			System.out.println("1.로그인  2.회원가입  3.종료");
			select = sc.nextInt();		
			
			if(select==1) {			 	
				System.out.println("아이디 입력");
				yid=sc.nextInt();
				System.out.println("비밀번호 입력");
				ypw=sc.nextInt();	
				
				boolean idd=false;
				boolean pww=false;

				for(int i=0;i<ids.length;i++) { 
					if(ids[i]==yid) {
						idd=true;
						if(pws[i]==ypw) {
							pww=true;
						}
					} 
				}
				if(idd&&pww) {
					System.out.println("로그인 성공");
					turn=false;
				} else {
					System.out.println("로그인 실패");
					System.out.println("메인페이지 복귀");
					continue;
				}
					
			} else if(select==2) {
				boolean prodId = true;
				
				while(prodId) {
				
				System.out.println("생성할 아이디 입력");
				nid = sc.nextInt();
				
					for(int i=0;i<ids.length;i++) {
						if(nid==ids[i]) {
							System.out.println("아이디 중복");
							System.out.println("다시 입력");
							
							break;
						} else { 

							int [] idtwo = new int[ids.length+1];
							int [] pwtwo = new int[pws.length+1];
							
							System.out.println("생성할 비밀번호 입력");
							npw = sc.nextInt();
							idtwo[ids.length] = nid;
							pwtwo[pws.length] = npw;
							
							for(i=0;i<ids.length;i++) {
								idtwo[i]=ids[i];
								pwtwo[i]=pws[i];
							}
							
							ids = idtwo;
							pws = pwtwo;
							
							System.out.println("아이디 생성 완료");
														
							prodId = false;
							
							break;
							
						}
						
						
					}
						
			}
			
				} else {
					System.out.println("종료");		
					break;
	
				}
			
			
		}
		
		
		
		System.out.println("===MOOYAHO~===");
		
	}

}
