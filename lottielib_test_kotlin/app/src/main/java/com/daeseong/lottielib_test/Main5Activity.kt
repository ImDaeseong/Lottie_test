package com.daeseong.lottielib_test

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main5Activity : AppCompatActivity() {

    private val tag = Main5Activity::class.java.simpleName

    private var lottieAnimationView: LottieAnimationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        init()

        start()
    }

    override fun onStop() {
        super.onStop()

        stop()
    }

    override fun onDestroy() {
        super.onDestroy()

        clear()
    }

    private fun init() {

        try {

            lottieAnimationView = findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView!!.setAnimation("3.json")
            lottieAnimationView!!.loop(false)

            Log.e(tag, "init:" + lottieAnimationView!!.duration.toString())

            lottieAnimationView!!.addAnimatorListener(object : Animator.AnimatorListener {

                override fun onAnimationStart(animator: Animator) {

                }

                override fun onAnimationEnd(animator: Animator) {

                    Log.e(tag,"onAnimationEnd:" + lottieAnimationView!!.duration.toString())
                }

                override fun onAnimationCancel(animator: Animator) {

                }

                override fun onAnimationRepeat(animator: Animator) {

                }

            })

        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
        }
    }

    private fun start() {

        try {

            val isPlay = lottieAnimationView!!.isAnimating
            if (!isPlay) {
                lottieAnimationView!!.playAnimation()
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun stop() {

        try {

            val isPlay = lottieAnimationView!!.isAnimating
            if (isPlay) {
                lottieAnimationView!!.cancelAnimation()
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun clear() {

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView!!.removeAllLottieOnCompositionLoadedListener()
                lottieAnimationView!!.removeAllAnimatorListeners()
                lottieAnimationView!!.removeAllLottieOnCompositionLoadedListener()
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}