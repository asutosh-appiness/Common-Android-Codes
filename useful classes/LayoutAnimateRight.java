package com.adaptiz.taxi.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;

/**
 * Created by Adaptiz on 1/19/16.
 */
public class LayoutAnimateRight {

    private DisplayMetrics metrics;
    private float widthFull, widthForNavDrawerToSlide;


    public LayoutAnimateRight(FrameLayout frame, Context c){

        metrics = c.getResources().getDisplayMetrics();
        widthFull = metrics.widthPixels;
        widthForNavDrawerToSlide = (float) (widthFull/1.2);


        if(MyApplication.navigationDrawerStatus.equals("closed")){

            frame.animate()
                    .translationX(widthForNavDrawerToSlide)
                    .setDuration(500)
                    .start();
            MyApplication.navigationDrawerStatus = "open";
        }
        else if(MyApplication.navigationDrawerStatus.equals("open")){

            frame.animate()
                    .translationX(0)
                    .setDuration(500)
                    .start();
            MyApplication.navigationDrawerStatus = "closed";
        }


    }


}
