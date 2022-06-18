package com.balaji_2_2_0_5.taskwithretrofit

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repositary=Repositary()

        val mainFactory= MainViewModelFactory(repositary)

        mainViewModel = ViewModelProvider(this,mainFactory)[MainViewModel::class.java]

        mainViewModel.getData()

        mainViewModel.response1.observe(this, Observer { res ->

            if (res.isSuccessful){
                Log.d("res",res.body()?.file_type.toString())
                Log.d("res",res.body()?.file.toString())
                Log.d("res",res.body()?.id.toString())
            }else{

                Log.d("res",res.errorBody().toString())

            }

        })

    }
}