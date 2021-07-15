// Alyssa Basile 10/23/2020
// updated 07/15/2021

import java.util.Scanner;
import java.text.DecimalFormat;

public class Paint1 {
	private static DecimalFormat df2 = new DecimalFormat("#.####");
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
	    	double wallHeight = 0.0;
	    	double wallWidth = 0.0;
	    	double wallArea = 0.0;
	    	double gallonsPaintNeeded = 0.0;
	    	double cansNeeded;

	    	final double squareFeetPerGallons = 350.0;

	    	// Implement a do-while loop to ensure input is valid
	    	// Prompt user to input wall's height
	    	do {
	    		System.out.println("Enter wall height (feet): ");
	    		wallHeight = scnr.nextDouble();
	    	} while (wallHeight <= 0);

	    	// Implement a do-while loop to ensure input is valid
	    	// Prompt user to input wall's width
	    	do {
	        System.out.println("Enter wall width (feet): ");
	       	wallWidth = scnr.nextDouble();
	    	} while (wallWidth <= 0);

	    	// Calculate and output wall area
	    	System.out.println("");
	    	wallArea = wallHeight * wallWidth;
	    	System.out.println("Wall area: " + wallArea + "  square feet");

	    	// Calculate and output the amount of paint (in gallons) needed to paint the wall
	    	gallonsPaintNeeded = wallArea/squareFeetPerGallons;
	   		System.out.println("Paint needed: " + df2.format(gallonsPaintNeeded) + " gallons");
	    
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
