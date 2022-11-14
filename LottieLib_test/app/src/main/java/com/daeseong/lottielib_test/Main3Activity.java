package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public class Main3Activity extends AppCompatActivity {

    private static final String TAG = Main3Activity.class.getSimpleName();

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        clear();
    }

    private void init(){

        try {

            lottieAnimationView = (LottieAnimationView)findViewById(R.id.lav);
            lottieAnimationView.setVisibility(View.VISIBLE);
            lottieAnimationView.setRepeatCount(ValueAnimator.INFINITE);
            lottieAnimationView.setSpeed(1.0F);
            lottieAnimationView.playAnimation();

            lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {

                    finish();
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

    private void clear(){

        try {

            if (lottieAnimationView != null) {
                lottieAnimationView.cancelAnimation();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}