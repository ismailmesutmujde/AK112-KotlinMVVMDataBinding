package com.ismailmesutmujde.kotlinmvvmdatabinding

import androidx.lifecycle.MutableLiveData

class MathematicsRepository {
    var mathematicalResult = MutableLiveData<String>()

    init {
        mathematicalResult = MutableLiveData<String>("0")
    }

    fun getMathResult() : MutableLiveData<String> {
        return mathematicalResult
    }

    fun sum(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val sum = number1 + number2
        mathematicalResult.value = sum.toString()
    }

    fun subtract(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val subtract = number1 - number2
        mathematicalResult.value = subtract.toString()
    }

    fun multiply(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val multiply = number1 * number2
        mathematicalResult.value = multiply.toString()
    }

    fun divide(receivedNumber1:String, receivedNumber2:String) {
        val number1 = receivedNumber1.toDouble()
        val number2 = receivedNumber2.toDouble()
        val divide = number1 / number2
        mathematicalResult.value = divide.toString()
    }
}