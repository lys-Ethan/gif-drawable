package com.ethanlee.gifdrawable.main

import android.graphics.Bitmap
import java.io.InputStream

class Gif {

    var frameCount: Int = 0
        private set

    var duration: Long = 0
        private set

    var width:Int = 0

    var height:Int = 0

    private constructor()

    private var gifHandle:Long = 0

    private external fun getBitmapByIndex(index:Int, bitmap: Bitmap, gifHandle:Long):Bitmap
    private external fun decodeFromStream(inputStream: InputStream):Gif
    private external fun decodeFromAssats(inputStream: InputStream):Gif



    private external fun getFrameFromNative(bitmap: Bitmap,index: Int):Long

    fun getFrame(bitmap: Bitmap,index: Int):Long{
        return getFrameFromNative(bitmap,index)
    }


}