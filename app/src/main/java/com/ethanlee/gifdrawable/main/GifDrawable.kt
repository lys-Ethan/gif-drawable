package com.ethanlee.gifdrawable.main

import android.graphics.*
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.os.SystemClock
import java.io.InputStream

class GifDrawable(var gif: Gif) : Drawable(), Animatable {

    private var isRunning = false

    private var currentFrame: Int = 0

    private var currentBitmap: Bitmap = Bitmap.createBitmap(0,0,Bitmap.Config.ARGB_8888)
    private var dstRect: Rect = Rect()
    private var gifRunnable: GifRunnable = GifRunnable()
    private var timeDelay:Long = 0

    private val gifPaint: Paint by lazy {
        Paint().apply {}
    }

    fun performNextFrame(): Int {
        currentFrame++
        return if (currentFrame > gif.frameCount) {
            currentFrame = 1
            currentFrame
        } else currentFrame
    }

    override fun draw(canvas: Canvas) {
        canvas.drawBitmap(currentBitmap, null, dstRect, gifPaint)
        if (isRunning)
            scheduleSelf(
                gifRunnable,
                SystemClock.uptimeMillis() + timeDelay
            )
    }

    override fun setAlpha(alpha: Int) {
        gifPaint.alpha = alpha
    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSPARENT
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        gifPaint.colorFilter = colorFilter
    }

    override fun isRunning(): Boolean {
        return isRunning
    }

    override fun start() {
        if (isRunning) return
        isRunning = true
        scheduleSelf(gifRunnable,SystemClock.uptimeMillis())
    }

    override fun stop() {
        if (!isRunning) return
        isRunning = false
        unscheduleSelf(gifRunnable)
    }


    private inner class GifRunnable : Runnable {
        override fun run() {
            gif.getFrame(currentBitmap,performNextFrame())
            invalidateSelf()
        }

    }
}