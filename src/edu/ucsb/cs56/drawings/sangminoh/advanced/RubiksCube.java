package edu.ucsb.cs56.drawings.sangminoh.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.util.ArrayList;

/**
   A Rubik's Cube
      
   @author Sang Min Oh
   @version for CS56, F17, UCSB
   
*/
public class RubiksCube extends Cube implements Shape
{
    /*
     	Constructor
       
       @param x x-coordinate of the center of the RubiksCube
       @param y y-coordinate of the center of the RubiksCube
       @param side length of one side of the RubiksCube
     */
    public RubiksCube(double x, double y, double side)
    {
		// Construct the basic cube shell
		super(x,y,side);
	
		// Get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();
	
		// The lines that we have to draw evenly divide a face of the cube. In addition, the deltas (changes) in the x and y directions are multiples of (side*Math.cos(theta)/3) and (side*Math.sin(theta)/3) respectively. Therefore, we can just define these deltas and use them to determine the endpoints of the lines we need to draw.
		double theta = 30*Math.PI/180; // Define theta = 30 degrees in terms of radians
		double deltaX = side*Math.cos(theta)/3;
		double deltaY = side*Math.sin(theta)/3;
		
		// Create an ArrayList of lines
		ArrayList<Line2D.Double> lines = new ArrayList<Line2D.Double>();
		
		
		// Draw the 4 lines on the lower left face
		lines.add(new Line2D.Double(x-deltaX, y-deltaY, x-deltaX, y+side-deltaY));
		lines.add(new Line2D.Double(x-2*deltaX, y-2*deltaY, x-2*deltaX, y+side-2*deltaY));
		lines.add(new Line2D.Double(x, y+side/3, x-3*deltaX, y+side/3-3*deltaY));
		lines.add(new Line2D.Double(x, y+2*side/3, x-3*deltaX, y+2*side/3-3*deltaY));
		
		// Draw the 4 lines on the lower right face
		lines.add(new Line2D.Double(x+deltaX, y-deltaY, x+deltaX, y+side-deltaY));
		lines.add(new Line2D.Double(x+2*deltaX, y-2*deltaY, x+2*deltaX, y+side-2*deltaY));
		lines.add(new Line2D.Double(x, y+side/3, x+3*deltaX, y+side/3-3*deltaY));
		lines.add(new Line2D.Double(x, y+2*side/3, x+3*deltaX, y+2*side/3-3*deltaY));
		
		// Draw the 4 lines on the topmost face 
		lines.add(new Line2D.Double(x-2*deltaX, y-2*deltaY, x-2*deltaX+3*deltaX, y-2*deltaY-3*deltaY));
		lines.add(new Line2D.Double(x-deltaX, y-deltaY, x-deltaX+3*deltaX, y-deltaY-3*deltaY));
		lines.add(new Line2D.Double(x+2*deltaX, y-2*deltaY, x+2*deltaX-3*deltaX, y-2*deltaY-3*deltaY));
		lines.add(new Line2D.Double(x+deltaX, y-deltaY, x+deltaX-3*deltaX, y-deltaY-3*deltaY));
		
		// Draw a Rubik's Cube "logo" in the middle square of the topmost face
		double logoCenterX = x;
		double logoCenterY = y-side/2;
		double logoWidth = side/3-side/10;
		double logoHeight = side/3-side/7;
		double logoUpperLeftX = logoCenterX-logoWidth/2;
		double logoUpperLeftY = logoCenterY-logoHeight/2;
		Ellipse2D.Double logo1 = new Ellipse2D.Double(logoUpperLeftX, logoUpperLeftY, logoWidth, logoHeight);
		Rectangle2D.Double logo2 = new Rectangle2D.Double(logoUpperLeftX+0.5, logoUpperLeftY+0.5, logoWidth-1, logoHeight-1);
	
		// Add the lines to the Rubik's Cube
		GeneralPath wholeRubiksCube = this.get();
		for(int i=0; i<lines.size(); i++) {
			wholeRubiksCube.append(lines.get(i), false);
		}
		wholeRubiksCube.append(logo1, false);
		wholeRubiksCube.append(logo2, false);
    }    
}
