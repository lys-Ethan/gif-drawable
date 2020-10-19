package com.ethanlee.test

object TestUtils {

    init {
        System.loadLibrary("native-lib")
    }

    fun doForJni():String{
        return jnitest()
    }

   private external fun jnitest():String

}