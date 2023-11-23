package com.example.pesanin.repository

import com.example.pesanin.data.user.User
import com.example.pesanin.data.user.UserDao

class AuthRepository (
    private val userDao : UserDao
){
    fun registerUser(user : User) = userDao.registerUser(user)

    fun loginUser(email : String, password : String) = userDao.loginUser(email, password)

}