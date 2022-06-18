package com.balaji_2_2_0_5.kotlinretrofit07

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.balaji_2_2_0_5.kotlinretrofit07.model.Post
import com.balaji_2_2_0_5.kotlinretrofit07.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository):ViewModel() {

    val myResponse:MutableLiveData<Response<Post>> = MutableLiveData()

    val myResponse2: MutableLiveData<Response<Post>> = MutableLiveData()

    val customResponse3: MutableLiveData<Response<List<Post>>> = MutableLiveData()

    val customResponse4:MutableLiveData<Response<List<Post>>> = MutableLiveData()

    val customResponse5:MutableLiveData<Response<List<Post>>> = MutableLiveData()

    val postResponse:MutableLiveData<Response<Post>> = MutableLiveData()


    fun getPost1(){
        viewModelScope.launch {
            val response=repository.getPost1()
            myResponse.value=response
        }

    }

    fun getPost2(number:Int){
        viewModelScope.launch {
            val response2=repository.getPost2(number)
            myResponse2.value=response2
        }
    }

    fun getCustomPost3(number: Int){
        viewModelScope.launch {
            val customResponse=repository.getCustomPost3(number)
            customResponse3.value=customResponse
        }
    }

    fun getCustomPost4(number:Int,sort:String,order:String){

        viewModelScope.launch {
            val response=repository.getCustomPost4(number,sort,order)
            customResponse4.value = response
        }
    }

    fun getCustomPost5(userid:Int,options:Map<String,String>){
        viewModelScope.launch {
            val response = repository.getCustomPosts5(userid,options)
            customResponse5.value = response
        }
    }

    fun pushPost(post:Post){
        viewModelScope.launch {
            val response = repository.pushPost(post)
            postResponse.value = response

        }
    }
}