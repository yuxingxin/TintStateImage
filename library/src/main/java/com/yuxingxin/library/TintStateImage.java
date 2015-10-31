package com.yuxingxin.library;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Sean on 15/10/31.
 */
public class TintStateImage extends ImageView{

    private static final int IMAGE_DEFAULT_COLOR = Color.GRAY;

    private ColorStateList mColorStateList;

    public TintStateImage(Context context) {
        this(context,null);
    }

    public TintStateImage(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TintStateImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.TintStateImage);

        mColorStateList = ta.getColorStateList(R.styleable.TintStateImage_colorStateList);
        ta.recycle();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (mColorStateList != null && mColorStateList.isStateful()){
            int color = mColorStateList.getColorForState(getDrawableState(),
                    IMAGE_DEFAULT_COLOR);
            super.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }
}
