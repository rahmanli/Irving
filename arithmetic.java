package Javapractice;

public class arithmetic {

	public static void main(String[] args) {
		
					
			int reg=200;
			int ins1=624;
			int ins2=623;
			int dis=10; //mean 10%
			int fee=2300;
			
			/*double save =(fee*dis/100);
			double disamount=fee-save;
			double paid=(reg+ins1+ins2);
			double unpaid=(disamount-paid);*/
						
			double disamount=fee-(fee*dis/100);
			double paid=(reg+ins1+ins2);
			double unpaid=(disamount-paid);
			//double save =(fee*dis/100);
			double save=fee-disamount;
							
			System.out.println("After 10% discount total fee $"+disamount);
			System.out.println("Paid amount $"+paid);
			System.out.println("Unpaid amount $"+unpaid);
			System.out.println("Total save amount $"+save);
			
			

	}

}
