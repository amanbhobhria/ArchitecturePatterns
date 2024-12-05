package com.example.architecturedemo.mvvm_demo.model

import androidx.lifecycle.LiveData


class ExpenseRepository(private val expenseDao: ExpenseDao) {




    fun getExpense():LiveData<List<Expense>>
    {
      return expenseDao.getAllExpense()
    }


    suspend fun insertExpense(expense: Expense){
        expenseDao.insertExpense(expense)
    }


}