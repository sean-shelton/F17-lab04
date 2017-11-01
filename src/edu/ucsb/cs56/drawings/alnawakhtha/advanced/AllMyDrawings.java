package edu.ucsb.cs56.drawings.alnawakhtha.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/** A class containing methods of drawing butterflies onto a frame
   @author Yusuf Alnawakhtha
   @version for CS56, F17, UCSB
 */

public class AllMyDrawings
{
    /** Draw a picture with a few different butterflies (some with patterns and some without) by using shape transformations 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Butterfly b1 = new Butterfly(100,150,75,60);
	g2.setColor(Color.RED); g2.draw(b1);
      
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
       
	
	Stroke orig=g2.getStroke();
	g2.setColor(new Color(0x002FA7)); 
	
	
     
	ButterflyWithPattern bp1 = new ButterflyWithPattern(50,350,75,60);
	ButterflyWithPattern bp2 = new ButterflyWithPattern(200,350,200,160);

	
	g2.draw(bp1);
	g2.setStroke(thick);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bp2);
	g2.draw(b2); 
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few different butterflies -- 'To Pimp A Butterfly'", 20,20);
    }
    
    
    /** Draw a picture with a few butterflies (some with patterns and some without) and rotate with varius degrees
     */
    public static void drawPicture2(Graphics2D g2) {
	
	Butterfly small = new Butterfly(200,50,40,30);
       
	g2.setColor(Color.GREEN);   g2.draw(small);
	
	Butterfly b1 = new Butterfly(100,200,75,60);
	g2.setColor(Color.RED); g2.draw(b1);
	
      
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	b2 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/4.0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
     
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	b2 = ShapeTransforms.rotatedCopyOf(b2,- Math.PI/2.0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);    
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	ButterflyWithPattern bp1 = new ButterflyWithPattern(50,350,75,60);
	ButterflyWithPattern bp2 = new ButterflyWithPattern(200,350,75,60);

	g2.setStroke(orig);
	g2.draw(bp1);
	g2.setColor(new Color(0x8F00FF)); 
	
	
	Shape bp3 = ShapeTransforms.rotatedCopyOf(bp2, Math.PI/2.0);
	
	g2.draw(bp3);
	
	
	
	g2.setColor(Color.BLACK); 
	g2.drawString("Rotating Butterflies", 20,20);
    }
    
    /** Draw a picture of butterflies with patterns and scale their size by an integer multiple of the original butterfly
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Butterflies of Different Sizes -- 'Bye Bye Butterfree'", 20,20);
	
      
	
	ButterflyWithPattern b1 = new ButterflyWithPattern(20,50,40,32);
	g2.setColor(Color.GREEN);   g2.draw(b1);

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,2,2);
	b2 = ShapeTransforms.translatedCopyOf(b2,100,100);
	g2.setColor(Color.CYAN); g2.draw(b2);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);

	
	b2 = ShapeTransforms.scaledCopyOfLL(b2,1.5,1.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,100,100);
	g2.setColor(Color.BLACK); g2.draw(b2);

	b2 = ShapeTransforms.scaledCopyOfLL(b2,1.75,1.75);
	b2 = ShapeTransforms.translatedCopyOf(b2,125,125);
	g2.setColor(Color.RED); g2.draw(b2);
	
    }       
}
