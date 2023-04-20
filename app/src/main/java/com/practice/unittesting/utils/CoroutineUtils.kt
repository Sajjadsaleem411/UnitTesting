package com.practice.unittesting.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineUtils(private val dispatcher: CoroutineDispatcher) {
    suspend fun getUserName():String{
        delay(10000)
        return "Sajjad"
    }
    suspend fun getUser():String{
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
        }
        return "user- Sajjad"
    }
    suspend fun getAddress():String{
        CoroutineScope(dispatcher).launch {
            delay(2000)
        }
        return "user- Sajjad"
    }

    var globalVar = false

    suspend fun setGlobalVar() {
        CoroutineScope(dispatcher).launch {
            globalVar = true
        }
    }
}