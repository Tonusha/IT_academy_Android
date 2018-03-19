package by.nca.it_academy.work.cw4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import by.nca.it_academy.R;

/**
 * Created by user on 16.02.2018.
 */

public class CustomView extends View {
    private Paint paint;
    private float radius;
    private float cx;
    private float cy;
    private float ch;
    private float cw;
    // private Line
    private RectF rect;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init() {
        paint = new Paint();
        paint.setColor(10);
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ch = h;
        cw = w;
        cx = w / 8;
        cy = h / 8;
        radius = cx > cy ? cy : cx;
        // line =
        rect = new RectF();

        float wRec = h * 0.2f; // h/100% * 20%
        float hRec = w * 0.9f; // w/100% * 90%


        rect.left = (w - wRec) / 2;
        rect.right = w - rect.left;
        rect.top = (h - hRec) / 2;
        rect.bottom = h - rect.top;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(cx, cy, radius, paint);
        //canvas.drawLine(0,0, cw, ch, paint);
        //canvas.drawRect(rect, paint);
//        canvas.save();
//        invalidate();
//        canvas.rotate(90, cx,cy);
//        canvas.restore();
//        canvas.save();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                rect.contains(event.getX(), event.getY());

                break;
            }
            case MotionEvent.ACTION_UP: {
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                cx = event.getX();
                cy = event.getY();
                invalidate();
                return false;

            }
        }
        return true;
    }
}
