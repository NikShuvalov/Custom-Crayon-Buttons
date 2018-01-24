package shuvalov.nikita.customcrayonviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

/**
 * Created by NikitaShuvalov on 8/14/17.
 */
public class CustomCrayonButton extends android.support.v7.widget.AppCompatButton {
    private Paint mLinePaint;
    private boolean mUseAutoPadding;

    public CustomCrayonButton(Context context) {
        super(context);
        mUseAutoPadding = true;
    }


    public CustomCrayonButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomCrayonButton,0,0);
        try{
            mUseAutoPadding = ta.getBoolean(R.styleable.CustomCrayonButton_autoPadding, false);
        }finally {
            ta.recycle();
        }
    }

    public CustomCrayonButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomCrayonButton,0,0);
        try{
            mUseAutoPadding = ta.getBoolean(R.styleable.CustomCrayonButton_autoPadding, true);
        }finally {
            ta.recycle();
        }
    }

    private void init(){
        createPaints();
        if(mUseAutoPadding) {
            int sidePadding = getWidth()/4;
            setPadding(sidePadding, 0, sidePadding, 0);
        }
    }

    private void createPaints(){
        mLinePaint = new Paint();
        mLinePaint.setColor(Color.BLACK);
        mLinePaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();

        mLinePaint.setStrokeWidth(width/15);

        int xLine1 = width/10;
        int xLine2 = width/5;
        int xLine3 = (int)(width * 8/10.0);
        int xLine4 = (int)(width * 9/10.0);

        canvas.drawLine(xLine1, 0, xLine1,height, mLinePaint);
        canvas.drawLine(xLine2, 0, xLine2, height, mLinePaint);

        canvas.drawLine(xLine3, 0, xLine3, height, mLinePaint);
        canvas.drawLine(xLine4, 0, xLine4, height, mLinePaint);

        super.onDraw(canvas);
    }
}
