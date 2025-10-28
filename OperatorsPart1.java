public class OperatorsPart1{
	public static void main(String[] args){
		int num = 50;
		
		//compound assignment operator
		num += 8;
		System.out.printf("The value of num is %d%n",num);
		
		num -= 7;
		System.out.printf("The value of num is %d%n",num);
		
		num *= 10;
		System.out.printf("The value of num is %d%n",num);
		
		num /= 5;
		System.out.printf("The value of num is %d%n",num);
		
		num %= 3;
		System.out.printf("The value of num is %d%n", num);
		
		//Arithmetic operatorperators
		int num1  = 10;
		int num2 = 4; 
		String name = "Martins";
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int minus = num1 - num2;
		double divide = (double)num1/num2;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("product is %d%n",product);
		System.out.printf("difference btw num1 and num2 is %d%n",minus);
		System.out.println(name + sum);
		System.out.printf("Result is %f",divide);
		
		
		
		
		
		
		
		
		
		
	}
}