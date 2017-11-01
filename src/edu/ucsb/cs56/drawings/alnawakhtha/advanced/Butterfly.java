package edu.ucsb.cs56.drawings.alnawakhtha.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.util.ArrayList;

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
   A geometric drawing of a butterfly using circles. It implements Shape and hence can be rotated, transported, and scaled
      
   @author Yusuf Alnawakhtha
   @version for CS56, F17, UCSB
   
*/

public class Butterfly extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coordinate of center of butterfly
       @param y y coordinate of center of butterfly
       @param width width of the butterfly
       @param height of the butterfly
    */
    public Butterfly(double x, double y, double width, double height)
    {
   
        
        double radiusOfBody = .0288 * height; //0.075
	double radiusOfHead = 0.5*(height-radiusOfBody*26);
	double radiusOfBigWing =  0.25*(width-radiusOfBody);
	double radiusOfSmallWing = 0.5*radiusOfBigWing;
	double radiusOfEyes = 0.25*radiusOfBody;

		
        ArrayList<Ellipse2D.Double> body = new ArrayList<Ellipse2D.Double>();
        for(int i = -6; i < 7; i++)
	    {
		body.add(new Ellipse2D.Double(x-radiusOfBody, y - (i*2*radiusOfBody)-radiusOfBody, radiusOfBody * 2, radiusOfBody*2)  );
	    }
	Ellipse2D.Double head = new Ellipse2D.Double(x-radiusOfHead, y-(radiusOfBody * 13)- 2*radiusOfHead, 2 * radiusOfHead, 2 * radiusOfHead);

	Ellipse2D.Double bigLeftWing = new Ellipse2D.Double(x-radiusOfBody- 2 * radiusOfBigWing, y- 6*radiusOfBody - radiusOfBigWing, 2*radiusOfBigWing, 2*radiusOfBigWing);

	Ellipse2D.Double bigRightWing = new Ellipse2D.Double(x+radiusOfBody, y- 6*radiusOfBody - radiusOfBigWing, 2*radiusOfBigWing, 2*radiusOfBigWing);

	Ellipse2D.Double smallLeftWing = new Ellipse2D.Double(x-radiusOfBody- 2 * radiusOfSmallWing, y- 6*radiusOfBody + radiusOfBigWing, 2*radiusOfSmallWing, 2*radiusOfSmallWing);

	Ellipse2D.Double smallRightWing = new Ellipse2D.Double(x+radiusOfBody, y- 6*radiusOfBody + radiusOfBigWing, 2*radiusOfSmallWing, 2*radiusOfSmallWing);



        GeneralPath wholeButterfly = this.get();
	for(int i =0; i<13; i++)
	    {
		wholeButterfly.append(body.get(i), false);
	    }
        wholeButterfly.append(head, false);
	wholeButterfly.append(bigLeftWing, false);
	wholeButterfly.append(bigRightWing, false);
	wholeButterfly.append(smallLeftWing, false);
	wholeButterfly.append(smallRightWing, false);

	
    }
}
