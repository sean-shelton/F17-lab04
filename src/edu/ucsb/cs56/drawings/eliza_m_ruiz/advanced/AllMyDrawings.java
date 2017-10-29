package edu.ucsb.cs56.drawings.eliza_m_ruiz.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with Cherries and Fruits
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	// Draw Fruits.
	
	Fruit f = new Fruit(100,100,20);
	g2.setColor(Color.YELLOW); g2.draw(f);

	Shape f2 = ShapeTransforms.scaledCopyOfLL(f,2,2);
	f2 = ShapeTransforms.translatedCopyOf(f2,250,50);
	g2.setColor(Color.BLUE); g2.draw(f2);

	Fruit h = new Fruit(200,200,10);
	
	Stroke thick = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig = g2.getStroke();
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h,.8,.8);
	h2 = ShapeTransforms.translatedCopyOf(h2,70,70);
	h2 = ShapeTransforms.rotatedCopyOf(h2, Math.PI/2.);
	g2.draw(h2);

	g2.setStroke(thick);
	g2.setColor(Color.BLACK); g2.draw(h);
	
	Fruit g = new Fruit(350,170,30);
        g2.setColor(Color.GREEN); g2.draw(g);

	// Draw Cherries.
	
	Cherry a = new Cherry(400,250,15);
	Cherry b = new Cherry(300,300,25);
	Cherry c = new Cherry(550,270,30);
	Cherry d = new Cherry(90,270,42);
	
	Shape a2 = ShapeTransforms.translatedCopyOf(a,150,150);
	a2 = ShapeTransforms.rotatedCopyOf(a2, Math.PI/4.0);

	g2.draw(a2);
	g2.setColor(Color.RED); g2.draw(a);
	g2.setColor(new Color(0x8F00FF)); g2.draw(b);
	
	Shape b2 = ShapeTransforms.translatedCopyOf(b,100,100);
	b2 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/3.2);
	g2.draw(b2);

	g2.setStroke(orig);

	g2.setColor(Color.GREEN); g2.draw(c);
	g2.setColor(Color.MAGENTA); g2.draw(d);

	// Sign name.
	
	g2.setColor(Color.BLACK); 
	g2.drawString("Fruity Loops by Eliza Ruiz", 20,20);
    }
    
	    
    /** Draw a Cherry pattern.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	Cherry a = new Cherry(150,150,25);

	g2.setColor(Color.RED);
	g2.draw(a);

	Shape a2 = ShapeTransforms.translatedCopyOf(a,150,0); g2.draw(a2);
	Shape a3 = ShapeTransforms.translatedCopyOf(a2,150,0); g2.draw(a3);
	Shape a4 = ShapeTransforms.translatedCopyOf(a3,150,0); g2.draw(a4);
	Shape a5 = ShapeTransforms.translatedCopyOf(a4,150,0); g2.draw(a5);
	Shape a6 = ShapeTransforms.translatedCopyOf(a5,150,0); g2.draw(a6);
	Shape a7 = ShapeTransforms.translatedCopyOf(a,0,150); g2.draw(a7);
	Shape a8 = ShapeTransforms.translatedCopyOf(a7,150,0); g2.draw(a8);
	Shape a9 = ShapeTransforms.translatedCopyOf(a8,150,0); g2.draw(a9);
        Shape a10 = ShapeTransforms.translatedCopyOf(a9,150,0); g2.draw(a10);
        Shape a11 = ShapeTransforms.translatedCopyOf(a10,150,0); g2.draw(a11);
        Shape a12 = ShapeTransforms.translatedCopyOf(a11,150,0); g2.draw(a12);
    	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setColor(Color.BLACK); 
	g2.drawString("Cherry Pattern by Eliza Ruiz", 20,20);

    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Three Fruits by Eliza Ruiz", 20,20);
	
	
	Fruit a = new Fruit(100,100,40);
	Fruit b = new Fruit(200,200,40);
	Fruit c = new Fruit(300,300,40);

	g2.setColor(Color.RED); g2.draw(a);
	g2.setColor(Color.YELLOW); g2.draw(b);
	g2.setColor(Color.BLUE); g2.draw(c);
    }       
}
