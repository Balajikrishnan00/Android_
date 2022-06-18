package com.balaji_2_2_0_5.taskwithretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.balaji_2_2_0_5.taskwithretrofit.model.modeljsonItem
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(val repositary: Repositary):ViewModel() {

    val response1:MutableLiveData<Response<modeljsonItem>> = MutableLiveData()


    fun getData(){

        viewModelScope.launch {
            val response =  repositary.getPost()
            response1.value=response
        }
    }
}


class MainViewModelFactory(val repositary: Repositary):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositary) as T
    }

}