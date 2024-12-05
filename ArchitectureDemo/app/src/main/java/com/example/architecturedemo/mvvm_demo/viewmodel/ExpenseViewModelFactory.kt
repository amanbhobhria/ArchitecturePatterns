package com.example.architecturedemo.mvvm_demo.viewmodel

import android.view.View
import android.widget.ViewSwitcher.ViewFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.architecturedemo.mvvm_demo.model.ExpenseRepository

@Suppress("UNCHECKED_CAST")
class ExpenseViewModelFactory(var repository: ExpenseRepository):ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ExpenseViewModel(repository) as T
    }


}