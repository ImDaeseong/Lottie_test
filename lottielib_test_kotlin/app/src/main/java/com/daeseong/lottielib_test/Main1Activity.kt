package com.daeseong.lottielib_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Main1Activity : AppCompatActivity() {

    private val tag = Main1Activity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
    }
}