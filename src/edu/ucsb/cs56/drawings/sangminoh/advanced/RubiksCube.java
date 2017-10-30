package edu.ucsb.cs56.drawings.sangminoh.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Rubik's Cube
      
   @author Sang Min Oh
   @version for CS56, F17, UCSB
   
*/
public class RubiksCube extends Cube implements Shape
{
    /*
     * Constructor for objects of class RubiksCube
     */
    public RubiksCube(double x, double y, double side)
    {
	// construct the basic cube shell
	super(x,y,side);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	/*
	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;
	
	double w = 0.10 * width;
	double winTop = y + 0.5 * height;
	double winHt =  0.25 * height;
	
	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x + w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win2 =
	    new Rectangle2D.Double(x + 4.0*w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win3 =
	    new Rectangle2D.Double(x + 7.0*w, winTop, 2.0 * w, winHt);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(win1, false);
        wholeHouse.append(win2, false);
        wholeHouse.append(win3, false); */
    }    
}
