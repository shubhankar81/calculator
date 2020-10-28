package calculator;

public class calculator {

	int add(String numbers) {
		
		int a=1;
		int b=1;
		return numbers=="" ? 0 : a+b ;
	}
	
	public static void main(String ar[]) {
		System.out.println("Inside main Block");
		calculator c = new calculator();
		System.out.println(c.add("w"));
	}
	
}
