package com.example.pesanin.data.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert
    fun registerUser(user : User)

    @Update
    fun updateUser (user: User)

    @Query ("SELECT * FROM user WHERE username = :username")
    fun getUser(username: String ) : Flow<User>



}