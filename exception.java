package Javapractice;


		// 
	import java.util.ArrayList;

		public class exception{

			public static void main(String[] args) {
				
				int $num = 0;
				int $Nn= 2;
				int $m = 3;
				/*
				 * Try...Catch Syntax Below:
				 * try {
					  //  Block of code to try
					}
					catch(Exception e) {
					  //  Block of code to handle errors
					}
				 */
				
				//Start try...catch block
				
				/*try {
					int[] $num = {1,2,3};
					System.out.println($num[7]);
				}
				catch(Exception e) {
					System.out.println("Something Went Wrong in line 190r20");
				}
				*/
				//End try...catch block
				
				//Start New try...catch block
				
			
				try {
					ArrayList<String> Names = new ArrayList<String>(); //ArrayList declaration

					//Start Code area for adding elements into the ArrayList
					// Here I have used add(Value) method to add elements in the ArrayList.
					
						Names.add("Anna");
						Names.add("Caitlyne");
						Names.add("Elizabeth");
						Names.add("Liza");
					
					//End Code area for adding elements into the ArrayList	
						Names.remove(3);
						System.out.println(Names.remove(2)); // Code line to print ArrayList
						Names.get(2);
				}
				catch (Exception e) {
					System.out.println("You Have Deleted That Index!");
				}
				
				//End of try...catch block
				
				//Start try...catch...finally block
				/*	int $num = 0;
				int $Nn= 2;
				int $m = 3;*/
				
				
				
				try {
					if ($num == 0) {
						$num ++;
					}
					else if ($num==1)
					{
						$num = $num + $Nn;
						System.out.println($num);
					}
					else {
						System.out.println($num--);
					}
					/*for (int $even = 1; $even > 10; $even = $even+2) {
						System.out.println("Even is: " + $even);
						// There is no wrong in this code so "catch" statement is not going to execute 
				}*/
				}
				catch (Exception e) {
					//System.out.println("You are not right.");
					$num = $num + $m;
					System.out.println($num);
				}
				/*finally {
					//The finally statement let us execute code, after try...catch block, regardless of the result
					//System.out.println("You messed up");
					$num = $num + $m;
					System.out.println($num);
				}*/
				//Start try...catch...finally block
				
			

		

	}

}
