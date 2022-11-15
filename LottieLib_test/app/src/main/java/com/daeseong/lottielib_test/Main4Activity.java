package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;

public class Main4Activity extends AppCompatActivity {

    private static final String TAG = Main4Activity.class.getSimpleName();

    private LottieAnimationView lottieAnimationView;

    private Handler handler;
    private long lDelay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        clear();
    }

    private void init(){

        lottieAnimationView = (LottieAnimationView)findViewById(R.id.lav);
        lDelay = lottieAnimationView.getDuration() + 2000;

        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Main4Activity.this, MainActivity.class));
                finish();
            }
        }, lDelay);
    }

    private void clear(){

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView.cancelAnimation();
            }

            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                handler = null;
            }

        }catch (Exception ex){
            Log.e(TAG, ex.getMessage());
        }
    }
}