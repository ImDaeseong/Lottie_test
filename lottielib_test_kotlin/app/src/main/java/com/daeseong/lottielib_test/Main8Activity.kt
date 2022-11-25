package com.daeseong.lottielib_test

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class Main8Activity : AppCompatActivity() {

    private val tag = Main8Activity::class.java.simpleName

    private var wbv: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        wbv = findViewById<WebView>(R.id.wbv)
        wbv!!.settings.javaScriptEnabled = true
        wbv!!.webViewClient = WebViewClient()
        wbv!!.loadUrl("file:///android_asset/test.html")
    }
}