package edu.ucsb.cs56.drawings.eliza_m_ruiz.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes 
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a round fruit with a stem.
   */

public class Fruit extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       @param x = The x coordinate of the center of the fruit.
       @param y = The y coordinate of the center of the fruit.
       @param radius = The radius of the fruit.
    */

    public Fruit(double x, double y, double radius)
    {
	double xCenter = x - radius;
	double yCenter = y - radius;
	// Drawing the circular fruit.
	
	Arc2D.Double fruit = new Arc2D.Double(xCenter, yCenter, (2 * radius), (2 * radius), 0, 360, Arc2D.OPEN);

	// Make the stem.
       	
      	Arc2D.Double stem = new Arc2D.Double((xCenter - radius), (yCenter - 2 * radius), (2 * radius), (4 * radius), 0, 100, Arc2D.OPEN);
        
     
        // put fruit and stem together.
	
        GeneralPath wholeFruit = this.get();
        wholeFruit.append(fruit, false);
    	wholeFruit.append(stem, false);	
    }
}
