package com.iu.s4;

import java.util.Scanner;

public class Array_8 {

	public static void main(String[] args) {
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9854};
		
		//1.로그인
		//2.회원가입(단, 회원가입시 같은 아이디가 있을 때를 처리해야함)
		//3.종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
		int select=0;
		int idx=0;
		int yId=0;
		int yPw=0;
		

		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.종료");
		System.out.println("번호 입력");
		select=sc.nextInt();

		
			if(select==1) {
				System.out.println("아이디 입력");
				yId = sc.nextInt();
				System.out.println("비밀번호 입력");
				yPw = sc.nextInt();
						
				for(idx=0;idx<ids.length;idx++) {					
					if(yId==ids[idx] && yPw==pws[idx]) {
						System.out.println("로그인 성공");					
					} else {								
				System.out.println("=로그인 실패, 선택창으로 넘어갑니다=");
					break;
					}	
				}
				
				
			} else if(select==2) {
				boolean check2=true;

				
				while(check2) {
					System.out.println("희망 새아이디 입력");
					int newId = sc.nextInt();	
					int newPw=0;
					boolean loginSuc = true;
					
					for(idx=0;idx<ids.length;idx++) {
						
						if(newId != ids[idx]) {
							int [] ids2 = new int[ids.length+1];
							int [] pws2 = new int[pws.length+1];
							
							for(int i=0;i<ids.length;i++) {
								ids2[i]=ids[i];
								pws2[i]=pws[i];
							}	
							
							ids2[ids.length]=newId;
						
							System.out.println("희망 새비밀번호 입력");
							newPw = sc.nextInt();
							
							pws2[pws.length]=newPw;
						

								ids = ids2;
								pws = pws2;
								
								yId = newId;
								yPw = newPw;
								
								System.out.println("회원가입 완료, 선택창으로 돌아갑니다");	
					
								break;
						
						} else {
							System.out.println("중복된 아이디. 다시 입력해주세요");
						
							loginSuc=false;
						
							break;
						}
				}
				
					if(loginSuc)
					check2=false;
			}
				
			} else if(select==3){
				
				break;
			}

				continue;
			}
				System.out.println("종료");	
				System.out.println("==fin.==");
		}

	}
