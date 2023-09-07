package java04;  //산술연산자

public class Operator {

	public static void main(String[] args) {
			int a=10; 
			int b=3; 
			double doubleB=3;      //자동형변환
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			System.out.println(a/doubleB); //정수/실수= 실수
			System.out.println(a%doubleB); //정수%실수= 실수
			System.out.println(doubleB%b); //실수%정수= 실수
			
	}

}
