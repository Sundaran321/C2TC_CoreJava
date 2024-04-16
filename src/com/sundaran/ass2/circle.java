package com.sundaran.ass2;

import java.util.Scanner;

public class circle {
	
	
	
	  double radius;
	  String colour;
	   public void getInput() {
	    	Scanner Scanner= new Scanner(System.in);
	    	System.out.println("enter the color:");
	    	colour=Scanner.nextLine();
	    	System.out.println("enter the radius:");
	    	radius=Scanner.nextInt();
	    	Scanner.close();
	         }
	public double calcArea() {
		return 3.14*radius*radius;
	}

}
