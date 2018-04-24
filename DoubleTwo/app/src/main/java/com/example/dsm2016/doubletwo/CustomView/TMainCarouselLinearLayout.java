package com.example.dsm2016.doubletwo.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class TMainCarouselLinearLayout extends RelativeLayout {

    public TMainCarouselLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TMainCarouselLinearLayout(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        float width = size.x;
        float height = (float) (size.y * 0.4);

        canvas.scale(width, height);
    }
}
