package calculator;

public class calculator {

	int add(String numbers) {
		int a=0,b=0;
		try { 
			a = Integer.parseInt(numbers);
		}catch(Exception e) {}
		if(numbers.contains(",")) {
			String num[] = numbers.split(",");
			a=Integer.parseInt(num[0]);
			b=Integer.parseInt(num[1]);
		}
		
		return numbers.isEmpty() ? 0 : a+b ;
	}
	
	public static void main(String ar[]) {
		System.out.println("Inside main Block");
		calculator c = new calculator();
		System.out.println(c.add("1"));
	}
	
}
