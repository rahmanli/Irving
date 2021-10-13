package Javapractice;


import java.util.ArrayList;

public class Lec6Arraylist {

	public static void main(String[] args) {
		//syntax: ArrayList <data type> variable = new ArrayList <datatype>();
		
	/*	ArrayList <Integer> number = new ArrayList <Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		 
		System.out.println(number);
		number.remove(2);
		System.out.println(number);
		System.out.println(number.get(1));
		System.out.println(number.size());*/
		
		
		
		
		
		ArrayList <String> cars = new ArrayList <String>();
		 cars.add("Nissan");
		 cars.add("Mustang");
		 cars.add("BMW");
		 cars.add("Merc.Benz");
		 cars.add("Honda");
		 cars.add("Toyota");
		
		 System.out.println(cars);
		 
	//	 System.out.println(cars.size());//here I use size method to get ArrayList size
	//	 System.out.println(cars.remove(1));
		 cars.set(0, "Jaguar");
		 System.out.println(cars.set(0, "Jaguar"));
		// System.out.println(cars);
		 
		
		
	//	 System.out.println(cars.get(2));// here I use get method to get that index element
		
		 
		/* cars.remove(3);//here I use remove method to remove an item from ArrayList
		 System.out.println(cars);
		
		cars.add("Lexus");*/
		 
		 //first to last element print
	/*	 for (int j=0;j<cars.size();j++)
			{
					System.out.println(cars.get(j));
			}
		 System.out.println(cars.size());
		
		 
		 cars.set(0,"Jaguar");
		 System.out.println(cars);
		 
		
		
		 
		//last to first element print
		 for (int k=cars.size()-1;k>=0;k--)
			{
					System.out.println(cars.get(k));
			}
			
		 
		 
	/*	 
			ArrayList <Integer> even = new ArrayList <Integer>();
		
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		System.out.println(even.get(4));
		
		
		System.out.println(even);
		//access an item
		
		System.out.println(even.get(1));
			
		 */
		 
		 
		
		 

	}

}
