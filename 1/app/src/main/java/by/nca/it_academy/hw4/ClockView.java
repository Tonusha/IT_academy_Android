package by.nca.it_academy.hw4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by user on 16.02.2018.
 */

public class ClockView extends View {
    private Paint paint;
    private float radius;
    private float cx;
    private float cy;
    private float ch;
    private float cw;
    private Shape shape;

    public ClockView(Context context) {
        super(context);
        init();
    }

    public ClockView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init() {
        paint = new Paint();
        paint.setColor(10);
        paint.setColor(Color.parseColor("#888888"));
        paint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ch = h;
        cw = w;
        cx = w / 5;
        cy = h / 5;
        radius = cx > cy ? cy : cx;
        cx = w/2;
        cy = h/4;

        //float wRec = h * 0.2f; // h/100% * 20%
        float hRec = w * 0.9f; // w/100% * 90%


        //rect.left = (w - wRec) / 2;
        //rect.right = w - rect.left;
        //rect.top = (h - hRec) / 2;
        //rect.bottom = h - rect.top;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawCircle(cx, cy, radius, paint);
        paint.setColor(Color.parseColor("#111111"));
        canvas.drawCircle(cx, cy, 5, paint);
        //canvas.drawLine(0, 0, 0, 0, paint);
//        invalidate();

    }
}
