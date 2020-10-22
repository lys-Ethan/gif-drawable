package com.ethanlee.main

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable

class GifDrawable: Drawable(), Animatable {

    private var isRunning = false

    private val gifPaint:Paint by lazy {
        Paint().apply {

        }
    }
    override fun draw(canvas: Canvas) {

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

    }

    override fun stop() {

    }
}