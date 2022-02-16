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
package com.github.nisrulz.stackedhorizontalprogressbar

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ProgressBar

class StackedHorizontalProgressBar : ProgressBar {
    private var primaryProgress = 0
    private var maxValue = 0
    private val paint: Paint by lazy { Paint() }

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    override fun setMax(max: Int) {
        maxValue = max
        super.setMax(max)
    }

    override fun setProgress(progress: Int) {
        var progressValue = progress
        if (progressValue > maxValue) {
            progressValue = maxValue
        }
        primaryProgress = progressValue
        super.setProgress(progressValue)
    }

    override fun setSecondaryProgress(secondaryProgress: Int) {
        var secondaryProgressValue = secondaryProgress
        if (primaryProgress + secondaryProgressValue > maxValue) {
            secondaryProgressValue = maxValue - primaryProgress
        }
        super.setSecondaryProgress(primaryProgress + secondaryProgressValue)
    }

    private fun init() {
        paint.color = Color.BLACK
        primaryProgress = 0
        maxValue = 100
    }
}