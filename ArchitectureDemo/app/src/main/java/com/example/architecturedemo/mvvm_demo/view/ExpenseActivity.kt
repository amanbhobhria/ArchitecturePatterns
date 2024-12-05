package com.example.architecturedemo.mvvm_demo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.architecturedemo.R
import com.example.architecturedemo.databinding.ActivityExpenseBinding
import com.example.architecturedemo.mvvm_demo.model.Expense
import com.example.architecturedemo.mvvm_demo.model.ExpenseDao
import com.example.architecturedemo.mvvm_demo.model.ExpenseDatabase
import com.example.architecturedemo.mvvm_demo.model.ExpenseRepository
import com.example.architecturedemo.mvvm_demo.viewmodel.ExpenseViewModel
import com.example.architecturedemo.mvvm_demo.viewmodel.ExpenseViewModelFactory

class ExpenseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExpenseBinding
    private lateinit var viewModel: ExpenseViewModel
    private lateinit var repository: ExpenseRepository
    private lateinit var expenseDao:ExpenseDao



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)


        expenseDao = ExpenseDatabase.getDatabase(this).expenseDao()
        repository = ExpenseRepository(expenseDao)



        viewModel = ViewModelProvider(this,ExpenseViewModelFactory(repository))[ExpenseViewModel::class.java]


        binding.btnShowExpense.setOnClickListener{
            viewModel.getExpense().observe(this) {
                binding.expenseTxt.text = it.toString()
            }
        }


        binding.btnAddExpense.setOnClickListener {


            val expense = Expense(
                type = binding.etType.text.toString(),
                amount = binding.etAmount.text.toString(),
                date = binding.etDate.text.toString(),
                description = binding.etDescription.text.toString()
            )
            viewModel.insertExpense(expense)

    }
}}