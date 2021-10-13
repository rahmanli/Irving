package Javapractice;

public class Lec3ifelsestatement {

	public static void main(String[] args) {
		// if else statement
		/*
		 * Java Conditions and If Statements
		* Less than: x < y
		* Less than or equal to: x <= y
		* Greater than: x > y
		* Greater than or equal to: x >= y
		* Equal to x == y
		* Not Equal to: x != y
		*/
		/*if (condition) {
 			// block of code to be executed if the condition is true
				}
		 */
		
		//print a is greater than equal to b 
		int a=10;
		double b=6.3;
		
		if (a>=b) {
			
			System.out.println(a+" is greater than equal to "+b);
		}

		else if (a>b) {
			
			System.out.println(a+" is greater than equal to "+b);
		}
		
		else {
			System.out.println(b+" is greater than equal to "+a);
		}
		
		
		//print 20 is not equal to 10
		int num3=20;
		int num4=10;
		
		if (num3!=num4) {
			
			System.out.println(num3+" is not equal to "+num4);
		}
		
		/*int num1=10; //data 10 will store in variable num1
		double num2=5.5;
		
		if (num1>num2) {
			
			System.out.println("num1 is greater than num2");
		}
		
		if (num1<num2) {
			System.out.println("num2 is greater than num1");
		}
		
		if (num2<num1) {
			System.out.println("true");
		}
		
*/
		
		
		
		
		
/*	String country1="Bd";
		String country2="USA";
		
		if(country1==country2) {
			System.out.println("same");
			
		}
		else if(country1!=country2) {
			System.out.println("different");
			
		}
		else {
			System.out.println("error");
			}
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
		}*/
		
		
		
		String country1="BD";
		String country2="USA";
		
		
		if(country1==country2) {
			System.out.println("same");
			
		}
		
		else if(country1!=country2) {
		
			System.out.println("different");
			
		}
		else {
			System.out.println("error");
			
		}
		
		
		int i=10;
		int j=20;
		int k=30;
		
		if(i<j)
		{
			System.out.println("less");
			
			
		}
		else if (j>k) {
			System.out.println("greater");
			
		}
		else if(k<i)
		{
			
			System.out.println("wrong");
			
		}
		else if(k<j) 
		{
			System.out.println("error");
			
		}
		else {
			System.out.println("something wrong");
			
		}
		
		
		
		
		
	}

}
