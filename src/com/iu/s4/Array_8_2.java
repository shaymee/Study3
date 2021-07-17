package com.iu.s4;

import java.util.Scanner;		

public class Array_8_2 {

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
		
		int index=0; // 회원탈퇴할 때 필요한 로그인 아이디의 index 정보
		
		boolean turn = true;
		boolean login = false;
				
		while(turn) {			
			if(!login) {
			
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
							index = i;
							System.out.println("***인덱스No. : " +index); // 로그인 성공한 id의 Index No.
						}
					} 
				}
				if(idd&&pww) {
					System.out.println("==로그인 성공==");
					
					login=true;
					
					continue;
					
					
				} else {
					System.out.println("==로그인 실패==");
					System.out.println("==메인페이지 복귀==");
					continue;
				}
					
			} else if(select==2) {
				boolean prodId = true;
				boolean prod = false;
				
				while(prodId) {
						
				System.out.println("생성할 아이디 입력");
				nid = sc.nextInt();
				
					for(int i=0;i<ids.length;i++) {
					  	if(nid==ids[i]) {
					  		prod=true;
					  	} 

					}
					  				
						if(prod) {
							System.out.println("아이디 중복");
							System.out.println("다시 입력");
							
							prod=false;
							continue;
							
						} else if(!prod){ 

							int [] idtwo = new int[ids.length+1];
							int [] pwtwo = new int[pws.length+1];
							
							System.out.println("=사용가능한 아이디입니다=");
							System.out.println("생성할 비밀번호 입력");
							npw = sc.nextInt();
							idtwo[ids.length] = nid;
							pwtwo[pws.length] = npw;
							
							for(int i=0;i<ids.length;i++) {
								idtwo[i]=ids[i];
								pwtwo[i]=pws[i];
							}
							
							ids = idtwo;
							pws = pwtwo;
							
							System.out.println("==아이디 생성 완료==");
														
							break;
							
						}
				}

			
			} else if(select==3) {
				System.out.println("==프로그램 종료==");		
				
				break;
	
					}
				
			
		} else if(login) {
			
			int select2 = 0;
			
			System.out.println("1.로그아웃 2.회원탈퇴 3.종료");
			select2=sc.nextInt();
			
			if(select2==1) { // 1.로그아웃 페이지
				turn = true;
				System.out.println("로그아웃 되셨습니다");
				
				login = false;
				continue;
				
			} else if(select2==2) { // 2.회원탈퇴 페이지
				int[] wdid = new int[ids.length-1];
				int[] wdpw = new int[pws.length-1];
				
				int j = 0;
				
				for(int i=0;i<ids.length;i++) {
					if(i==index) {
						continue;
					}
					
					wdid[j]=ids[i];
					wdpw[j]=pws[i];
					
					j++;
										
				}
					ids=wdid;
					pws=wdpw;
					
					System.out.println("==회원탈퇴 완료==");
					
					login=false;
					
					continue;
				
			} else {
				System.out.println("==프로그램 종료==");	
				break;
	
		}
		
		}
		}
		
		
		
		
		
		
		
		
		System.out.println("=== MOO~YA~HO~~===");
		
	}

}
