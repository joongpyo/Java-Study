package java08; // 제어문 - 조건문 switch 

public class SwitchEx {
	public static void main(String[] args) {
			//일년 동안 읽은 책 수 에 따라 멘트를 출력
		int book=11;
		switch(book/10) {
		case 0: //10권미만
			System.out.println("조금 더 노력하세요");
			break;
		case 1://10<=book<20
			System.out.println("책 읽는 것을 즐기시네요.");
			break;
		case 2: // 20<=book<30
			System.out.println("책을 사랑하시네요.");
			break;
		default://30<=book
			System.out.println("다독왕입니다.");
		
		}
	}

}
