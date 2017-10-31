package edu.ucsb.cs56.drawings.david_roster.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Surfboard that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author David Roster
   @version for CS56, W17, UCSB
   
*/
public class Surfboard extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of surfboard
       @param y y coord of lower left corner of surfboard
       @param width width of the surfboard
       @param height of surfboard
    */
    public Surfboard(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
	
//Start of new code

//managing Fins Aspect
double finwidth = width/5;
double finlength = height/5;


double YaxisFins = y + height/2;
//double XaxisFin1 = x + width/3;
double XaxisFin = x + (2 * width)/3;
double YaxisFin2 = y + height/4;


Ellipse2D.Double board =
            new Ellipse2D.Double(x, y, width, height);


Ellipse2D.Double fin1 =
            new Ellipse2D.Double(XaxisFin, YaxisFins,
                                   finwidth, finlength);

Ellipse2D.Double fin2 =
            new Ellipse2D.Double(XaxisFin, YaxisFin2,
                                   finwidth, finlength);

	
        
	GeneralPath Wboard = this.get();
	Wboard.append(board, false);	
	Wboard.append(fin1, false);
	Wboard.append(fin2, false);
    }
}
