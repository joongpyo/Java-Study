package java04; //단항 연산자 - 논리 부정 연산자

public class Logic_operator {

	public static void main(String[] args) {
			boolean a=true;//자바에서 지정한 논리형 값 대소문자를 확실히 구분해야함
			boolean b=false; 
			boolean c=!b; //부정연산자, c변수에 b가 true라면 false, false라면 true 값을 저장함
			System.out.println(a);
			System.out.println(!a);
			System.out.println(b);
			System.out.println(c);
	}


}
