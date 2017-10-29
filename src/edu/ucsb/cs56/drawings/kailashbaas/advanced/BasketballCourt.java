package edu.ucsb.cs56.drawings.kailashbaas.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A basketball court

   @author Kailash Baas
   @version for CS56, F17, UCSB
*/
public class BasketballCourt extends SportsField implements Shape
{
    /**
       Constructor for objects of class BasketballCourt
       To create a basketball court proportional to an NBA court,
       make sure the ratio width:length = 25:47

       @param x x coordinate of upper left corner of court
       @param y y coordinate of upper left corner of court
       @param width width of the court
       @param length length of the court
    */
    public BasketballCourt(double x, double y, double width, double length)
    {
        // As with sports field, the width of the field is the height of the rectangle
        super(x, y, width, length);

        GeneralPath gp = this.get();

        double key1X = x;
        double key1Y = y + (19 * width / 50);
        double keyLength = 19 * length / 94;
        double keyWidth = 6 * width / 25;

        double key2X = x + length - keyLength;
        double key2Y = key1Y;

        Rectangle2D.Double key1 = new Rectangle2D.Double(key1X, key1Y, keyLength, keyWidth);
        Rectangle2D.Double key2 = new Rectangle2D.Double(key2X, key2Y, keyLength, keyWidth);

        double key1CircleX = x + keyLength - (keyWidth / 2);
        double key1CircleY = key1Y;
        double keyCircleDiameter = keyWidth;

        double key2CircleX = key2X - (keyWidth / 2);
        double key2CircleY = key1CircleY;

        Ellipse2D.Double keyCircle1 = new Ellipse2D.Double(key1CircleX, key1CircleY, keyCircleDiameter, keyCircleDiameter);
        Ellipse2D.Double keyCircle2 = new Ellipse2D.Double(key2CircleX, key2CircleY, keyCircleDiameter, keyCircleDiameter);

        double flat3ptLine1TopX1 = x; // same initial x for top and bot line
        double flat3ptLine1TopX2 = x + (7 * length / 94); // same final x for top and bot line
        double flat3ptLine1TopY = y + (3 * width / 50);

        double flat3ptLine1BotY = y + (47 * width / 50);

        Line2D.Double flat3ptLine1Top = new Line2D.Double(flat3ptLine1TopX1, flat3ptLine1TopY, flat3ptLine1TopX2, flat3ptLine1TopY);
        Line2D.Double flat3ptLine1Bot = new Line2D.Double(flat3ptLine1TopX1, flat3ptLine1BotY, flat3ptLine1TopX2, flat3ptLine1BotY);

        double arc3ptLine1Y = flat3ptLine1TopY;
        double arcHeight = 22 * width / 25;
        double arcWidth = (arcHeight / 2) + (12 * length / 47);
        double arc3ptLine1X = flat3ptLine1TopX2 - (arcWidth / 2);

        Arc2D.Double arc3ptLine1 = new Arc2D.Double(arc3ptLine1X, arc3ptLine1Y, arcWidth, arcHeight, 90, -180, Arc2D.OPEN);

        double flat3ptLine2TopX1 = x + length;
        double flat3ptLine2TopX2 = flat3ptLine2TopX1 - (7 * length / 94);
        double flat3ptLine2TopY = flat3ptLine1TopY;

        double flat3ptLine2BotY = flat3ptLine1BotY;

        Line2D.Double flat3ptLine2Top = new Line2D.Double(flat3ptLine2TopX1, flat3ptLine2TopY, flat3ptLine2TopX2, flat3ptLine2TopY);
        Line2D.Double flat3ptLine2Bot = new Line2D.Double(flat3ptLine2TopX1, flat3ptLine2BotY, flat3ptLine2TopX2, flat3ptLine2BotY);

        double arc3ptLine2Y = flat3ptLine2TopY;
        double arc3ptLine2X = flat3ptLine2TopX2 - (arcWidth / 2);

        Arc2D.Double arc3ptLine2 = new Arc2D.Double(arc3ptLine2X, arc3ptLine2Y, arcWidth, arcHeight, 90, 180, Arc2D.OPEN);

        gp.append(key1, false);
        gp.append(keyCircle1, false);

        gp.append(key2, false);
        gp.append(keyCircle2, false);

        gp.append(flat3ptLine1Top, false);
        gp.append(flat3ptLine1Bot, false);
        gp.append(arc3ptLine1, false);

        gp.append(flat3ptLine2Top, false);
        gp.append(flat3ptLine2Bot, false);
        gp.append(arc3ptLine2, false);
    }
}
