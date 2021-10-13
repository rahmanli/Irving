package Javapractice;

public class Lec8Javaexeption {

	/*private void signin() {
		//code
	}
	void signup() {

	}*/
	public static void main(String[] args) {
		// java exception (try catch block)
		/*
		  try{
		// block of code

		}

		catch(Exception e)
		{
		//block of code
		}
		 */
		try {	
			int[] num= {1,2,3};
			System.out.println(num[2]);
		}
		catch(Exception e) {

			System.out.println("error");
		}

		try {
			String[] Fruits= {"apple","orange","grape"};
			System.out.println(Fruits[7]);
		}
		//we can write down other valuable other than 'e' 
		catch(Exception e) {
			System.out.println("wrong line number 35");
		}
/*	try {	
		for (int j=0; j<5; j++) {
			System.out.println("I am a student of NexttechITC");
		}	
	}
	catch(Exception e) {
		System.out.println("something wrong");
	}

try {
	String[] Fruits1= {"Mango","Apple","Grapes"};
	for(int i=0;i<Fruits1.length;i++)
	{
		System.out.println(Fruits1[i]);
	}
	
}
catch(Exception e) {
	System.out.println("something wrong");
}*/



	}

}
