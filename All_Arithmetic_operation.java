package Javapractice;

public class All_Arithmetic_operation {

	public static void main(String[] args) {
		
		// Arithmetic Operations(addition,subtraction,multiplication,division,modulus,increment, decrement)

		int j=3;
		int k=5;
		int n=15;
				
		for (int i=1; i <=n; i++)
		{
			if (i%j==0 && i%k==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (i%j==0) {
				System.out.println("Fizz");
			}
			else if (i%k==0) {
				System.out.println("Buzz");
			}
					
			else {
				System.out.println(i);
			}
		}
		
		

	/*	int number1=10;
		double number2=3;

		//addition

		double add=number1+number2;
		System.out.println("Total number after addition is $"+add);

		//subtraction

		double sub=number1-number2;
		System.out.println("Total number after subtraction is $"+sub);

		//multiplication
		double mul=number1*number2;
		System.out.println("Total number after multiplication is $"+mul);

		//division
		double div=number1/number2;
		System.out.println("Total number after division is $"+div);

		//modulus
		double mod=number1%number2;
		System.out.println("Total number after modulus is $"+mod);

		//increment by 1  
		int inc1=2;
		//inc1++;
		inc1=inc1+1;
		System.out.println("After increment by 1 total: "+inc1);

		//increment by 10
		int inc2=5;
		inc2=inc2+10;
		//inc2+=10;
		System.out.println("After increment by 5 total : "+ inc2);

		//decrement by 1
		int dec1=5;
		//dec1=dec1-1;
		dec1-=1;
		System.out.println("After decrement by 1 total: "+dec1);

		//decrement by 5
		int dec2=25;
		//dec2=dec2-5;
		dec2-=5;
		System.out.println("After decrement by 5 total: "+ dec2);


		
	//sayem vai korte diyechilen amader fee niye	
		
		int reg=200;
		int ins1=624;
		int ins2=623;
		int dis=10; //mean 10%
		int fee=2300;
		
		/*double save =(fee*dis/100);
		double disamount=fee-save;
		double paid=(reg+ins1+ins2);
		double unpaid=(disamount-paid);*/
					
	/*	double disamount=fee-(fee*dis/100);
		double paid=(reg+ins1+ins2);
		double unpaid=(disamount-paid);
		//double save =(fee*dis/100);
		double save=fee-disamount;
						
		System.out.println("After 10% discount total fee $"+disamount);
		System.out.println("Paid amount $"+paid);
		System.out.println("Unpaid amount $"+unpaid);
		System.out.println("Total save amount $"+save);
		
		

*/



}

}
