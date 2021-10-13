package Javapractice;

import java.util.HashMap;

public class Lec7Hashmap {

	public static void main(String[] args) {
		// Hashmap to store paired value key/value
		//Hashmap<datatype1,datatype2> variable = new HashMap<datatype1,datatype2>();
		//store student id and student name

	/*	HashMap <Integer,String> student = new HashMap <Integer,String>();
		//for add element here we have to write put()method

		student.put(3202101,"Kaniz");
		student.put(3202102,"Sifat");
		student.put(3202103,"Rezwana");
		System.out.println(student);*/
try {
		HashMap <String,String> country = new HashMap <String,String>();
		country.put("Louisville", "Kentucky");
		country.put("Frankfort", "Kentucky");
		country.put("Jacksonheight", "Newyork");
		country.put("Dallas", "Texas");
		country.put("Orlando", "Florida");

		//country.get("Jacksonheight");
		System.out.println(country.get("Jacksonheight"));


		//Access the item get() method
		System.out.println("I live in "+country.get("Louisville"));

		//Remove the item remove() method
		//country.remove("Dallas");
		System.out.println("I want to remove " +country.remove("Dallas")+ " State.");
		System.out.println("I want to remove " +country.get("Dallas")+ " State.");


		//Size() method
		System.out.println(country.size());

		//clear method
		//country.clear();
}
catch(Exception e) {
	System.out.println("wrong");

}
				













	}

}
