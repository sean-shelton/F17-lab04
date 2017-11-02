package edu.ucsb.cs56.drawings.kevinson.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a toothbrush that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Kevin Son 
   @version for CS56, W17, UCSB
   
*/
public class Toothbrush extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of the base
       @param y y coord of lower left corner of the base
       @param width width of the base
       @param height of the base
    */
    public Toothbrush(double x, double y, double width, double height)
    {
	// setting up the bristles base of the toothbrush

	double bristleHeight = 0.25 * height;
	double bristleWidth = width / 3;

	double bristleLowerLeftX = x + (0.25 * x);
	double bristleLowerLeftY = y - (0.25 * height);

	// setting up the height of each bristle

	double bristleLength = 0.5 * height;
	double bristleDist = bristleWidth / 5; //there will be 6 bristles on each toothbrush

	// Make the base of the toothbrush
	Rectangle2D.Double base =
	    new Rectangle2D.Double(x, y, width, height);

	// make the bristles base of the toothbrush 
	Rectangle2D.Double b_base =
	    new Rectangle2D.Double(bristleLowerLeftX, bristleLowerLeftY,
				   bristleWidth, bristleHeight);

	// make the bristles of the toothbrush on the bristles base
	
	Line2D.Double b1 =
	    new Line2D.Double (bristleLowerLeftX, bristleLowerLeftY,
			       bristleLowerLeftX, bristleLowerLeftY - bristleHeight - bristleLength);

	Line2D.Double b2 =
	    new Line2D.Double (bristleLowerLeftX + bristleDist, bristleLowerLeftY,
			       bristleLowerLeftX + bristleDist, bristleLowerLeftY - bristleHeight - bristleLength);

	Line2D.Double b3 =
	    new Line2D.Double (bristleLowerLeftX + (2 * bristleDist), bristleLowerLeftY,
			       bristleLowerLeftX + (2 * bristleDist), bristleLowerLeftY - bristleHeight - bristleLength);

	Line2D.Double b4 =
	    new Line2D.Double (bristleLowerLeftX + (3 * bristleDist), bristleLowerLeftY,
			       bristleLowerLeftX + (3 * bristleDist), bristleLowerLeftY - bristleHeight - bristleLength);

	Line2D.Double b5 =
	    new Line2D.Double (bristleLowerLeftX + (4 * bristleDist), bristleLowerLeftY,
			       bristleLowerLeftX + (4 * bristleDist), bristleLowerLeftY - bristleHeight - bristleLength);

	Line2D.Double b6 =
	    new Line2D.Double (bristleLowerLeftX + (5 * bristleDist), bristleLowerLeftY,
			       bristleLowerLeftX + (5 * bristleDist), bristleLowerLeftY - bristleHeight - bristleLength);

	// put the whole toothbrush together

	GeneralPath wholeToothbrush = this.get();
	wholeToothbrush.append(base, false);
	wholeToothbrush.append(b_base, false);
	wholeToothbrush.append(b1, false);
	wholeToothbrush.append(b2, false);
	wholeToothbrush.append(b3, false);
	wholeToothbrush.append(b4, false);
	wholeToothbrush.append(b5, false);
	wholeToothbrush.append(b6, false);
    }
}
