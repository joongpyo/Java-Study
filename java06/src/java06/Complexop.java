package java06; //복합대입연산자 1

public class Complexop {
	public static void main(String[] args) {
			int x=10;
			x=x+10;                      //x=20 오른쪽 먼저 계산하고 왼쪽은 마지막에 저장(연산자 우선순위)
			System.out.println(x);
			
			int y=10;
			y+=10;                     //y=y+10 순서중요
			System.out.println(y);
	}

}
