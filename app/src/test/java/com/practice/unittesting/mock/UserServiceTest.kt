package com.practice.unittesting.mock

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {
    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUser(anyString(), anyString()))
            .thenReturn(LOGIN_STATUS.INVALID_PASSWORD)
    }

    @Test
    fun loginUser() {
        val userService = UserService(userRepository)
        val status = userService.loginUser("dms", "sd")
        assertEquals("password not correct", status)
    }
}