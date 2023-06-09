package com.practice.unittesting.utils

import java.util.Locale

object Utils {
    fun isPalindrome(value: String): Boolean {
        return value.lowercase(Locale.ROOT) == value.lowercase(Locale.ROOT).reversed()
    }
}