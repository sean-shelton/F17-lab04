package edu.ucsb.cs56.drawings.eliza_m_ruiz.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

/**
   A Cherry, comprised of two Fruit objects.
   @author Eliza Ruiz
*/
public class Cherry extends Fruit implements Shape
{
    /**
     * Constructor
     */

    public Cherry(double xCenter, double yCenter, double radius)
    {
	// construct first(right) and second(left) Fruit.
	super(xCenter + radius, yCenter, radius);
	
	double xLeft = xCenter - radius;

	 Arc2D.Double right =
		new Arc2D.Double(xLeft - radius, yCenter - radius, (2 * radius), (2 * radius), 0, 360, Arc2D.OPEN);

        // Make the right stem.
	
        Arc2D.Double right_stem = 
		new Arc2D.Double(xLeft, (yCenter - (3 * radius)), (2 * radius), (4 * radius), 180, -80, Arc2D.OPEN);
	// connect the two stems.
	
	Line2D.Double flat_stem =
		new Line2D.Double(xLeft, yCenter - (3 * radius), xCenter + radius, yCenter - (3 * radius));

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
        GeneralPath wholeCherry = this.get();
	wholeCherry.append(right, false);
	wholeCherry.append(right_stem, false);	
    	wholeCherry.append(flat_stem, false);
    }    
}
