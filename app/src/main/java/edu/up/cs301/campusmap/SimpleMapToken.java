package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Properties;
import java.util.Random;

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Jenkin Schibel
 * @version August 2015
 */
public class SimpleMapToken
{

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //paint object
    protected int theColor = 0; //new color
    protected Random rand = new Random(); //random number maker

    /**
     * Constructor
     */
    public SimpleMapToken(float xCoord, float yCoord)
    {
        // initialize the instance variables
        int red = rand.nextInt(255);
        int green = rand.nextInt(255);
        int blue = rand.nextInt(255);
        x = xCoord;
        y = yCoord;
        radius = 15;
        paint = new Paint();
        theColor = Color.rgb(red, green, blue);
        paint.setColor(theColor);
    }//ctor

    /**
     * this token can paint itself on a given canvas
     */
    public void drawOn(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
