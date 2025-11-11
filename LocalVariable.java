public class LocalVariable{
	boolean isFun; 
	public static void main(String[] args){
		int num = 16;
		
		
		System.out.println("The value of num is "+num);
		
		int result1 = LocalVariable.myPrintMethod();
		System.out.printf("The result1 is %d%n",result1);
		
		int result2 = myMethod();
		System.out.printf("The result2 is %d%n",result2);
		
	}
	
	public static int myMethod(){
		int x = 20;
		return x;
	}
	
	public static int myPrintMethod(){
		int x = 50;
		return x;
	}
	
}