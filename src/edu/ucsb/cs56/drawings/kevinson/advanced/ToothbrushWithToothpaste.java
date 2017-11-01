package edu.ucsb.cs56.drawings.kevinson.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Toothbrush
      
   @author Kevin Son 
   @version for CS56, W17, UCSB
   
*/
public class ToothbrushWithToothpaste extends Toothbrush implements Shape
{
    /**
     * Constructor for objects of class Toothbrush
     */
    public ToothbrushWithToothpaste(double x, double y, double width, double height)
    {
	// construct the basic toothbrush
	super(x, y, width, height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// make toothpaste a rectangle on top of the bristles

	double pasteLowerLeftX = x + (0.25 * x) + ((width / 15) / 2);
	double pasteLowerLeftY = y - height - (0.5 * height);

	Rectangle2D.Double paste =
	    new Rectangle2D.Double(pasteLowerLeftX, pasteLowerLeftY, (width/15) * 4, 0.5 * height);

	GeneralPath wholeToothbrush = this.get();
	wholeToothbrush.append(paste, false);
    }    
}
