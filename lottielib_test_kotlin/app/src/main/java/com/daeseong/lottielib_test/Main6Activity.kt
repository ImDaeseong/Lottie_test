package com.daeseong.lottielib_test

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class Main6Activity : AppCompatActivity() {

    private val tag = Main6Activity::class.java.simpleName

    private var view1: View? = null
    private var view2: View? = null
    private var view3: View? = null
    private var view4: View? = null
    private var view5: View? = null

    private var lottieAnimationView1: LottieAnimationView? = null
    private var lottieAnimationView2: LottieAnimationView? = null
    private var lottieAnimationView3: LottieAnimationView? = null
    private var lottieAnimationView4: LottieAnimationView? = null
    private var lottieAnimationView5: LottieAnimationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        view1 = findViewById<View>(R.id.lottie_view1)
        view2 = findViewById<View>(R.id.lottie_view2)
        view3 = findViewById<View>(R.id.lottie_view3)
        view4 = findViewById<View>(R.id.lottie_view4)
        view5 = findViewById<View>(R.id.lottie_view5)

        view1!!.setOnClickListener(View.OnClickListener {

            Log.e(tag,"lottieAnimationView1")
        })

        view2!!.setOnClickListener(View.OnClickListener {

            Log.e(tag,"lottieAnimationView2")
        })

        view3!!.setOnClickListener(View.OnClickListener {

            Log.e(tag,"lottieAnimationView3")
        })

        view4!!.setOnClickListener(View.OnClickListener {

            Log.e(tag,"lottieAnimationView4")
        })

        view5!!.setOnClickListener(View.OnClickListener {

            Log.e(tag,"lottieAnimationView5")
        })

        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        clear()
    }

    private fun init() {

        try {

            lottieAnimationView1 = view1!!.findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView2 = view2!!.findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView3 = view3!!.findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView4 = view4!!.findViewById<View>(R.id.lav) as LottieAnimationView
            lottieAnimationView5 = view5!!.findViewById<View>(R.id.lav) as LottieAnimationView

            lottieAnimationView1!!.setAnimation("1.json")
            lottieAnimationView2!!.setAnimation("2.json")
            lottieAnimationView3!!.setAnimation("3.json")
            lottieAnimationView4!!.setAnimation("1.json")
            lottieAnimationView5!!.setAnimation("2.json")

            lottieAnimationView1!!.repeatCount = 10
            lottieAnimationView2!!.repeatCount = 10
            lottieAnimationView3!!.repeatCount = 10
            lottieAnimationView4!!.repeatCount = 10
            lottieAnimationView5!!.repeatCount = 10

            lottieAnimationView1!!.playAnimation()
            lottieAnimationView2!!.playAnimation()
            lottieAnimationView3!!.playAnimation()
            lottieAnimationView4!!.playAnimation()
            lottieAnimationView5!!.playAnimation()

        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
        }
    }

    private fun clear() {

        try {

            if (lottieAnimationView1 != null) {
                lottieAnimationView1!!.cancelAnimation()
            }

            if (lottieAnimationView2 != null) {
                lottieAnimationView2!!.cancelAnimation()
            }

            if (lottieAnimationView3 != null) {
                lottieAnimationView3!!.cancelAnimation()
            }

            if (lottieAnimationView4 != null) {
                lottieAnimationView4!!.cancelAnimation()
            }

            if (lottieAnimationView5 != null) {
                lottieAnimationView5!!.cancelAnimation()
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}