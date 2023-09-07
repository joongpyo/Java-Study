package java04; //연산자 연습

public class Just_practice {
	public static void main(String[] args) {
			int a=10; // 1010(2)
			int b=5;  // 0101(2)
			int c=10;
			int d=1;
			boolean b1=true;
			boolean b2=false;
			String s1="kim";
	//단항 연산자
			//부호연산자
			//System.out.println(-a);
			//System.out.println(+a);
			//논리 부정 연산자
			//System.out.println(b1);
			//System.out.println(b2);
			//증감 연산자
			//System.out.println(++a);
			//System.out.println(b++);
			//System.out.println(b);
			
	//산술 연산자
			//System.out.println(a*b);
			//System.out.println(a/b);
	//비교연산자
			//System.out.println(a==b);
			//System.out.println(a<c);
			//System.out.println(a<=c);
			//System.out.println(a!=c);
			//System.out.println(a!=b);
			//문자열 비교 연산
			System.out.println(s1.equals("KIM"));
	//논리 연산자
			//System.out.println(b1&&b2);
			//System.out.println(b1||b2);
			//System.out.println(!b1);
			//비교연산자가 논리연산자의 항이 된 사례
			System.out.println((a>b)||(a>c));
	//비트 연산자 /같냐 다르냐의 문제가 아님 그래서 결과값이 논리형이 아니고 10진법 실수임
		//	System.out.println(a&b);
			//System.out.println(a|b);
			//System.out.println(a^b);
		//	System.out.println(~a);
			//쉬프트 연산자
		//	System.out.println(a<<d);
		//	System.out.println(a>>d);
			
			
			
	}

}
