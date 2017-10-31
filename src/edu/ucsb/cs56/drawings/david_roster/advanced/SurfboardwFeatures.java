package edu.ucsb.cs56.drawings.david_roster.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;


/**
   A Cooler Surfboard
      
   @author David Roster
   @version for CS56, W17, UCSB
   
*/
public class SurfboardwFeatures extends Surfboard implements Shape
{
    /**
     * Class SurfboardwFeatures that takes existing surfboard and adds features
     */
    public SurfboardwFeatures(double x, double y, double width, double height)
    {
	// construct the basic surfboard shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	//Make a leash w/ tie for foot
	//put designs like polka dots and maybe lines
	
	double leashX = x + 2*height;;
	double leashY = y + width/4;
	
	CubicCurve2D leash = new CubicCurve2D.Double();
	leash.setCurve(leashX, leashY, leashX+15, leashY+20, leashX + 175, leashY + 25, leashX+75, leashY+ 180);

	double RectLeashX = leashX + 75;
	double RectLeashY = leashY + 180;

	Rectangle2D.Double RectLeash =
	    new Rectangle2D.Double(RectLeashX, RectLeashY,15,15);

	Ellipse2D.Double PolkaDot1 =
            new Ellipse2D.Double(x+ x/8, y+ y/8, 15, 15);
        Ellipse2D.Double PolkaDot2 =
            new Ellipse2D.Double(x+ x/8 + x/8, y+ y/8, 15, 15);
        Ellipse2D.Double PolkaDot3 =
            new Ellipse2D.Double(x+ x/8 + x/8 + x/8, y + y/8,  15, 15);
        Ellipse2D.Double PolkaDot4 =
            new Ellipse2D.Double(x + x/8 + x/8 + x/8 + x/8, y+ y/8, 15, 15);
      //  Ellipse2D.Double PolkaDot5 =
        //   new Ellipse2D.Double(x+ x/4, y+ y/9, 15, 15);
	

        GeneralPath wholeSurf = this.get();
        wholeSurf.append(leash, false); 
	wholeSurf.append(RectLeash, false);
	wholeSurf.append(PolkaDot1, false);
	wholeSurf.append(PolkaDot2, false);
	wholeSurf.append(PolkaDot3, false);
	wholeSurf.append(PolkaDot4, false);

	}
}
