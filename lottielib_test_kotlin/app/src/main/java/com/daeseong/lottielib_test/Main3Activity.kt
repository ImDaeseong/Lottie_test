package com.daeseong.lottielib_test

import android.animation.Animator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main3Activity : AppCompatActivity() {

    private val tag = Main3Activity::class.java.simpleName

    private var lottieAnimationView: LottieAnimationView? = null

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

            lottieAnimationView = findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView!!.visibility = View.VISIBLE
            lottieAnimationView!!.repeatCount = ValueAnimator.INFINITE
            lottieAnimationView!!.speed = 1.0f
            lottieAnimationView!!.playAnimation()

            lottieAnimationView!!.addAnimatorListener(object : Animator.AnimatorListener {

                override fun onAnimationStart(animator: Animator) {

                }

                override fun onAnimationEnd(animator: Animator) {

                    finish()
                }

                override fun onAnimationCancel(animator: Animator) {

                }

                override fun onAnimationRepeat(animator: Animator) {

                }
            })

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun clear() {

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView!!.cancelAnimation()
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}