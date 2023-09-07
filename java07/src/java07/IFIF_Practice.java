package java07;

import java.util.Scanner;

public class IFIF_Practice {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("당신의 성적");
			System.out.print("점수를 입력하시오:");
			int score=sc.nextInt();
		
			if(score>=90) {
				if(score>=95) {
					System.out.println("A+");
				}
				else {
					System.out.println("A0");
					}
				}
			else if (score>=80){
				
				if(score>=85) {
					System.out.println("B+");
				}
				else{
					System.out.println("B0");
				}
			}
			else {
				System.out.println("C0");
			}
	}
}
