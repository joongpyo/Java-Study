package java04; //단항 연산자 - 증감 연산자

public class Operator_ch3 {

	public static void main(String[] args) {
		int a=1; 
		System.out.println(a);
		
		a++; //후위형
		System.out.println(a); //이때 a는 2
		System.out.println(++a);//a의 값 1증가, 전위형:증가가 먼저 이뤄짐
		System.out.println(a++);//후위형: 증가가 나중에 이뤄짐
		System.out.println(a);//13line에서 증가가 되었음으로 출력이 4
	
	
	
	}

}
