package com.balaji_2_2_0_5.kotlinretrofit07

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balaji_2_2_0_5.kotlinretrofit07.repository.Repository

class MainViewModelFactory(private val repository: Repository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}