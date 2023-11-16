package com.daeseong.lottielib_test

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main4Activity : AppCompatActivity() {

    private val tag = Main4Activity::class.java.simpleName

    private lateinit var lottieAnimationView: LottieAnimationView

    private var handler: Handler? = null
    private var delay: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        init()
    }

    override fun onDestroy() {
        super.onDestroy()

        clear()
    }

    private fun init() {

        lottieAnimationView = findViewById(R.id.lav)

        delay = lottieAnimationView.duration + 2000

        handler = Handler(mainLooper)
        handler?.postDelayed({
            startActivity(Intent(this@Main4Activity, MainActivity::class.java))
            finish()
        }, delay)
    }

    private fun clear() {

        try {
            lottieAnimationView.apply {
                cancelAnimation()
            }

            handler?.apply {
                removeCallbacksAndMessages(null)
                handler = null
            }
        } catch (ex: Exception) {
        }
    }
}