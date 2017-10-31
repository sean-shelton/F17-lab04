package edu.ucsb.cs56.drawings.wmui.advanced;

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
 * @author Wilson Mui
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few beds
     */
    
    public static void drawPicture1(Graphics2D g2) {
        
        Bed h1 = new Bed(100,250,120,75);
        g2.setColor(Color.CYAN); g2.draw(h1);
        
        // Make a bed that's half the size,
        // and moved over 150 pixels in x direction
        
        Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        g2.setColor(Color.BLACK);
        g2.draw(h2);
        
        // Here's a bed that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        
        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        
        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x
        
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(h2);
        
        
         BunkBed hw1 = new BunkBed(50,350,40,75);
         BunkBed hw2 = new BunkBed(200,10,200,500);
         g2.draw(hw1);
         g2.setColor(new Color(0x8F00FF));
        g2.draw(hw2);
        BunkBed hw3 = new BunkBed(300, 200, 200, 420);
        g2.setColor(Color.BLACK);
        g2.draw(hw3);
        
         // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
        
         g2.setStroke(orig);
         g2.setColor(Color.BLACK);
         g2.drawString("A mess of beds - Wilson Mui", 20,20);
        
         
         }
         
         
      /**Draw a picture with a few houses and coffee cups
         */
        public static void drawPicture2(Graphics2D g2) {
            
            // Draw some beds.
            
            BunkBed large = new BunkBed(100,50,225,150);
            BunkBed small = new BunkBed(20,50,40,30);
            BunkBed tallSkinny = new BunkBed(20,150,20,40);
            BunkBed shortFat = new BunkBed(20,250,40,20);
            
            g2.setColor(Color.RED);     g2.draw(large);
            g2.setColor(Color.GREEN);   g2.draw(small);
            g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
            g2.setColor(Color.MAGENTA); g2.draw(shortFat);
            
            Bed h1 = new Bed(100,250,50,75);
            g2.setColor(Color.CYAN); g2.draw(h1);
            
            // Make a black bed that's half the size,
            // and moved over 150 pixels in x direction
            Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
            h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
            g2.setColor(Color.BLACK); g2.draw(h2);
            
            // Here's a bed that's 4x as big (2x the original)
            // and moved over 150 more pixels to right.
            h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
            h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
            
            // We'll draw this with a thicker stroke
            Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
            
            // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
            // #002FA7 is "International Klein Blue" according to Wikipedia
            // In HTML we use #, but in Java (and C/C++) its 0x
            
            Stroke orig=g2.getStroke();
            g2.setStroke(thick);
            g2.setColor(new Color(0x002FA7));
            g2.draw(h2);
            
            // Draw two bunkbeds
            
            BunkBed hw1 = new BunkBed(50,350,40,75);
            BunkBed hw2 = new BunkBed(200,350,200,100);
            
            g2.draw(hw1);
            g2.setColor(new Color(0x8F00FF));
            
            // Rotate the second bed 45 degrees around its center.
            Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
            
            g2.draw(hw3);
            
            // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
            
            g2.setStroke(orig);
            g2.setColor(Color.BLACK);
            g2.drawString("A bunch of Beds - Wilson", 20,20);
        }
        
        /** Draw a different picture with a few beds and bunkbeds
         */
        
        public static void drawPicture3(Graphics2D g2) {
            
            // label the drawing
            
            g2.drawString("A bed or two - Wilson", 20,20);
            
            
            // Draw some bunkbeds.
            
            BunkBed large = new BunkBed(100,50,225,150);
            BunkBed small = new BunkBed(20,50,40,30);
            
            g2.setColor(Color.RED);     g2.draw(large);
            g2.setColor(Color.GREEN);   g2.draw(small);
            
        }
    }
