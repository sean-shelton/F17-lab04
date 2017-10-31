package edu.ucsb.cs56.drawings.wmui.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 A vector drawing of a bed that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.
 
 @author Wilson Mui
 @version for CS56, F17, UCSB
 
 */
public class Bed extends GeneralPathWrapper implements Shape
{
    /**
     Constructor
     
     @param x x coord of top left corner of bed
     @param y y coord of top left corner of bed
     @param length of the bed
     @param height of bed
     */
    
    
    
    public Bed(double x, double y, double length, double height)
    {
        
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        drawBed(x,y,length,height);
    }
    
    /**
     Draws a Bed at coordinates x,y of length 'length' and height 'height'
     */
    public void drawBed(double x, double y, double length, double height){
        double bedPostLength = length/15;
        double mattressLength = length - bedPostLength*2;
        double mattressHeight = height/10 * 6;
        //for measurement
        double bedunit = height/10;
        
        //make both bed posts
        Rectangle2D.Double fstpost = new Rectangle2D.Double(x, y, bedPostLength, height);
        Rectangle2D.Double sndpost = new Rectangle2D.Double(x+length-bedPostLength, y, bedPostLength, height);
        
        //make slat
        Rectangle2D.Double slat = new Rectangle2D.Double(x+bedPostLength, y+(bedunit*8), mattressLength, bedunit);
        
        //make mattress
        Rectangle2D.Double mattress = new Rectangle2D.Double(x+bedPostLength, y+(bedunit*2), mattressLength, (bedunit*7));
        
        //put bed together
        
        GeneralPath wholeBed = this.get();
        
        wholeBed.append(fstpost, false);
        wholeBed.append(sndpost, false);
        wholeBed.append(slat, false);
        wholeBed.append(mattress, false);
    }
    
    
}
