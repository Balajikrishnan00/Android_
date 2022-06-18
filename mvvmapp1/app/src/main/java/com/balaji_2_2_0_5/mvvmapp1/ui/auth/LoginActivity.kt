package com.balaji_2_2_0_5.mvvmapp1.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.balaji_2_2_0_5.mvvmapp1.R
import com.balaji_2_2_0_5.mvvmapp1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(),AuthListner {
    //private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityLoginBinding.inflate(layoutInflater)
        //val view = binding.root
        //setContentView(view)

        val binding:ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewmodel = ViewModelProvider(this)[AuthViewModel::class.java]
        binding.viewmodel = viewmodel
        viewmodel.authListner = this

    }
    override fun onStarted() {
        Toast.makeText(this,"on Started",Toast.LENGTH_LONG).show()
    }
    override fun onSuccess() {
        Toast.makeText(this,"on Success",Toast.LENGTH_LONG).show()
    }
    override fun onFailure() {
        Toast.makeText(this,"on Failure",Toast.LENGTH_LONG).show()
    }
}