package com.daeseong.lottielib_test

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main2Activity : AppCompatActivity() {

    private val tag = Main2Activity::class.java.simpleName

    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

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
                setAnimation("2.json")
                loop(false)
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