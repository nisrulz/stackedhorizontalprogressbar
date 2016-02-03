package in.excogitation.lib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * @author Nishant Srivastava
 * @project Example-MVPTDD
 * @company Excogitation
 * @package in.excogitation.example_mvptdd
 * @date 03/Feb/2016
 */
public class StackedHorizontalProgressBar extends ProgressBar {
    private Paint paint;

    public StackedHorizontalProgressBar(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);
    }

    public StackedHorizontalProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLACK);
    }
}
