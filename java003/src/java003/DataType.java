package java003; // 형변환

public class DataType {

	public static void main(String[] args) {
		int a=97;
		float f=a; //묵시적형변환 (자동형변환)
		System.out.println(f);
		char c=(char)a; //명시적형변환(강제형변환)
		System.out.println(c);
		
	}

}
