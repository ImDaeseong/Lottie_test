package com.daeseong.lottielib_test

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main4Activity : AppCompatActivity() {

    private val tag = Main4Activity::class.java.simpleName

    private var lottieAnimationView: LottieAnimationView? = null

    private var handler: Handler? = null
    private var lDelay: Long = 0

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

        lottieAnimationView = findViewById<View>(R.id.lav) as LottieAnimationView

        lDelay = lottieAnimationView!!.duration + 2000

        handler = Handler(mainLooper)
        handler!!.postDelayed({

            startActivity(Intent(this@Main4Activity, MainActivity::class.java))
            finish()

        }, lDelay)
    }

    private fun clear() {

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView!!.cancelAnimation()
            }

            if (handler != null) {
                handler!!.removeCallbacksAndMessages(null)
                handler = null
            }

        } catch (ex: Exception) {
            Log.e(tag, ex.message!!)
        }

    }
}