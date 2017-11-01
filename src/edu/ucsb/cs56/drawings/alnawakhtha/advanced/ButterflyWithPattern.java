package edu.ucsb.cs56.drawings.alnawakhtha.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;


/**
   A class that constructs butterflies with circular patterns on their wings. It extends butterfly and uses its constructor to construct a butterfly without patterns then appends the circular patterns
      
   @author Yusuf Alnawakhtha
   @version for CS56, F17, UCSB
   
*/

public class ButterflyWithPattern extends Butterfly implements Shape
{

    /**
       Constructor
       
       @param x x coordinate of center of butterfly
       @param y y coordinate of center of butterfly
       @param width width of the butterfly
       @param height of the butterfly
    */
    
    public ButterflyWithPattern(double x, double y, double width, double height)
    {
	// construct the butterfly
	super(x,y,width,height);
	
	GeneralPath gp = this.get();
	
        double radiusOfBody = .0288 * height; 
	double radiusOfHead = 0.5*(height-radiusOfBody*26);
	double radiusOfBigWing =  0.25*(width-radiusOfBody);
	double radiusOfSmallWing = 0.5*radiusOfBigWing;
	double radiusOfEyes = 0.25*radiusOfBody;
	double radiusOfBigPattern = 0.2*radiusOfBigWing;
	double radiusOfSmallPattern = 0.2*radiusOfSmallWing;
	
	double[] posBigLeftWing = {x-radiusOfBody- 2 * radiusOfBigWing, y- 6*radiusOfBody - radiusOfBigWing};
	
        double[] posBigRightWing = {x+radiusOfBody, y- 6*radiusOfBody - radiusOfBigWing};

	double[] posSmallLeftWing = {x-radiusOfBody- 2 * radiusOfSmallWing, y- 6*radiusOfBody + radiusOfBigWing};

	double[] posSmallRightWing = {x+radiusOfBody, y- 6*radiusOfBody + radiusOfBigWing};
	
	Ellipse2D.Double bigLeftWingP1 = new Ellipse2D.Double(posBigLeftWing[0]+0.5*radiusOfBigWing-radiusOfBigPattern, posBigLeftWing[1] + 0.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigLeftWingP2 = new Ellipse2D.Double(posBigLeftWing[0]+1.5*radiusOfBigWing-radiusOfBigPattern, posBigLeftWing[1] + 0.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigLeftWingP3 = new Ellipse2D.Double(posBigLeftWing[0]+radiusOfBigWing-radiusOfBigPattern, posBigLeftWing[1] + radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigLeftWingP4 = new Ellipse2D.Double(posBigLeftWing[0]+0.5*radiusOfBigWing-radiusOfBigPattern, posBigLeftWing[1] + 1.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigLeftWingP5 = new Ellipse2D.Double(posBigLeftWing[0]+1.5*radiusOfBigWing-radiusOfBigPattern, posBigLeftWing[1] + 1.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);



	Ellipse2D.Double bigRightWingP1 = new Ellipse2D.Double(posBigRightWing[0]+0.5*radiusOfBigWing-radiusOfBigPattern, posBigRightWing[1] + 0.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigRightWingP2 = new Ellipse2D.Double(posBigRightWing[0]+1.5*radiusOfBigWing-radiusOfBigPattern, posBigRightWing[1] + 0.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigRightWingP3 = new Ellipse2D.Double(posBigRightWing[0]+radiusOfBigWing-radiusOfBigPattern, posBigRightWing[1] + radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigRightWingP4 = new Ellipse2D.Double(posBigRightWing[0]+0.5*radiusOfBigWing-radiusOfBigPattern, posBigRightWing[1] + 1.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);

	Ellipse2D.Double bigRightWingP5 = new Ellipse2D.Double(posBigRightWing[0]+1.5*radiusOfBigWing-radiusOfBigPattern, posBigRightWing[1] + 1.5*radiusOfBigWing - radiusOfBigPattern, radiusOfBigPattern *2, radiusOfBigPattern*2);



	Ellipse2D.Double smallLeftWingP1 = new Ellipse2D.Double(posSmallLeftWing[0]+0.70*radiusOfSmallWing-radiusOfSmallPattern, posSmallLeftWing[1] + 0.70*radiusOfSmallWing - radiusOfSmallPattern, radiusOfSmallPattern *2, radiusOfSmallPattern*2);

	Ellipse2D.Double smallLeftWingP2 = new Ellipse2D.Double(posSmallLeftWing[0]+1.3*radiusOfSmallWing-radiusOfSmallPattern, posSmallLeftWing[1] + 1.3*radiusOfSmallWing - radiusOfSmallPattern, radiusOfSmallPattern *2, radiusOfSmallPattern*2);

	Ellipse2D.Double smallRightWingP1 = new Ellipse2D.Double(posSmallRightWing[0]+1.3*radiusOfSmallWing-radiusOfSmallPattern, posSmallRightWing[1] + 0.70*radiusOfSmallWing - radiusOfSmallPattern, radiusOfSmallPattern *2, radiusOfSmallPattern*2);

	Ellipse2D.Double smallRightWingP2 = new Ellipse2D.Double(posSmallRightWing[0]+0.7*radiusOfSmallWing-radiusOfSmallPattern, posSmallRightWing[1] + 1.3*radiusOfSmallWing - radiusOfSmallPattern, radiusOfSmallPattern *2, radiusOfSmallPattern*2);
	

	
        GeneralPath wholeButterfly = this.get();
        wholeButterfly.append(bigLeftWingP1, false);
	wholeButterfly.append(bigLeftWingP2, false);
	wholeButterfly.append(bigLeftWingP3, false);
	wholeButterfly.append(bigLeftWingP4, false);
	wholeButterfly.append(bigLeftWingP5, false);
	wholeButterfly.append(bigRightWingP1, false);
	wholeButterfly.append(bigRightWingP2, false);
	wholeButterfly.append(bigRightWingP3, false);
	wholeButterfly.append(bigRightWingP4, false);
	wholeButterfly.append(bigRightWingP5, false);
	wholeButterfly.append(smallLeftWingP1, false);
	wholeButterfly.append(smallLeftWingP2, false);
	wholeButterfly.append(smallRightWingP1, false);
	wholeButterfly.append(smallRightWingP2, false);
    }    
}
