package classandobjects;

public class TestString {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2 = new String("Hello");
		
		str2.concat(" World");//immutable
		str1.concat(" World");//immutable
		
		String str3=str1.concat(" World");
		String str4=str2.concat(" World");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
		StringBuffer sbuf = new StringBuffer("Hello");
		sbuf.append(" World-sbuf-mutable-append");//mutable
		
		System.out.println(sbuf);
		
	}

}
