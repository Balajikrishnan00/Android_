package com.balaji_2_2_0_5.mvvmapp1.ui.auth

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class AuthViewModel:ViewModel() {

    var authListner:AuthListner? = null

    var email:String? = "Enter Your Email"
    var password:String? = null



    fun onLoginButtonClick(view:View){

        authListner!!.onStarted()

        if ((email.isNullOrEmpty()) ||(password.isNullOrEmpty())){
            authListner!!.onFailure()
            return
        }
        authListner!!.onSuccess()
    }
}