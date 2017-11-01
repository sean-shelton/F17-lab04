package edu.ucsb.cs56.drawings.sangminoh.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a cube that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Sang Min Oh
   @version for CS56, F17, UCSB
   
*/
public class Cube extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x-coordinate of the center of the cube
       @param y y-coordinate of the center of the cube
       @param side length of one side of the Cube
     */
    public Cube(double x, double y, double side)
    {
	
        /* The cube (when positioned such that one vertex is pointing directly out of the screen), has a perfect hexagonal outline. I drew the hexagonal outline of the cube first. I created two arrays of doubles which stores the x- and y-coordinates of each point in the hexagonal outline. The first elements represent the topmost point of the hexagonal outline, and the next elements represent the other points, going in a clockwise direction.
        
        What cube should look like:
        
                    0
                  -   -
               -         -
            5               1
            |  -         -  |
            |     -   -     |
            4       |       2	
               -    |    - 
                  -   -
                    3
        	
        */
        double[] hexOutlineX = new double[6];
        double[] hexOutlineY = new double[6];
        Line2D.Double[] hexOutline = new Line2D.Double[6];
        
        hexOutlineX[0] = x;
        hexOutlineY[0] = y - side; // Minus because y increases going down
        
        // From this point, the line from the center to one point creates a 60 degree angle with the line from the center to the next point, so we can take advantage of trig functions (from the Math class) to compute the points. Therefore, diagonal lines from the center to a point on the hexagon forms a 30 degree angle with the horizontal;
        double theta = 30 * Math.PI / 180; // Convert 30 degrees to radians
        hexOutlineX[1] = x + side*Math.cos(theta);
        hexOutlineY[1] = y - side*Math.sin(theta);
        hexOutlineX[2] = x + side*Math.cos(theta);
        hexOutlineY[2] = y + side*Math.sin(theta);
        hexOutlineX[3] = x;
        hexOutlineY[3] = y + side; // This point is straight down from the center
        hexOutlineX[4] = x - side*Math.cos(theta);
        hexOutlineY[4] = y + side*Math.sin(theta);
        hexOutlineX[5] = x - side*Math.cos(theta);
        hexOutlineY[5] = y - side*Math.sin(theta);
        
        // Draw the outline
        for(int i=0; i<6; i++) {
        	// The % is for looping around so the point stored in index 5 can connect with the point stored in index 0. 
        	hexOutline[i] = new Line2D.Double(hexOutlineX[i%6], hexOutlineY[i%6], hexOutlineX[(i+1)%6], hexOutlineY[(i+1)%6]);
        }
        
        // Now all we have to do is draw lines connecting the center to 3 equally-spaced points on the hexagonal outline. In this design, I decided to make the center connect to the point directly below it and to the two points that are above and diagonal on both the left and right sides of the center.
        Line2D.Double innerLine1 = new Line2D.Double(x, y, hexOutlineX[1], hexOutlineY[1]);
        Line2D.Double innerLine2 = new Line2D.Double(x, y, hexOutlineX[3], hexOutlineY[3]);
        Line2D.Double innerLine3 = new Line2D.Double(x, y, hexOutlineX[5], hexOutlineY[5]); 
	
        // Put the whole cube together
	
        GeneralPath wholeCube = this.get();
        for(int i=0; i<6; i++) {
        	wholeCube.append(hexOutline[i], false);
        }  
        wholeCube.append(innerLine1, false);
        wholeCube.append(innerLine2, false);
        wholeCube.append(innerLine3, false);
    }
}
