package edu.ucsb.cs56.drawings.kailashbaas.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a generic sports field that
   implements the Shape interface, so it can be
   drawn, as well as rotated, scaled, etc., and
   extends GeneralPathWrapper
   The field is drawn so that each half of the
   court is on the left or right side of the court.

   @author Kailash Baas
   @version for CS56, F17, UCSB
*/
public class SportsField extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coordinate of upper left corner of field
       @param y y coordinate of upper left corner of field
       @param width width of the field
       @param length length of the field
    */
    public SportsField(double x, double y, double width, double length)
    {
        // Beacuse of how the field is drawn, the width of the field
        // acts as the height of the rectangle representing the field

        double circleDiameter = 6 * width / 25;
        double circleX = x + ((length - circleDiameter) / 2);
        double circleY = y + ((width - circleDiameter) / 2);

        Rectangle2D.Double field = new Rectangle2D.Double(x, y, length, width);
        Ellipse2D.Double halfCourtCircle = new Ellipse2D.Double(circleX, circleY, circleDiameter, circleDiameter);
        Line2D.Double halfCourtLine = new Line2D.Double(x + (length / 2), x, y + (length / 2), y + width);

        GeneralPath completeField = this.get();
        completeField.append(field, false);
        completeField.append(halfCourtCircle, false);
        completeField.append(halfCourtLine, false);
    }
}
