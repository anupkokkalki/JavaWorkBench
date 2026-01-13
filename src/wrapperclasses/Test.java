package wrapperclasses;

public class Test {
	
	Integer i1 = Integer.valueOf(10);
	Double d1 = Double.valueOf(12.33);
	
	Float  i2 = i1.floatValue();
	String s1 = d1.toString();
	
	Double d2 = Double.parseDouble(i1.toString());
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println(t.i1);
		System.out.println(t.d1);
		System.out.println(t.s1);
		System.out.println(t.i2);
		System.out.println(t.d2);
		// TODO Auto-generated method stub

	}

}
