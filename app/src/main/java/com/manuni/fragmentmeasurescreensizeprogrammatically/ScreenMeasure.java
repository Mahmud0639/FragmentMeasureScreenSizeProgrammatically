package com.manuni.fragmentmeasurescreensizeprogrammatically;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenMeasure {
    public float dpWidth;
    public float dpHeight;

    public ScreenMeasure(Activity activity){
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();

        display.getMetrics(outMetrics);
        float density = activity.getResources().getDisplayMetrics().density;

        dpWidth = outMetrics.widthPixels/density;
        dpHeight = outMetrics.heightPixels/density;
    }
    public float getDpWidth(){
        return dpWidth;
    }
    public float getDpHeight(){
        return dpHeight;
    }
}
