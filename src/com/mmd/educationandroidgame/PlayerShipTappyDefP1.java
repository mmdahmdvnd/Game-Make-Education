package com.mmd.educationandroidgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class PlayerShipTappyDefP1 {
    private Bitmap bitmap;
    private int x, y;
    private int speed;

    // Constructor
    public PlayerShipTappyDefP1(Context context) {
        x = 50;
        y = 50;
        speed = 1;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ship);

    }

    public void update() {
        x++;
    }

    //Getters
    public Bitmap getBitmap() {

        return bitmap;
    }

    public int getSpeed() {

        return speed;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }
}
