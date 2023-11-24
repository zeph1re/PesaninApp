package com.example.pesanin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pesanin.repository.Repository

class HomeViewModelFactory (private val repository: Repository) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T = HomeViewModel(repository) as T

}