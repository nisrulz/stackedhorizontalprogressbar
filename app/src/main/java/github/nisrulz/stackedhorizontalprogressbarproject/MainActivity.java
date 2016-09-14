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

package github.nisrulz.stackedhorizontalprogressbarproject;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import github.nisrulz.stackedhorizontalprogressbar.StackedHorizontalProgressBar;

public class MainActivity extends AppCompatActivity {

  final int primary_pts = 50;
  int secondary_pts = 30;
  int max = 100;

  int countPrimary = 0;
  int countSecondary = 0;
  StackedHorizontalProgressBar stackedHorizontalProgressBar;
  Handler handlerPrimaryProgress, handlerSecondaryProgress;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    stackedHorizontalProgressBar =
        (StackedHorizontalProgressBar) findViewById(R.id.stackedhorizontalprogressbar);
    stackedHorizontalProgressBar.setMax(max);

    handlerPrimaryProgress = new Handler();
    handlerSecondaryProgress = new Handler();

    handlerPrimaryProgress.post(runnablePrimary);
    handlerSecondaryProgress.post(runnableSecondary);
  }

  Runnable runnablePrimary = new Runnable() {
    @Override
    public void run() {
      if (countPrimary < primary_pts) {
        stackedHorizontalProgressBar.setProgress(countPrimary);
        handlerPrimaryProgress.postDelayed(runnablePrimary, 50);
        countPrimary++;
      }
    }
  };

  Runnable runnableSecondary = new Runnable() {
    @Override
    public void run() {
      if (countSecondary < secondary_pts) {
        stackedHorizontalProgressBar.setSecondaryProgress(countPrimary);
        handlerSecondaryProgress.postDelayed(runnableSecondary, 50);
        countSecondary++;
      }
    }
  };
}
