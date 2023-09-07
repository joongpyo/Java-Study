package java07; //조건문 - 중첩if문

import java.util.Scanner;

public class If_if {
	public static void main(String[] args) {
			String id,password;
			Scanner input = new Scanner(System.in);
			System.out.print("아이디를 입력해주세요:");
			id=input.nextLine();
			
			if(id.equals("진채영")) {
				System.out.println("id 일치");
				System.out.print("비밀번호를 입력해주세요:");
				password=input.nextLine();
				if(password.equals("사랑해")) {
					System.out.println("passworkd 일치");
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("password 불일치");
				}
				
			}
			else {
				System.out.println("id 불일치");
			}
				
	}	

}
