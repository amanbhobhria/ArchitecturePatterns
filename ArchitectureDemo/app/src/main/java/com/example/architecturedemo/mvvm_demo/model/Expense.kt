package com.example.architecturedemo.mvvm_demo.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "expense_table")
data class Expense(

    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val type:String,
    val amount:String,
    val date: String,
    val description:String
)