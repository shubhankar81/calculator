package calculator;

public class calculator {
	
	int add(String numbers) {
		int a=0;
		if(numbers.length() == 1) {
			try { 
				a+=Integer.parseInt(numbers);
			}catch(Exception e) {
				
			}
		}else if(numbers.contains(",")||numbers.contains("\n")) {
			String num[] = numbers.split(",|\n");
			for(String i: num) {
				a+=Integer.parseInt(i);
			}
		}else {
			String b="0";
			for(int i=0; i<numbers.length(); i++) {
				if(Character.isDigit(numbers.charAt(i))) {
					b+=numbers.charAt(i);
				}else{
					a+= b!=""?Integer.parseInt(b):0;
					b="";
				}
				if(i==numbers.length()-1) {
					a+= b!=""?Integer.parseInt(b):0;
				}
				
			}
		}
		
		return numbers.isEmpty() ? 0 : a ;
	}
	
	public static void main(String ar[]) {
		System.out.println("Inside main Block");
		calculator c = new calculator();
		System.out.println("ss" +c.add("//;\\n1;2"));
	}
	
}
