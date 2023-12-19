package com.example.pr29ver;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class CustomImageView extends View {
    private boolean drawCustomCanvas = false;
    private Paint mPaint;
    public CustomImageView(Context context) {
        super(context);

    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }
    public void setDrawCustomCanvas(boolean drawCustomCanvas)
    {
        this.drawCustomCanvas = drawCustomCanvas;
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setTextSize(40);
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        if(!drawCustomCanvas)
        {super.onDraw(canvas);}
        else{
            canvas.drawRect(25, 25, 100, 100,mPaint);

        }
    }

}