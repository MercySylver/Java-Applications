

import java.time.LocalDate;

public class Demo{

	public static void main(String[] args){
		LocalDate todayDate = LocalDate.now();
		
		System.out.printf("Today's date is %s%n",todayDate);
		
		int result = LocalVariable.myPrintMethod();
		System.out.println(result);
		
	}
	
}