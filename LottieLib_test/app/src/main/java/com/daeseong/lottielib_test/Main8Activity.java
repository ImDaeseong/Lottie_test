package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main8Activity extends AppCompatActivity {

    private static final String TAG = Main8Activity.class.getSimpleName();

    private WebView wbv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        wbv = (WebView)findViewById(R.id.wbv);
        wbv.getSettings().setJavaScriptEnabled(true);
        wbv.setWebViewClient(new WebViewClient());
        wbv.loadUrl("file:///android_asset/test.html");
    }
}