package com.daeseong.lottielib_test

import android.animation.Animator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main3Activity : AppCompatActivity() {

    private val tag = Main3Activity::class.java.simpleName

    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        init()
    }

    override fun onDestroy() {
        super.onDestroy()

        clear()
    }

    private fun init() {

        try {
            lottieAnimationView = findViewById(R.id.lav)
            lottieAnimationView.apply {
                visibility = View.VISIBLE
                repeatCount = ValueAnimator.INFINITE
                speed = 1.0f
                playAnimation()

                addAnimatorListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animator: Animator) {}

                    override fun onAnimationEnd(animator: Animator) {
                        finish()
                    }

                    override fun onAnimationCancel(animator: Animator) {}

                    override fun onAnimationRepeat(animator: Animator) {}
                })
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun clear() {

        try {
            lottieAnimationView.apply {
                cancelAnimation()
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}