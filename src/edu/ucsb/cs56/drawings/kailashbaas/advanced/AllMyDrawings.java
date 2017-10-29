package edu.ucsb.cs56.drawings.kailashbaas.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing either a basic
 * sports field, a basketball court, or a few houses and
 * cups (left over from code by Phill Conrad)
 * 
 * @author Kailash Baas
 * @version for CS56, F17, UCSB 
 */

public class AllMyDrawings
{
    /** Draw a picture of a basic sports field
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
        g2.drawString("A sports field by Kailash Baas", 20, 20);

        SportsField field = new SportsField(100, 100, 300, 564);
        g2.setColor(Color.BLACK);
        g2.draw(field);
    }
    
    
    /** Draw a picture of a basketball court
     */
    public static void drawPicture2(Graphics2D g2) {
	
        g2.drawString("A basketball court by Kailash Baas", 20, 20);
        BasketballCourt court = new BasketballCourt(100, 100, 300, 564);
        g2.setColor(Color.BLACK);
        g2.draw(court);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
	
	
	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }
}
