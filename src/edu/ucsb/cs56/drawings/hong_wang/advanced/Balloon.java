package edu.ucsb.cs56.drawings.hong_wang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a balloon that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Hong Wang
   @version for CS56, F17, UCSB
   
*/
public class Balloon extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of center of balloon
       @param y y coord of center of balloon
       @param radius radius of balloon
       @param length length of the string
    */
    public Balloon(double x, double y, double radius, double length)
    {	        
        Ellipse2D.Double bProper = 
            new Ellipse2D.Double(x-radius, y-radius,
				 radius*2, radius*2);
      
        Line2D.Double bString =
            new Line2D.Double (x, y + radius,
                               x, y + radius + length);
	
        // put the whole balloon together
	
        GeneralPath wholeBalloon = this.get();
        wholeBalloon.append(bProper, false);
        wholeBalloon.append(bString, false);    
    }
}
