package java07;//조건문 - else if문

import java.util.Scanner;

public class If_elseif {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			int age;
			System.out.println("※ 나이별 버스 요금 안내 ※");
			System.out.println("나이:");
			age=sc.nextInt(); 
			
			if(age>19) {
				System.out.println("성인 입니다");
				System.out.println("성인 요금이 적용됩니다");
			}
			else if(age>13) { //13<age<19
				System.out.println("청소년 입니다");
				System.out.println("청소년 요금이 적용됩니다");
			}
			else if(age>8) { //8<age<13
				System.out.println("어린이 입니다");
				System.out.println("어린이 요금이 적용됩니다");
			}
			else { //age<=8
				System.out.println("유아 입니다");
				System.out.println("유아 요금이 적용됩니다");
			}
			
			System.out.println("결제를 진행해 주세요.");
	}
	

}
