/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.stackedhorizontalprogressbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class StackedHorizontalProgressBar extends ProgressBar {
  private Paint paint;
  int primary_progress, max_value;

  public StackedHorizontalProgressBar(Context context) {
    super(context);
    init();
  }

  public StackedHorizontalProgressBar(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  @Override public synchronized void setMax(int max) {
    this.max_value = max;
    super.setMax(max);
  }

  @Override public synchronized void setProgress(int progress) {
    if (progress > max_value) {
      progress = max_value;
    }
    this.primary_progress = progress;
    super.setProgress(progress);
  }

  @Override public synchronized void setSecondaryProgress(int secondaryProgress) {
    if ((primary_progress + secondaryProgress) > max_value) {
      secondaryProgress = (max_value - primary_progress);
    }
    super.setSecondaryProgress(primary_progress + secondaryProgress);
  }

  private void init() {
    paint = new Paint();
    paint.setColor(Color.BLACK);
    primary_progress = 0;
    max_value = 100;
  }
}
