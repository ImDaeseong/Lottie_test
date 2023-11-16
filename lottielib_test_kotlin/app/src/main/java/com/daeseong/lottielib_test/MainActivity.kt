package com.daeseong.lottielib_test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val tag = MainActivity::class.java.simpleName

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button1.setOnClickListener(this)

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener(this)

        button3 = findViewById(R.id.button3)
        button3.setOnClickListener(this)

        button4 = findViewById(R.id.button4)
        button4.setOnClickListener(this)

        button5 = findViewById(R.id.button5)
        button5.setOnClickListener(this)

        button6 = findViewById(R.id.button6)
        button6.setOnClickListener(this)

        button7 = findViewById(R.id.button7)
        button7.setOnClickListener(this)

        button8 = findViewById(R.id.button8)
        button8.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> startActivityIntent(Main1Activity::class.java)
            R.id.button2 -> startActivityIntent(Main2Activity::class.java)
            R.id.button3 -> startActivityIntent(Main3Activity::class.java)
            R.id.button4 -> startActivityIntent(Main4Activity::class.java)
            R.id.button5 -> startActivityIntent(Main5Activity::class.java)
            R.id.button6 -> startActivityIntent(Main6Activity::class.java)
            R.id.button7 -> startActivityIntent(Main7Activity::class.java)
            R.id.button8 -> startActivityIntent(Main8Activity::class.java)
        }
    }

    private fun startActivityIntent(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
