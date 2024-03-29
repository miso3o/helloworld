package chapter04;

public class WrapperClass02 {

	public static void main(String[] args) {

		String s = "123456";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		// 참고) 반대로 하는 경우(int->String)
		String s2 = String.valueOf(i);
		System.out.println(s2);
		
		// 
		int a = Character.getNumericValue('F');
		System.out.println(a);
		
		
		// 2진수
		String s3 = Integer.toBinaryString(151);
		System.out.println(s3);
		
		// 16진수
		String s4 = Integer.toHexString(255);
		System.out.println(s4);
	}

}
