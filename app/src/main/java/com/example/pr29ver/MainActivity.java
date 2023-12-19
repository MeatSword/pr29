package com.example.pr29ver;



import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import javax.security.auth.callback.Callback;


public class MainActivity extends Activity {


    private CustomImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (CustomImageView) findViewById(R.id.custom_view);
        imgView.setDrawCustomCanvas(true);
        imgView.invalidate();

        Resources res = this.getResources();

        ImageView sunImageView = findViewById(R.id.sun);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.xml.sun_rise);

        sunImageView.startAnimation(sunRiseAnimation);

        ImageView clockImageView = findViewById(R.id.clock);

        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.xml.clock_anim);
        clockImageView.startAnimation(clockTurnAnimation);

        ImageView hourImageView = findViewById(R.id.hour_hand);

        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.xml.hours_anim);

        hourImageView.startAnimation(hourTurnAnimation);
    }
}