package com.example.tankardtavern;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Hero {
    Context context;
    Bitmap hero;
    int ox, oy;
    Random random;

    public Hero(Context context) {
        this.context = context;
        hero = BitmapFactory.decodeResource(context.getResources(), R.drawable.hero);
        random = new Random();
        ox = random.nextInt(TankardTavern.screenWidth);
        oy = TankardTavern.screenHeight - hero.getHeight();
    }

    public Bitmap gethero(){
        return hero;
    }

    int getheroWidth(){
        return hero.getWidth();
    }
}
