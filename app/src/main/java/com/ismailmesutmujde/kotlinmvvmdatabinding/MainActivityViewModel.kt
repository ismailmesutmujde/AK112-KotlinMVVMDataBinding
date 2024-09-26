package com.ismailmesutmujde.kotlinmvvmdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var result = MutableLiveData<String>()

    var mRepo = MathematicsRepository()

    init {
        result = mRepo.getMathResult()
    }

    fun makeSum(receivedNumber1:String, receivedNumber2:String) {
        mRepo.sum(receivedNumber1, receivedNumber2)
    }

    fun makeSubtract(receivedNumber1:String, receivedNumber2:String) {
        mRepo.subtract(receivedNumber1, receivedNumber2)
    }

    fun makeMultiply(receivedNumber1:String, receivedNumber2:String) {
        mRepo.multiply(receivedNumber1, receivedNumber2)
    }

    fun makeDivide(receivedNumber1:String, receivedNumber2:String) {
        mRepo.divide(receivedNumber1, receivedNumber2)
    }
}