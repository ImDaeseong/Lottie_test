package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = Main2Activity.class.getSimpleName();

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        clear();
    }

    private void init(){

        try {

            lottieAnimationView = (LottieAnimationView) findViewById(R.id.lav);
            lottieAnimationView.setAnimation("2.json");
            lottieAnimationView.loop(false);
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