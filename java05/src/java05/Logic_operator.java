package java05; // 논리 연산자

public class Logic_operator {
	public static void main(String[] args) {
			boolean a=true;
			boolean b=false;
			boolean c=true;
			
			System.out.println(a&&b);
			System.out.println(a&&c);
			System.out.println((2<4)&&(4<5)); //비교연산자가 논리 연산자의 항으로 올 수가 있는데, 이는 비교연산자, 관계연산자는 결과값이 항상 참혹은 거짓으로 나오기때문
			
			System.out.println(a||b); 
			System.out.println(a||c); 
			System.out.println(b||b); 
			
			System.out.println(!a);
			
	}

}
