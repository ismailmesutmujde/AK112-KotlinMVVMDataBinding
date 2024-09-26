package com.ismailmesutmujde.kotlinmvvmdatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ismailmesutmujde.kotlinmvvmdatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = DataBindingUtil.setContentView(this, R.layout.activity_main)  // Access the design

        // DataBinding Setup
        // 1) Add the buildFeatures { } code block to build.gradle(app) and set databinding = true.
        // 2) Then add a layout tag to the top of activity.main.xml and move the xml related codes in ConstraintLayout to the layout.
        // 3) Access design and visual objects in Activity (Main)


        // Access the visual objects
        bindingMain.textViewResult.text = "0"

        bindingMain.buttonSum.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val sum = number1 + number2
            bindingMain.textViewResult.text = sum.toString()
        }

        bindingMain.buttonSubtract.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val subtract = number1 - number2
            bindingMain.textViewResult.text = subtract.toString()
        }

        bindingMain.buttonMultiply.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val multiply = number1 * number2
            bindingMain.textViewResult.text = multiply.toString()
        }
        bindingMain.buttonDivide.setOnClickListener {
            val receivedNumber1 = bindingMain.editTextNumber1.text.toString()
            val receivedNumber2 = bindingMain.editTextNumber2.text.toString()

            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            val divide = number1 / number2
            bindingMain.textViewResult.text = divide.toString()
        }

    }
}