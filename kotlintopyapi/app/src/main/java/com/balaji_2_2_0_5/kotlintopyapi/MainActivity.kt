package com.balaji_2_2_0_5.kotlintopyapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.balaji_2_2_0_5.kotlintopyapi.repository.Repository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()

        val viewModelFactory = MainViewModelFactory(repository)

        val mainViewModel:MainViewModel = ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]

        mainViewModel.getPost1()

        mainViewModel.getResponse1.observe(this, Observer{
            if (it.isSuccessful){
                val text1 =findViewById<TextView>(R.id.text1)
                text1.text = it.body()!!.userid.toString()
            }else{
                Log.d("response",it.errorBody().toString())
            }
        })

    }
}