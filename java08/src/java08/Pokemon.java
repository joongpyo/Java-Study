package java08; //switch 포켓몬 

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("◇◆◇◆Random Choosing pokemon◇◆◇◆");
		System.out.println("1. 피카츄");
		System.out.println("2. 꼬부기");
		System.out.println("3. 이상해씨");
		int mypokemon=random.nextInt(3)+1; //0~2, +1 => 1~3
		System.out.println("선택된번호:"+mypokemon);
		switch(mypokemon) {
		case 1:
			System.out.println("피카츄 선택");
			break;
		case 2:
			System.out.println("꼬부기 선택");
			break;
		case 3:
			System.out.println("이상해씨 선택");
			break;
			
			
		}
	}

}
