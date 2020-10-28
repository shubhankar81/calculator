package calculator;

public class calculator {

	int add(String numbers) {
		int a=0;
		try { 
			a = Integer.parseInt(numbers);
		}catch(Exception e) {}
		if(numbers.contains(",")||numbers.contains("\n")) {
			String num[] = numbers.split(",|\n");
			for(String i: num) {
				a+=Integer.parseInt(i);
			}
		}
		
		return numbers.isEmpty() ? 0 : a ;
	}
	
	public static void main(String ar[]) {
		System.out.println("Inside main Block");
		calculator c = new calculator();
		System.out.println("ss" +c.add("1,\n"));
	}
	
}
