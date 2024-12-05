package com.example.architecturedemo.mvvm_demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.architecturedemo.mvvm_demo.model.Expense
import com.example.architecturedemo.mvvm_demo.model.ExpenseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExpenseViewModel(private val repository: ExpenseRepository): ViewModel() {


    fun getExpense():LiveData<List<Expense>> {
       return repository.getExpense()


    }

    fun insertExpense(expense: Expense) {
        viewModelScope.launch {
            Dispatchers.IO

            repository.insertExpense(expense = expense)
        }
    }
}