package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.os.Bundle;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;

public class Main5Activity extends AppCompatActivity {

    //애프터이펙트

    private static final String TAG = Main5Activity.class.getSimpleName();

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        init();

        start();
    }

    @Override
    protected void onStop() {
        super.onStop();

        stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        clear();
    }

    private void init(){

        try {

            lottieAnimationView = (LottieAnimationView) findViewById(R.id.lav);
            lottieAnimationView.setAnimation("3.json");
            lottieAnimationView.loop(false);

            Log.e(TAG, "init:" + String.valueOf(lottieAnimationView.getDuration()));

            lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {

                    Log.e(TAG, "onAnimationEnd:" + String.valueOf(lottieAnimationView.getDuration()));
                }

                @Override
                public void onAnimationCancel(Animator animator) {

                }

                @Override
                public void onAnimationRepeat(Animator animator) {

                }
            });

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void start(){

        try {

            boolean isPlay = lottieAnimationView.isAnimating();
            if (!isPlay) {
                lottieAnimationView.playAnimation();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void stop(){

        try {

            boolean isPlay = lottieAnimationView.isAnimating();
            if (isPlay) {
                lottieAnimationView.cancelAnimation();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void clear(){

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView.removeAllLottieOnCompositionLoadedListener();
                lottieAnimationView.removeAllAnimatorListeners();
                lottieAnimationView.removeAllLottieOnCompositionLoadedListener();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}