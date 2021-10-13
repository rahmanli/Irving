package Javapractice;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {

		//Retrieve single result of Array using integer values

		int[] numbers= {10,12,15,50,90};

		System.out.println(numbers[2]);


		//. How to Change the value of a specific element in array refering  to the index number,
		//here we want to change at index(2); we can use string or integer as our variable.

		numbers[2]=30;

		System.out.println(numbers[2]);

		//Please show all methods(add, get,set,remove,size,clear) activities using arraylist

		ArrayList <String> name= new ArrayList<String>();

		name.add("Liza");
		name.add("Rezwana");
		name.add("Sajib");
		name.add("Ridwan");
		name.add("Tahmina");

		System.out.println(name);

		System.out.println(name.get(1));


		name.set(0, "Rahman");
		System.out.println(name.set(0, "Rahman"));

		System.out.println(name.remove(2));

		System.out.println(name.size());

		name.clear();
		System.out.println(name);





























		//Use a for loop to print "Java" 6 times	

		/*	for(int i=1;i<=6;i++)
		{
			System.out.println("Java");
		}*/



		//Print all numbers from 0 to 6 using for Loop

		/*	for(int j=0;j<=6;j++)
		{
			System.out.print(j+ " ");
		}*/

		//Print all odd number from 0 to 50 



		/*	for(int j=0;j<=50;j++)
		{
			if(j%2!=0)
			System.out.print(j+ " ");
		}
		 */

		//Print all elements of array using for loop

		/*	String[] Fruits= {"Mango","Apple","Grapes"};

		int i=Fruits.length;
		for (int j=0;j<i;j++)
		{
			System.out.println(Fruits[j]);
		}*/



















		// Question 1. Print x is greater than or equal to y

		/*	int x=10;
		int y=5;

		if(x>=y) {

			System.out.println("x is greater than or equal to y");

		//	System.out.println(x+ " is greater than or equal to "+y);

		}
		else {
			System.out.println("y is less than or not equal to x");

		//	System.out.println(y+ " is less than or not equal to "+ x);
		}
		 */
		//Question 2. Print x is not equal to y

		/*	int x=10;
		int y=5;

		if(x!=y) {

			System.out.println("x is not equal to y");

		//	System.out.println(x+" is not equal to "+y);
		}

		else {
			System.out.println("x is equal to y");

		//	System.out.println(x+" is equal to "+y);
		}*/

		//Question 3.Print "Java" if x is equal to y, print "Selenium" if x is greater than y,
		//	otherwise print "Sql" where int x = 6, int y = 7
		/*
		int x=6;
		int y=7;

		if(x==y) {

			System.out.println("Java");

		}
		else if (x>y) {

			System.out.println("Selenium");
		}


		else {

			System.out.println("Sql");
		}*/


	}

}
