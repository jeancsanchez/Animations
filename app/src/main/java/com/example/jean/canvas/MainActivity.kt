package com.example.jean.canvas

import android.animation.ValueAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.LinearInterpolator

class MainActivity : AppCompatActivity() {

    lateinit var ball: CustomView
    var y = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ball = findViewById(R.id.ball)

        ball.setOnClickListener {
            startAnimation()
        }
    }

    private fun startAnimation() {
        val start = if (y == -1) 0f else 200f
        val end = if (y == -1) 200f else 0f
        y *= -1

        ValueAnimator.ofFloat(start, end)
                .also {
                    it.addUpdateListener { listener ->
                        ball.translationY = listener.animatedValue as Float
                    }

                    it.interpolator = LinearInterpolator()
                    it.duration = 200
                    it.start()
                }
    }
}
