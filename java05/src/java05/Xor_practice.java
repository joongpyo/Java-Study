package java05;  //비트 연산자

public class Xor_practice {
	public static void main(String[] args) {
			int a=15;//1111(2)
			int b=5;//0101(2)
			//비트 논리연산자
			System.out.println(a&b);//0101(2)=5 둘다 1이여야 1이 됨
			System.out.println(a|b);//1111(2)=15 둘중에 하나만 1이여도 1
			System.out.println(a^b);//1010(2)=10 두개가 다르면 1
			//println은 비트들을 10진수로 표현하는것이 디폴트값임  
			System.out.println(~b);//1010(2)=10x -> -6
			
			//비트 쉬프트 연산자
			System.out.println(a>>2);
			System.out.println(b<<4);
			
	}

}
