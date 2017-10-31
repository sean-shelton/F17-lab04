package edu.ucsb.cs56.drawings.sangminoh.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.util.ArrayList;

/*
 * A class with static methods for drawing various pictures
 * 
 * @author Sang Min Oh
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /* 
		@param g2 Graphics2D object
		
		This function draws several cubes and shows how each cube can scale, translate, and be drawn with different colors/pen thickness. In addition, two of the cubes are randomly generated (center and size). 
     */
    public static void drawPicture1(Graphics2D g2) {
	
		// Draw a red cube.
		Cube c1 = new Cube(300, 300, 70);
		g2.setColor(Color.RED); 
		g2.draw(c1);

		// Draw a new cube that is twice as wide, but 2/3 as tall as c1.
		// Move this cube some amount of x and y in the upper-right direction.
		Shape c2 = ShapeTransforms.scaledCopyOfLL(c1, 2.0, 0.667);
		c2 = ShapeTransforms.translatedCopyOf(c2, 203, -119);
		g2.setColor(new Color(0x996600));
		g2.draw(c2);
		
		// Draw a new cube that is 1/3 as wide, but 4 times as tall as c2.
		// Move this cube in the lower-left direction on the screen.
		// Define a new Stroke for this cube.
		Shape c3 = ShapeTransforms.scaledCopyOfLL(c2, 0.3333, 4);
		c3 = ShapeTransforms.translatedCopyOf(c3, -88, 172);
		Stroke thick = new BasicStroke(5.5f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);
		g2.setStroke(thick);
		g2.setColor(new Color(0xFF0099));
		g2.draw(c3);
		
		// Draw two cubes that are centered at a random location and have a random size
		for(int i=0; i<2; i++) {
			double randX = 300*Math.random() + 40; 		// Range: [40, 340)
			double randY = 300*Math.random() + 75;		// Range: [75, 375)
			double randSide = 40*Math.random() + 20;	// Range: [20, 60)
			Cube c = new Cube(randX, randY, randSide);
			g2.setColor(Color.BLACK);
			g2.draw(c);
		}
	
		// Label the picture
		Stroke orig=g2.getStroke();
		g2.setStroke(orig);
		g2.setColor(new Color(0x9900FF)); 
		g2.drawString("Crazy Cubes by Sang Min Oh", 20,20);
    }
    
    
    /* 
    	@param g2 Graphics2D object
		
		This function draws both Cube and RubiksCube objects. This function shows that the Cube and RubiksCube objects can be rotated. A lot of Cube and RubiksCube objects of different color, size, rotation, scaling are created.
     */
    public static void drawPicture2(Graphics2D g2) {
	
		// Draw Cubes and RubiksCubes
		Cube c1 = new Cube(30, 50, 32);
		Cube c2 = new Cube(100, 100, 60);
		RubiksCube rc1 = new RubiksCube(400, 67, 40);
		RubiksCube rc2 = new RubiksCube(300, 250, 10);
	
		g2.setColor(Color.CYAN);	g2.draw(c1);
		g2.setColor(Color.MAGENTA);	g2.draw(c2);
		g2.setColor(Color.BLACK);	g2.draw(rc1);
		g2.setColor(Color.RED); 	g2.draw(rc2);
	
		// Draw a new Cube that is twice as wide, but half as tall as c1.
		// Move this cube some amount of x and y in the upper-right direction.
		// Rotate the Cube by 209*PI/49 radians
		Shape c3 = ShapeTransforms.scaledCopyOfLL(c1, 2.0, 0.5);
		c3 = ShapeTransforms.translatedCopyOf(c3, 75, 123);
		c3 = ShapeTransforms.rotatedCopyOf(c3, 209*Math.PI/49);
		g2.setColor(Color.BLUE);
		g2.draw(c3);
		
		// Draw a new RubiksCube that is 5 times as big as rc2.
		// Rotate the Cube by a random degree.
		// Draw this RubiksCube with a thick pen
		Stroke thick = new BasicStroke (2.7f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);  
		Shape rc3 = ShapeTransforms.scaledCopyOfLL(rc2, 5.0, 5.0);
		rc3 = ShapeTransforms.rotatedCopyOf(rc3, 2*Math.PI*Math.random());
		g2.setStroke(thick);
		g2.setColor(new Color(0xCC0065));
		g2.draw(rc3);
		
		// Draw a new RubiksCube 
		RubiksCube rc4 = new RubiksCube(500, 350, 90);
		Shape rc5 = ShapeTransforms.rotatedCopyOf(rc4, 382*Math.PI/194);
		Stroke orig = g2.getStroke();
		g2.setStroke(orig);
		g2.setColor(new Color(0x33FF99));
		g2.draw(rc5);
	
		// Label the picture 
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("The Polygon Party by Sang Min Oh", 20,20);
    }
    
    /*
    	@param g2 Graphics2D object
		
		This function takes the ability of Cube and RubiksCube objects to rotate and be different colors in order to create a picture of a rather blocky flower. The main flower is fixed, but the green plant life around the flower is randomly generated (random location, size, rotation, and shade of green). 
     */
    public static void drawPicture3(Graphics2D g2) {
	
		// Draw 4 RubiksCubes in a flower pattern with a Cube in the center
		double centerOfFlowerX = 300.0;
		double centerOfFlowerY = 200.0;
		double petalSize = 50.0;
		Cube center = new Cube(centerOfFlowerX, centerOfFlowerY, 40.0);
		Stroke thick = new BasicStroke (2.7f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);  
		g2.setStroke(thick);
		g2.setColor(new Color(0xFFFF00));
		g2.draw(center);
		
		ArrayList<RubiksCube> rc = new ArrayList<RubiksCube>();
		rc.add(new RubiksCube(centerOfFlowerX, centerOfFlowerY+75, petalSize));
		rc.add(new RubiksCube(centerOfFlowerX-75, centerOfFlowerY, petalSize));
		rc.add(new RubiksCube(centerOfFlowerX, centerOfFlowerY-75, petalSize));
		rc.add(new RubiksCube(centerOfFlowerX+75, centerOfFlowerY, petalSize));
		
		g2.setColor(Color.MAGENTA);
		
		for(int i=0; i<rc.size(); i++) {
			Shape rcRot = ShapeTransforms.rotatedCopyOf(rc.get(i), i*Math.PI/2);
			g2.draw(rcRot);
		}
		
		Stroke orig=g2.getStroke();
		g2.setStroke(orig);
		
		// Randomly dr0aw smaller green cubes around the flower (left and right sides). Have an ArrayList of different green colors, so each randomly generated cube has a randomly generated shade of green 
		ArrayList<Color> c = new ArrayList<Color>();
		c.add(new Color(0x009966));
		c.add(new Color(0x00FF99));
		c.add(new Color(0x009900));
		c.add(new Color(0x006633));
		c.add(new Color(0x33CC00));
		c.add(new Color(0x99FF99));
		c.add(new Color(0x66FF33));
		
		for(int i=0; i<16; i++) {
			double randX = 150*Math.random(); 			// Range = [0, 150)		
			double randY = 400*Math.random() + 70;		// Range = [70, 470)
			double randSize = 20*Math.random() + 20;	// Range = [20, 40)
			Cube greenCube = new Cube(randX, randY, randSize);
			Shape rotCube = ShapeTransforms.rotatedCopyOf(greenCube, 2*Math.PI*Math.random());
			int color = (int) (c.size()*Math.random());
			g2.setColor(c.get(color));
			g2.draw(rotCube);
		}
		
		for(int i=0; i<16; i++) {
			double randX = 150*Math.random() + 500;		// Range = [500, 650)		
			double randY = 400*Math.random() + 70;		// Range = [70, 470)
			double randSize = 20*Math.random() + 20;	// Range = [20, 40)
			Cube greenCube = new Cube(randX, randY, randSize);
			Shape rotCube = ShapeTransforms.rotatedCopyOf(greenCube, 2*Math.PI*Math.random());
			int color = (int) (c.size()*Math.random());
			g2.setColor(c.get(color));
			g2.draw(rotCube);
		}
		
		// Label the picture
		g2.setColor(new Color(0x3366FF)); 
		g2.drawString("Flower Cubes by Sang Min Oh", 20,20);
    }       
}
