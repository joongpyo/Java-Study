package java04; //비교 연산자 - 문자열 비교

public class Equality_sign_operator {
	public static void main(String[] args) {
		double a=3.14;
		double b=5.14;
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String a1="Hello JAVA";
		System.out.println(a1 == "Hello JAVA");
		System.out.println(a1.equals("Hello JAVA"));
		System.out.println(a1.equals("hello java"));
	}

}
