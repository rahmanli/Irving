package Javapractice;

public class Trycatch {

	public static void main(String[] args) {
		// 
		try {
			String[] state= {"Kentucky","Newyork","Texas"};
			System.out.println(state[7]);
		}
		catch(Exception e)
		{
			System.out.println("wrong");
		}

	}

}
