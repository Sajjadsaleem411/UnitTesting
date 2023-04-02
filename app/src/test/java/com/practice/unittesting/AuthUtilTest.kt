package com.practice.unittesting

import org.junit.Assert.*
import org.junit.Test

class AuthUtilTest {
    @Test
    fun `signup function return false when username or password is empty`() {
        val userName = ""
        val password = ""
        val repeatPassword = ""
        assertEquals(AuthUtil.signUp(userName, password, repeatPassword), false)
    }

    @Test
    fun `signup function return false when username already taken`() {
        val userName = "Muhammad"
        val password = "123456"
        val repeatPassword = "123456"
        assertEquals(AuthUtil.signUp(userName, password, repeatPassword), false)
    }

    @Test
    fun `signup function return false when passwords not match`() {
        val userName = "Sajjad"
        val password = "123457"
        val repeatPassword = "123456"
        assertEquals(AuthUtil.signUp(userName, password, repeatPassword), false)
    }

    @Test
    fun `signup function return false when password less then 2 digit`() {
        val userName = "Saleem"
        val password = "1"
        val repeatPassword = "1"
        assertEquals(AuthUtil.signUp(userName, password, repeatPassword), false)
    }
}
