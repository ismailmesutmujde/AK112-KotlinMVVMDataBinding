package com.ismailmesutmujde.kotlinmvvmdatabinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.ismailmesutmujde.kotlinmvvmdatabinding.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private lateinit var bindingTest : FragmentTestBinding
    private lateinit var viewModel: TestFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindingTest = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)   // Access the design

        // DataBinding Setup
        // 1) Add the buildFeatures { } code block to build.gradle(app) and set databinding = true.
        // 2) Then add a layout tag to the top of fragment_text.xml and move the xml related codes in FrameLayout to the layout.
        // 3) Access design and visual objects in Activity (Main)

        // Access visual objects
        bindingTest.textResult = viewModel.result

        return bindingTest.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // definition viewModel in fragment
        val tempViewModel : TestFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }

    fun buttonTestClick() {
        viewModel.testFunction()
    }

}