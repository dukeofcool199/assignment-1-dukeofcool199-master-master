package edu.up.cs301.campusmap;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * <!-- class CampusMapImageView -->
 *
 * This class displays the campus map.
 *
 * @author Steven R. Vegdahl
 * @author Jenkin Schibel
 * @version August 2015
 */
public class CampusMapImageView extends ImageView {

    // instance variables for the current and previous tokens
    private SimpleMapToken token;
    private SimpleMapToken prevToken;
    public ArrayList<SimpleMapToken> tokens = new ArrayList<SimpleMapToken>();

    public void setToken(SimpleMapToken tok) {
        // set the current and previous tokens, based on the new
        // token that has been given to us
        prevToken = token;
        token = tok;
    }

    /**
     * two-argument version of the constructor
     *
     * @param context Context object
     * @param attrs AttributeSet object
     */
    public CampusMapImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // perform the common constructor operations
        init();
    }

    /**
     * one-argument version of the constructor
     *
     * @param context Context object
     */
    public CampusMapImageView(Context context) {
        super(context);
        // perform the common constructor operations
        init();
    }

    /**
     * performs initialization common to both constructors
     */
    private void init() {
        token = new SimpleMapToken(0,0);
        prevToken = null;
    }

    @Override
    protected void onDraw(Canvas g) {
        super.onDraw(g);

        tokens.add(token);
        tokens.trimToSize();

        for(int i = 0; i < tokens.size(); i++)
        {
            tokens.get(i).drawOn(g);
        }
    }
    protected void clear()
    {
        tokens.clear();
        tokens.trimToSize();
        tokens.add(new SimpleMapToken(0,0));
    }
}


