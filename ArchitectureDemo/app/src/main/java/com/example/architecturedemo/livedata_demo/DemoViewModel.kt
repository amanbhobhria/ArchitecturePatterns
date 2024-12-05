package com.example.architecturedemo.livedata_demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DemoViewModel: ViewModel() {

    private val factsObject = MutableLiveData<String>("Hi Aman ")

    val newFactLiveData: LiveData<String>
        get() = factsObject




    fun updateFacts() {
        factsObject.value = "Hi Shivam meet for a coffee"
    }
}