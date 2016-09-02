package edu.up.cs301.campusmap;

import android.graphics.Rect;
import android.graphics.Canvas;


/**
 * Author: Jenkin Schibel
 * Date: 8/31/2016
 * this class creates a square token
 */
public class SquareToken extends SimpleMapToken
{
    Rect r = new Rect(0,0,0,0);


    public SquareToken(float theX,float theY)
    {
        super(theX,theY);
        this.radius = 0;


    }
    public void drawOn(Canvas canvas) {
        canvas.drawRect(x,y,x + 30,y + 30, paint);
    }
}
