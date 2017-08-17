package com.example.cain.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

/**
 * 作者：David
 * 日期：2017/8/12 11:06
 * 作用：
 */

public class MyDemo01 extends View {
    public MyDemo01(Context context) {
        super(context);
    }

    public MyDemo01(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyDemo01(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        System.out.print("111");
        System.out.print("111");
        System.out.print("111");
        System.out.print("111");
        System.out.print("111");
        System.out.print("111");

        //绘制一个圆
       /* paint.setColor(Color.RED);//设置颜色
        paint.setStyle(Paint.Style.STROKE);//画线模式
        paint.setStrokeWidth(20);//线条宽度为20像素
        paint.setAntiAlias(true);//设置抗锯齿
        canvas.drawCircle(300, 300, 200, paint);*/

       //绘制一个点
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(50, 50, paint);

    }
}
