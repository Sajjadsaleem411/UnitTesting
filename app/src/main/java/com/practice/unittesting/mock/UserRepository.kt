package com.practice.unittesting.mock

class UserRepository {

    private val users = listOf<User>(
        User(1, "Sajjad", "sajjad@gmail.com", "Abcd123@"),
        User(2, "muhammad", "user@gmail.com", "Abc123@"),
        User(3, "user", "muhammad@gmail.com", "Acd123@")
    )

    fun loginUser(email: String, password: String): LOGIN_STATUS {
        val users = users.filter { user -> user.email == email }
        return if (users.size == 1) {
            if (users[0].password == password) {
                LOGIN_STATUS.SUCCESS
            } else {
                LOGIN_STATUS.INVALID_PASSWORD
            }
        } else {
            LOGIN_STATUS.INVALID_USER
        }
    }
}