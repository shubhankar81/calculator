package calculator;

public class calculator {
	
	public void checkNegative(int number) throws Exception {
		if(number<0) {
			throw new Exception("Negatives not Allowed"+ number);
		}
	}
	int add(String numbers) throws Exception {
		int a=0;
		if(numbers.length() == 1) {
			try { 
				a+= Integer.parseInt(numbers) > 1000 ? 0 : Integer.parseInt(numbers) ;
				this.checkNegative(a);
			}catch(Exception e) {
				
			}
		}else if(numbers.contains(",")||numbers.contains("\n")) {
			String num[] = numbers.split(",|\n");
			for(String i: num) {
				a+=Integer.parseInt(i) > 1000 ? 0 : Integer.parseInt(i) ;
				this.checkNegative(a);
			}
		}else {
			String b="0";
			for(int i=0; i<numbers.length(); i++) {
				if(Character.isDigit(numbers.charAt(i))) {
					b+=numbers.charAt(i);
				}else{
					a+= b!= "" ? Integer.parseInt(b) > 1000 ? 0 : Integer.parseInt(b) : 0;
					this.checkNegative(a);
					b="";
				}
				if(i==numbers.length()-1) {
					a+= b != "" ?Integer.parseInt(b) > 1000 ? 0 : Integer.parseInt(b) : 0;
				}
				
			}
		}
		
		return numbers.isEmpty() ? 0 : a ;
	}
	
	public static void main(String ar[]) throws Exception {
		System.out.println("Inside main Block");
		calculator c = new calculator();
		System.out.println("ss" +c.add("//;\\n1;2"));
	}
	
}
