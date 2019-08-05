/*
 * Copyright © 2016 Nishant Srivastava
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

package github.nisrulz.stackedhorizontalprogressbarproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private var countPrimary = 10
    private var countSecondary = 0
    private val max = 100
    private val primaryPts = 50
    private val secondaryPts = 40

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stackedHorizontalProgressBar.max = max

        btnReload.setOnClickListener {
            countPrimary = 0
            stackedHorizontalProgressBar.progress = countPrimary
            txtViewPrimary.text = "Primary Value : $countPrimary%"

            countSecondary = 0
            stackedHorizontalProgressBar.secondaryProgress = countSecondary
            txtViewSecondary.text = "Secondary Value : $countSecondary%"

            updateValuesWithDelay()
        }

        // Update on load
        updateValuesWithDelay()
    }


    private fun updateValuesWithDelay() {
        val executor = Executors.newSingleThreadScheduledExecutor()
        executor.scheduleWithFixedDelay({
            updateValues()

            if (countPrimary > primaryPts) {
                executor.shutdown()
            }
        }, 0, 100, TimeUnit.MILLISECONDS)
    }

    private fun updateValues() {
        if (countSecondary <= secondaryPts) {
            stackedHorizontalProgressBar.secondaryProgress = countSecondary
            txtViewSecondary.text = "Secondary Value : $countSecondary%"
            countSecondary++
        }

        if (countPrimary <= primaryPts) {
            stackedHorizontalProgressBar.progress = countPrimary
            txtViewPrimary.text = "Primary Value : $countPrimary%"
            countPrimary++
        }
    }
}
