package com.daeseong.lottielib_test

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main5Activity : AppCompatActivity() {

    private val tag = Main5Activity::class.java.simpleName

    private lateinit var lottieAnimationView: LottieAnimationView

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
            lottieAnimationView = findViewById(R.id.lav)
            lottieAnimationView.apply {
                setAnimation("3.json")
                loop(false)

                Log.e(this@Main5Activity.tag, "init: $duration")

                addAnimatorListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animator: Animator) {}

                    override fun onAnimationEnd(animator: Animator) {
                        Log.e(this@Main5Activity.tag, "onAnimationEnd: $duration")
                    }

                    override fun onAnimationCancel(animator: Animator) {}

                    override fun onAnimationRepeat(animator: Animator) {}
                })
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun start() {

        try {
            if (!lottieAnimationView.isAnimating) {
                lottieAnimationView.playAnimation()
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun stop() {

        try {
            if (lottieAnimationView.isAnimating) {
                lottieAnimationView.cancelAnimation()
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    private fun clear() {

        try {
            lottieAnimationView.apply {
                removeAllLottieOnCompositionLoadedListener()
                removeAllAnimatorListeners()
                removeAllLottieOnCompositionLoadedListener()
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}