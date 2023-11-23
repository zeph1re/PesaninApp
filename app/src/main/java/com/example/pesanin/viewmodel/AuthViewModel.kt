package com.example.pesanin.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pesanin.repository.AuthRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AuthViewModel(authRepository : AuthRepository) : ViewModel() {

    var isLoggedIn = mutableStateOf(false)
        private set
    fun login(email : String, password : String) {
        viewModelScope.launch (Dispatchers.IO) {
            val isValidCredential = authUser(email, password)

            isLoggedIn.value = isValidCredential
        }
    }

    private fun authUser (email: String, password: String) : Boolean {
        return email.isNotEmpty() && password.isNotEmpty()
    }
}