package com.example.architecturedemo.livedata_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.architecturedemo.R
import com.example.architecturedemo.databinding.ActivityDemo1Binding

class DemoActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityDemo1Binding
    private lateinit var viewModel: DemoViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDemo1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel =ViewModelProvider(this)[DemoViewModel::class.java]

        viewModel.newFactLiveData.observe(this) {
            binding.textView1.text = it
        }


        binding.updateBtn.setOnClickListener {
            viewModel.updateFacts()
        }


    }
}