package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		//Results
		{	
			int Phy = 100;
		    int Chem = 50;
		    int Bio = 80;
		    int totalPer = 150;
		    int max = 450;
		    
		    double overper = (double) (Phy + Chem + Bio) / max;
		   
		 // multiplying their score by 100 and then dividing by 450.


		    System.out.println(Phy);
		    System.out.println(totalPer);
		    System.out.println(Chem);
		    System.out.println(totalPer);
		    System.out.println(Bio);
		    System.out.println(totalPer);
		    System.out.println(overper * 100);
		    
		}

	}
}
