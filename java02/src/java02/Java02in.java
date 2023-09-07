package java02; //입력 메소드
//입력기능을 내코드에 연결시켜줘
import java.util.Scanner;
public class Java02in {

	public static void main(String[] args) {
		//스캐너를 sc라는 이름으로 사용하겠다
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next()); //문자열로 입력
		System.out.println(sc.nextInt()); //정수값으로 입력
		System.out.println(sc.nextFloat()); //실수값으로 입력
		System.out.println(sc.nextLine());//띄어쓰기
	
	}

}
