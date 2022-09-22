package simplejavathreadproject;

import java.util.Scanner;

public class MultiTable {
	//Scanner in = new Scanner(System.in);  
//	Scanner in = new Scanner("insert value"); 
	
	

	 public static void main(String[] args)
	    {
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter Number"); 
		   int N =myObj.nextInt();
		 // number n for which we have to print the
	        // multiplication table.
	        
	 
	        // looping from 1 to 10 to print the multiplication
	        // table of the number.
	        // using for loop
	        for (int i = 1; i <= 20; i++) {
	            // printing the N*i,ie ith multiple of N.
	            System.out.println(N + " * " + i + " = "
	                               + N * i);
	        }
	    }
	}


