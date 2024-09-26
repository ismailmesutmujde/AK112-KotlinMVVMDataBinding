package com.ismailmesutmujde.kotlinmvvmdatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DataBinding Setup
        // 1) Add the buildFeatures { } code block to build.gradle(app) and set databinding = true.
        // 2) Then add a layout tag to the top of activity.main.xml and move the xml related codes in ConstraintLayout to the layout.

    }
}