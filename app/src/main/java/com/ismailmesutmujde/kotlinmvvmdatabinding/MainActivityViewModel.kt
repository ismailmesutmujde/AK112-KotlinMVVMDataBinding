package com.ismailmesutmujde.kotlinmvvmdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var result = MutableLiveData<String>()

    init {
        result = MutableLiveData<String>("0")
    }

    fun makeSum(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val sum = number1 + number2
        result.value = sum.toString()
    }

    fun makeSubtract(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val subtract = number1 - number2
        result.value = subtract.toString()
    }

    fun makeMultiply(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val multiply = number1 * number2
        result.value = multiply.toString()
    }

    fun makeDivide(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val divide = number1 / number2
        result.value = divide.toString()
    }
}