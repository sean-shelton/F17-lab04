package edu.ucsb.cs56.drawings.kevinson.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Kevin Son
 * @version for UCSB CS56, W17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few toothbrushes 
     */
    
    public static void drawPicture1(Graphics2D g2) {

	Toothbrush t1 = new Toothbrush(100, 350, 500, 100);
	g2.setColor(Color.CYAN); g2.draw(t1);

	// make a black toothbrush that's half the size,
	// and moved over -160 pixels in x direction and -225 pixels in y direction
	// rotates it 90 degrees

	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1, 0.5, 0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2, -160, -225);
	Shape t4 = ShapeTransforms.rotatedCopyOf(t2, Math.PI/2.0);
	g2.setColor(Color.BLACK); g2.draw(t4);

	// here's a toothbrush that's the same size as the original but flipped and blue
	// and moved over 25 pixels to right and 125 pixels up.

	Shape t3 = ShapeTransforms.rotatedCopyOf(t1, Math.PI);
	t3 = ShapeTransforms.translatedCopyOf(t3, 25, -125);
	
	// we'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(t3);

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few toothbrushes by Kevin Son", 20,20);
	
    }
    
    
    /** Draw a picture with a few toothbrushes with toothpaste
     */
    public static void drawPicture2(Graphics2D g2) {

	ToothbrushWithToothpaste tp1 = new ToothbrushWithToothpaste(250, 100, 300, 25);
	ToothbrushWithToothpaste tp2 = new ToothbrushWithToothpaste(75, 300, 200, 100);

	g2.draw(tp1);
	g2.setColor(new Color(0x8F00FF));

	// rotate the second toothbrush 45 degrees around its center.

	Shape tp3 = ShapeTransforms.rotatedCopyOf(tp2, Math.PI/4.0);

	g2.draw(tp3);

	Stroke orig = g2.getStroke();
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of toothbrushes with toothpastes by Kevin Son", 20,20);
	
    }
    
    /** Toothbrushes with both toothpaste and no toothpaste
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of toothbrushes with both toothpaste and none by Kevin Son", 20,20);
	
	
	// Draw some toothbrushes
	
	Toothbrush large = new Toothbrush(350,100,200,50);
	Toothbrush smallT = new Toothbrush(20,100,90,10);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallT);

	ToothbrushWithToothpaste largeTT = new ToothbrushWithToothpaste(40,300,500,100);
	ToothbrushWithToothpaste smallTT = new ToothbrushWithToothpaste(250,250,120,30);

	g2.setColor(Color.YELLOW);  g2.draw(largeTT);
	g2.setColor(Color.PINK);  g2.draw(smallTT);
	
    }       
}
