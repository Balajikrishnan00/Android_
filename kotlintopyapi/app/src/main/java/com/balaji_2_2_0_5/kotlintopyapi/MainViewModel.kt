package com.balaji_2_2_0_5.kotlintopyapi

import androidx.lifecycle.*
import com.balaji_2_2_0_5.kotlintopyapi.model.Posts
import com.balaji_2_2_0_5.kotlintopyapi.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(val repository: Repository):ViewModel() {

    val getResponse1 :MutableLiveData<Response<Posts>> = MutableLiveData()


    fun getPost1(){
        viewModelScope.launch {
            val res1 = repository.getPosts()
            getResponse1.value = res1
        }
    }

}

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}