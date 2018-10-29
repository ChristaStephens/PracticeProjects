package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyApp  {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//Project Goal: To better understand the Constructors
		//Abstract, Interface, toString, etc
		//Creating an class of my family & ages
		
		//Imports the constructor information from the family class
		//to the FamilyApp class so that we can use it in the array
		//Will need to add the parameters of the constructor (name/age)
		//to meet the requirements of the array and constructor.
		
		List <Family> members = new ArrayList<>();
		members.add(new FamilyType("Christa Stephens", 30, "Yolanda & David", "Mellisondra"));
		members.add(new FamilyType("D'Shaun Stephens", 35, "Jeanette & Donald", "Mellisondra"));
		members.add(new FamilyType("Mellisondra Stephens", 2, "Christa & D'Shaun", "N/A"));
		members.add(new FamilyType("Stormie Stephens", 4, "Christa & D'Shaun", "N/A"));
		System.out.println(members);
		
		
		
	
	}


}
