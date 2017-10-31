package edu.ucsb.cs56.drawings.wmui.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 A Bunk Bed
 
 @author Wilson Mui
 @version for CS56, F17, UCSB
 
 */
public class BunkBed extends Bed implements Shape
{
    /**
     * Constructor for objects of class BunkBed
     */
    public BunkBed(double x, double y, double length, double height)
    {
        // construct the basic bed
        super(x,y,length,height/2);
        drawBed(x, y+(height/2), length, height/2);
        
    }
  
}

