package java07;

import java.util.Scanner;

public class Ifelse_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나의 비만도");
		System.out.print("현재 몸무게:");
		int weight = sc.nextInt();
		if(weight>=67) {
			System.out.println("비만");
		}
		else {
			System.out.println("비만은 아님");
		}
	}

}
