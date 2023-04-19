package com.practice.unittesting

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizePalindrome(private val input: String, private val expectedValue: Boolean) {
    @Test
    fun `check palindrome for parameterize`() {
        assertEquals(Utils.isPalindrome(input), expectedValue)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: {0} is palindrome - {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("sajjad", false),
                arrayOf("", true),
                arrayOf("level", true),
                arrayOf("sajjas", true),
                arrayOf("muhammad", false),
            )
        }
    }
}