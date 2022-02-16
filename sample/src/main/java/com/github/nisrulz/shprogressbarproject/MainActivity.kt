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

package com.github.nisrulz.shprogressbarproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.nisrulz.shprogressbarproject.databinding.ActivityMainBinding
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private var countPrimary = 10
    private var countSecondary = 0
    private val max = 100
    private val primaryPts = 50
    private val secondaryPts = 40

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.apply {
            setContentView(root)
            stackedHorizontalProgressBar.max = max

            btnReload.setOnClickListener {
                countPrimary = 0
                setPrimaryText()

                countSecondary = 0
                setSecondaryText()
                updateValuesWithDelay()
            }
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


    fun setPrimaryText() {
        binding.stackedHorizontalProgressBar.progress = countPrimary
        binding.txtViewPrimary.text = getString(R.string.primary_value, countPrimary)

    }

    fun setSecondaryText() {
        binding.stackedHorizontalProgressBar.secondaryProgress = countSecondary
        binding.txtViewSecondary.text = getString(R.string.secondary_value, countSecondary)

    }


    private fun updateValues() {
        binding.apply {
            if (countSecondary <= secondaryPts) {
                setSecondaryText()
                countSecondary++
            }

            if (countPrimary <= primaryPts) {
                setPrimaryText()
                countPrimary++
            }
        }
    }
}
