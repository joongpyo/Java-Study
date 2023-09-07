package java08; //내가만들어본 switch 문제

import java.util.Scanner;

public class Switch_practice {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("?저녁메뉴 뭐먹지?");
			System.out.println("한식,일식,중식");
			System.out.print("먹고 싶은 음식의 종류를 적으시오:");
			String food = sc.next();
			switch(food) {
			case "한식":	
				System.out.println("불고기 백반");
				break;
			case "일식": 
				System.out.println("모듬 스시");
				break;
			case "중식":
				System.out.println("마라탕");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
	}

}
