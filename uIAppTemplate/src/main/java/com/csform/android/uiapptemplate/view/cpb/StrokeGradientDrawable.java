package com.csform.android.uiapptemplate.view.cpb;

import android.graphics.drawable.GradientDrawable;

public class StrokeGradientDrawable {

    private int mStrokeWidth;
    private int mStrokeColor;

    private final GradientDrawable mGradientDrawable;

    public StrokeGradientDrawable(GradientDrawable drawable) {
        mGradientDrawable = drawable;
    }

    public int getStrokeWidth() {
        return mStrokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        mStrokeWidth = strokeWidth;
        mGradientDrawable.setStroke(strokeWidth, mStrokeColor);
    }

    public int getStrokeColor() {
        return mStrokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        mStrokeColor = strokeColor;
        mGradientDrawable.setStroke(mStrokeWidth, strokeColor);
    }

    public GradientDrawable getGradientDrawable() {
        return mGradientDrawable;
    }
}
