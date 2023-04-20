package com.practice.unittesting.utils

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class UtilsTest {
    @get:Rule
    val mainCoroutineRule = MainCoroutineRule()
    lateinit var utils: CoroutineUtils

    @Before
    fun setup() {
        utils = CoroutineUtils(mainCoroutineRule.testDispatcher)
    }

    @Test
    fun `check coroutine getUserName`() {
        runTest {
            CoroutineUtils(mainCoroutineRule.testDispatcher).getUser()
        }
    }

    @Test
    fun `check coroutine Main dispatcher getUser`() {
        runTest {
            CoroutineUtils(mainCoroutineRule.testDispatcher).getUser()
        }
    }


    @Test
    fun `dispatcher in queue we set value and check`() {
        runTest {
            mainCoroutineRule.apply {
                utils.setGlobalVar()
                testDispatcher.scheduler.advanceUntilIdle()
                assertEquals(true, utils.globalVar)
            }
        }
    }
}