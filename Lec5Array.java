package Javapractice;

public class Lec5Array {

	public static void main(String[] args) {
		// index 0,1,2,3,4,5,6
		//number 1,2,3,4,5,6,7


		/*	String[] Name= {"liza","rezwana","sajib","sadak","ridwan"};

	//	System.out.println(Name.length);

		int i=(Name.length);
		for (int k=i-1;k>=0;k--)
		{
				System.out.println(Name[k]);
		}
		 */








		//	int[] c= {1,2,3,4,5};

		/*	String[] Fruits= {"apple","orange","grape"};
		System.out.println(Fruits[2]);

		//change the array element
		Fruits[1]="watermelon";
		System.out.println(Fruits[1]);

		//find out array length

		System.out.println(Fruits.length);*/

		//	int[] c= {5,6,7,8,9};
		//	System.out.println(c[2]);

	try {	String[] name= {"liza","rezwana","sajib","sadak","ridwan"};
		System.out.println(name[9]);}
	catch(Exception e) {
		System.out.println("wrong");
	}

		//System.out.println(name.length);
		//if i want to change in array list
		/*	name[2]= "ridwan";
		System.out.println(name[2]);*/

		/*	int i=(name.length);
		for (int k=i-1;k>=0;k--)
		{
				System.out.println(name[k]);
		}*/
		/*for (int j=0;j<(name.length);j++)
		{
				System.out.println(name[j]);
		}*/

		//if we want to print even element from array
		/*	for (int k=0;k<(name.length);k+=2)
		{
				System.out.println(name[k]);
		}*/
		/*
		//show from 0 to 2 string list in array
		for (int i=0;i<3;i++)
		{
				System.out.println(name[i]);
		}


		//show from 2 to 0 string list using for loop in array
		for (int j=2;j>=0;j--)
		{
				System.out.println(name[j]);
		}
		 */

		/*	//this loop will show all elements in array from first to last
	 for(String x:name) {
		System.out.println(x);
		}*/





	}

}
