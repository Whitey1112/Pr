package com.pr.pr01;

import java.util.Scanner;

public class EmployeesApp {

	public static void main(String[] args) {
		EmployeeDao employeedao = new EmployeeDao();
		
		while (true) {
			//메뉴 출력
			System.out.println("-------------------------------------------");
			System.out.println("|     1.출근        2. 회원가입       3. 종료  |");
			System.out.println("-------------------------------------------");
			System.out.print("번호를 입력하세요 >> ");
			//입력 값 받고 값에 따른 코드 진행
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 1) {
				//로그인 프로세스
				while(true) {
					System.out.println("오늘 날짜");
					System.out.println("-------------------------------------------");
					System.out.println("|1.나의 근태 확인    2.내 정보 확인 및 수정    3. 종료  |");
					System.out.println("-------------------------------------------");
					System.out.print("번호를 입력하세요 >> ");
					int input01 = sc.nextInt();
					if (input01 == 1) {
						//히스토리 출력 쿼리
						
					}else if (input01 == 2) {
						//내정보 출력 및 수정 쿼리
						
						
					}else if (input01 == 3) {
						System.out.println("로그아웃");
						//종료 프로세스
						break;
					}else{
						System.out.println("번호를 다시 입력해주세요.");
						
					}
				}
				
			}else if (input == 2) {
				while(true) {
					System.out.println("『 회원가입 』");
					System.out.print("▶직원명:");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("▶부서명:" );
					String daprtment_name = sc.nextLine();
					System.out.print("▶ID:");
					String id = sc.nextLine();
					System.out.print("▶PW:");
					String PW = sc.nextLine();
					System.out.print("▶이메일:");
					String email = sc.nextLine();
					System.out.print("▶주소:");
					String address = sc.nextLine();
					System.out.print("▶전화번호:");
					String phonenumber = sc.nextLine();
					System.out.print("▶입사일:");
					String hire_date = sc.nextLine();
					
					int count = employeedao.insertUserVo(null, name, daprtment_name, id, PW, email, address, phonenumber, hire_date );
					
					break;
				}
				
		

			}else if (input == 3) {
				//종료프로세스 
				System.out.println("로그아웃");
				break;

			}else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
		
		
		
		
		
		
	}
}
