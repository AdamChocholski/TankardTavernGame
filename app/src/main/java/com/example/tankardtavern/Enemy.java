package com.example.tankardtavern;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Enemy {
    Context context;
    Bitmap bandit;
    int ex, ey;
    int enemyVelocity;
    Random random;

    public Enemy(Context context) {
        this.context = context;
        bandit = BitmapFactory.decodeResource(context.getResources(), R.drawable.bandit);
        random = new Random();
        ex = 200 + random.nextInt(400);
        ey = 0;
        enemyVelocity = 14 + random.nextInt(10);
    }

    public Bitmap getBandit(){
        return bandit;
    }

    int getBanditWidth(){
        return bandit.getWidth();
    }

    int getbanditHeight(){
        return bandit.getHeight();
    }
}
