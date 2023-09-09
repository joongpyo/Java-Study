/*
 1. 프로그램명 : UpDownGame (1~100까지 랜덤 숫자 지정)
 2. 작성일자 : 23. 09. 09
 3. 작 성 자 : 신중표
 4. 내   용 : while. if else, random 활용  
 */
package java10;

import java.util.*; //* : util 패키지에 있는 모든 클래스 가져오라는 뜻. 

public class While_random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;
		int user = -1;
		while(user != num) {
			System.out.println("숫자 입력:");
			user = sc.nextInt();
			//user == num
			if(user == num) {
				System.out.println("정답.");
			}
			//user > num : down
			else if (user>num) {
				System.out.println("Down");
			}
			//user < num : up	
			else {
				System.out.println("Up");
			}
			
		
			}
			

		}
		
	}


