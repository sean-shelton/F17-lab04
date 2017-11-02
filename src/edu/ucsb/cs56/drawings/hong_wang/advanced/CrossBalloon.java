package edu.ucsb.cs56.drawings.hong_wang.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A Balloon with cross on it
      
   @author Hong Wang 
   @version for CS56, F17, UCSB
   
*/
public class CrossBalloon extends Balloon implements Shape
{    
    public CrossBalloon(double x, double y, double radius, double length)
    {
	super(x,y,radius,length);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
		
        Line2D.Double line1 =
	    new Line2D.Double(x -radius, y, x+radius, y);
	Line2D.Double line2 =
	    new Line2D.Double(x, y-radius, x, y+radius);

        GeneralPath wholeBalloon = this.get();
        wholeBalloon.append(line1, false);
        wholeBalloon.append(line2, false);; 
    }    
}
