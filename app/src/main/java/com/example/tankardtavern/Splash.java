package com.example.tankardtavern;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Splash {
    Bitmap splash[] = new Bitmap[9];
    int splashFrame;
    int eX, eY;

    public Splash(Context context, int eX, int eY) {
        splash[0] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[1] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[2] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[3] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[4] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[5] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[6] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[7] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);
        splash[8] = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.splash);

        splashFrame = 0;
        this.eX = eX;
        this.eY = eY;
    }

    public Bitmap getsplash(int explosionFrame){
        return splash[splashFrame];
    }
}