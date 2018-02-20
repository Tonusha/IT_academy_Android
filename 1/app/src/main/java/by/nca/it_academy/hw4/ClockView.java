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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.Math.round;

/**
 * Created by user on 16.02.2018.
 */

public class ClockView extends View {
    private Paint paint;
    private float radius;
    private float cx;
    private float cy;
    private final Integer HOUR = 12;
    private Calendar calendar;
    private Date date;

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
        date = new Date();
        calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        cx = w / 5;
        cy = h / 5;
        radius = cx > cy ? cy : cx;
        cx = w / 2;
        cy = h / 4;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(cx, cy, radius, paint);
        paint.setColor(Color.parseColor("#111111"));
        canvas.drawCircle(cx, cy, 5, paint);
        canvas.save();
        int rotateCanvas = 30;
        paint.setTextSize(radius / 6);
        for (int i = HOUR; i >= 1; i--) {
            canvas.drawLine(cx, cy + Math.round(radius * 0.9), cx, cy + radius, paint);
            canvas.rotate(rotateCanvas, cx, cy);
        }
        ;
        canvas.drawText("6", cy + Math.round(radius * 0.9), cy + radius, paint);
        canvas.drawText("9", cy, cy + Math.round(radius * 0.9), paint);
        canvas.drawText("3", cy, cy - Math.round(radius * 0.9), paint);
        canvas.drawText("12", cy - Math.round(radius * 0.9), cy + radius, paint);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        paint.setStrokeWidth(20f);
        canvas.save();
        canvas.rotate(minute * 6 - 180, cx, cy);
        canvas.drawLine(cx, cy, cx, cy + radius - cy * 0.1f, paint);
        canvas.restore();
        paint.setStrokeWidth(30f);
        canvas.save();
        canvas.rotate(hour * 30 - 180 + minute * 0.5f, cx, cy);
        canvas.drawLine(cx, cy, cx, cy + radius - cy * 0.2f, paint);
        canvas.restore();


    }


//        invalidate();


}
