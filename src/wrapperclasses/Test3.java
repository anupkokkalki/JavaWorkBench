package wrapperclasses;

public class Test3 {
	public static void main(String[] args) {
		Integer myInt = 100;
		String realString = "200";
		int myInt2 = Integer.parseInt(realString);
		String myString = myInt.toString();
		System.out.println(myString.length());
		System.out.println(myInt + myInt2);
	}
}