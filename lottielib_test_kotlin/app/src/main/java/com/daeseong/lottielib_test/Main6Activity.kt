package com.daeseong.lottielib_test

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main6Activity : AppCompatActivity() {

    private val tag = Main6Activity::class.java.simpleName

    private lateinit var lottieAnimationViews: List<LottieAnimationView>
    private lateinit var clickableViews: List<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        clickableViews = listOf(
            findViewById(R.id.lottie_view1),
            findViewById(R.id.lottie_view2),
            findViewById(R.id.lottie_view3),
            findViewById(R.id.lottie_view4),
            findViewById(R.id.lottie_view5)
        )

        lottieAnimationViews = clickableViews.map { view ->
            view.findViewById<LottieAnimationView>(R.id.lav).apply {
                setAnimation(when (view.id) {
                    R.id.lottie_view1 -> "1.json"
                    R.id.lottie_view2 -> "2.json"
                    R.id.lottie_view3 -> "3.json"
                    R.id.lottie_view4 -> "1.json"
                    R.id.lottie_view5 -> "2.json"
                    else -> throw IllegalArgumentException("Invalid view ID")
                })
                repeatCount = 10
                playAnimation()
            }
        }

        setClickListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        clear()
    }

    private fun setClickListeners() {
        clickableViews.forEachIndexed { index, view ->
            view.setOnClickListener {
                Log.e(tag, "lottieAnimationView${index + 1}")
            }
        }
    }

    private fun clear() {

        lottieAnimationViews.forEach {
            it.cancelAnimation()
        }
    }
}