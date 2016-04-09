package in.excogitation.lib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * @author Nishant Srivastava
 */
public class StackedHorizontalProgressBar extends ProgressBar {
    private Paint paint;
    int primary_progress, max_value;

    public StackedHorizontalProgressBar(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        primary_progress = 0;
        max_value = 100;
    }

    public StackedHorizontalProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        primary_progress = 0;
        max_value = 100;
    }

    @Override
    public synchronized void setMax(int max) {
        this.max_value = max;
        super.setMax(max);
    }

    @Override
    public synchronized void setProgress(int progress) {
        if (progress > max_value) {
            progress = max_value;
        }
        this.primary_progress = progress;
        super.setProgress(progress);
    }

    @Override
    public synchronized void setSecondaryProgress(int secondaryProgress) {
        if ((primary_progress + secondaryProgress) > max_value) {
            secondaryProgress = (max_value - primary_progress);
        }
        super.setSecondaryProgress(primary_progress + secondaryProgress);
    }
}
