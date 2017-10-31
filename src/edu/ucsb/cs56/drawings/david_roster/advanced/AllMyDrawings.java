package edu.ucsb.cs56.drawings.david_roster.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures of Surfboards
 * 
 * @author David Roster
 * @version for UCSB CS56, W17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	//Draws a Surfboard
	Surfboard LargeSB = new Surfboard(200,275,400,100);
	g2.setColor(Color.RED);    
	g2.draw(LargeSB);

	Surfboard SmallSB = new Surfboard(100,140,200,50);
        g2.setColor(Color.MAGENTA);
        g2.draw(SmallSB);

	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A bunch of SurfBoards by Dave", 20,20);

	 /** Draws a picture of superclass surfboards
     */

    }


    //all have different colors, positioning, translations
    //drawpic1 can be regular superclass with color and normal positioing
    //
    public static void drawPicture2(Graphics2D g2) {

	    g2.drawString("A bunch of SurfBoards for sale by Dave", 20,20);
	// Draw some Surfboards - BUT Differently
	Surfboard LargeSB = new Surfboard(200,275,400,100);
        g2.setColor(Color.RED);
        g2.draw(LargeSB);

        Surfboard SmallSB = new Surfboard(100,140,200,50);
        g2.setColor(Color.MAGENTA);
        g2.draw(SmallSB);

	Shape SB = ShapeTransforms.scaledCopyOfLL(SmallSB,0.5,0.5);
	SB = ShapeTransforms.translatedCopyOf(LargeSB,150,0);
        g2.setColor(Color.BLACK); 
	g2.draw(SB);

	SB = ShapeTransforms.scaledCopyOfLL(SB,2,2);
        SB = ShapeTransforms.translatedCopyOf(SB,300,100);
        g2.setColor(Color.GREEN);
        g2.draw(SB);

	Shape SB1 = ShapeTransforms.rotatedCopyOf(SB, Math.PI/4.0);
	g2.setColor(Color.RED);
	g2.draw(SB1);

	SurfboardwFeatures SB2 = new SurfboardwFeatures(400, 400, 400, 100);
	g2.setColor(Color.BLACK);
	g2.draw(SB2);	

    }
    
    /** Draw a different picture with a few superclass surfboards and subclass surfboards
     */
  
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Another cool image of surfboards piled in a typical IV backyard by DAVE", 20,20);
	
	
	// Draw some SurfBoards
	
//	Surfboard LargeSB = new Surfboard(100,175,450,275);
//      g2.setColor(Color.GREEN);
//	Shape Board2 = ShapeTransforms.scaledCopyOfLL(LargeSB,2,2);
//      Board2 = ShapeTransforms.translatedCopyOf(Board2,300,100);
//      g2.draw(LargeSB);
	

        Surfboard SmallSB = new Surfboard(400,340,175,60);
        g2.setColor(Color.MAGENTA);
        g2.draw(SmallSB);

	SurfboardwFeatures SB = new SurfboardwFeatures(200,275,400,100);
        g2.setColor(Color.RED);
        g2.draw(SB);

        SurfboardwFeatures SB2 = new SurfboardwFeatures(100,140,200,50);
        g2.setColor(Color.MAGENTA);
        g2.draw(SB2);

        Shape Board1 = ShapeTransforms.scaledCopyOfLL(SB,0.5,0.5);
        Board1 = ShapeTransforms.translatedCopyOf(SB,150,0);
        g2.setColor(Color.BLACK);
        g2.draw(Board1);
	
        Shape Board2 = ShapeTransforms.scaledCopyOfLL(SB,2,2);
        Board2 = ShapeTransforms.translatedCopyOf(SB,300,100);
        g2.setColor(Color.GREEN);
        g2.draw(Board2);

        Shape SB3 = ShapeTransforms.rotatedCopyOf(SB, Math.PI/4.0);
        g2.setColor(Color.BLUE);
        g2.draw(SB3);

	/** Draws a picture of superclass surfboards and subclass surfboards with complete functionality
     */

    }       
}
