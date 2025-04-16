package com.alian.zawadimart.repository

import com.alian.zawadimart.data.UserDao
import com.alian.zawadimart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}