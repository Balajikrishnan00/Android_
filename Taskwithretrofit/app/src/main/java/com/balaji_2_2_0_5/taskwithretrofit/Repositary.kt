package com.balaji_2_2_0_5.taskwithretrofit

import com.balaji_2_2_0_5.taskwithretrofit.api.RetroInstance
import com.balaji_2_2_0_5.taskwithretrofit.model.modeljsonItem
import retrofit2.Response

class Repositary {

    suspend fun getPost():Response<modeljsonItem>{
       return RetroInstance.api.getPost()
    }
}