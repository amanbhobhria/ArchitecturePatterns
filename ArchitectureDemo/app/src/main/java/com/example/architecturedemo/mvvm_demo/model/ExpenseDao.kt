package com.example.architecturedemo.mvvm_demo.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ExpenseDao {


    @Query("SELECT * FROM expense_table")
    fun getAllExpense(): LiveData<List<Expense>>


    @Query("SELECT * FROM expense_table WHERE id = :id")
    fun getExpenseById(id: Int): Expense


    @Insert
    suspend fun insertExpense(expense: Expense)



}