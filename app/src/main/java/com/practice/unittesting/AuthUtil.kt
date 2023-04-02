package com.practice.unittesting

object AuthUtil {
    private val users = listOf("Sajjad", "Muhammad", "Abid")

    fun signUp(
        userName: String,
        password: String,
        repeatPassword: String
    ): Boolean {
        return when {
            userName.isEmpty() || password.isEmpty() -> false
            users.contains(userName) -> false
            password != repeatPassword -> false
            password.length < 2 -> false
            else -> true
        }
    }
}
