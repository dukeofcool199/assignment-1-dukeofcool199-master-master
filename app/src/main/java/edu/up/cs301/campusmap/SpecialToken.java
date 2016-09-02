package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Color;
/**
   Author: Jenkin Schibel
    Date: 8/31/2016
    class creates a token shaped like a square person
 */
public class SpecialToken extends SimpleMapToken
{
    private final int head;
    private final int body;
    private final int legs;
    private final int arms;


    public SpecialToken(float theX,float theY)
    {
        super(theX,theY);
        radius = 0;
        head = this.colorMaker();
        body = this.colorMaker();
        legs = this.colorMaker();
        arms = this.colorMaker();


    }
    public void drawOn(Canvas canvas)
    {
        this.paint.setColor(head);
        canvas.drawRect(x,y,x+40,y+40,this.paint);// head
        this.paint.setColor(Color.BLACK);
        canvas.drawOval(x+5,y+10,x+15,y+20,this.paint);// eyes
        canvas.drawOval(x+25,y+10,x+35,y+20,this.paint);
        this.paint.setColor(body);
        canvas.drawOval(x,y+38,x+40,y+80,this.paint);// center
        this.paint.setColor(arms);
        canvas.drawRect(x-30,y+45,x+3,y+65,this.paint);// left arm
        canvas.drawRect(x+35,y+45,x+70,y+65,this.paint);// right arm
        this.paint.setColor(legs);
        canvas.drawRect(x+3,y+65,x+17,y+100,this.paint);// left leg
        canvas.drawRect(x+23,y+65,x+37,y+100,this.paint);// right leg
    }

    /**
     *
     * @return new color to randomize colors of different parts of special tokens
     */
    protected int colorMaker()
    {
        int newColor = 0;
        int red = rand.nextInt();
        int green = rand.nextInt();
        int blue = rand.nextInt();

        newColor = Color.rgb(red,green,blue);
        return newColor;
    }
}
