package com.ismailmesutmujde.kotlinmvvmdatabinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ismailmesutmujde.kotlinmvvmdatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = DataBindingUtil.setContentView(this, R.layout.activity_main)  // Access the design
        bindingMain.mainActivityObject = this

        // DataBinding Setup
        // 1) Add the buildFeatures { } code block to build.gradle(app) and set databinding = true.
        // 2) Then add a layout tag to the top of activity.main.xml and move the xml related codes in ConstraintLayout to the layout.
        // 3) Access design and visual objects in Activity (Main)

        bindingMain.calculationResult = viewModel.result

    }

    // Event Handle
    fun buttonSumClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.makeSum(receivedNumber1,receivedNumber2)
        bindingMain.calculationResult = viewModel.result
    }

    fun buttonSubtractClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.makeSubtract(receivedNumber1,receivedNumber2)
        bindingMain.calculationResult = viewModel.result
    }

    fun buttonMultiplyClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.makeMultiply(receivedNumber1,receivedNumber2)
        bindingMain.calculationResult = viewModel.result
    }

    fun buttonDivideClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.makeDivide(receivedNumber1,receivedNumber2)
        bindingMain.calculationResult = viewModel.result
    }
}