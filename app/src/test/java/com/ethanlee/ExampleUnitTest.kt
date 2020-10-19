package com.ethanlee

import com.ethanlee.test.TestUtils
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testJni(){
        TestUtils.doForJni()
        assertEquals("Hello from C++",TestUtils.doForJni())
    }
}