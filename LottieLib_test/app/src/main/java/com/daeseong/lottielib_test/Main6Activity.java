package com.daeseong.lottielib_test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public class Main6Activity extends AppCompatActivity {

    private static final String TAG = Main6Activity.class.getSimpleName();

    private View view1, view2, view3, view4, view5;

    private LottieAnimationView lottieAnimationView1, lottieAnimationView2, lottieAnimationView3, lottieAnimationView4, lottieAnimationView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        view1 = (View)findViewById(R.id.lottie_view1);
        view2 = (View)findViewById(R.id.lottie_view2);
        view3 = (View)findViewById(R.id.lottie_view3);
        view4 = (View)findViewById(R.id.lottie_view4);
        view5 = (View)findViewById(R.id.lottie_view5);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "lottieAnimationView1");
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "lottieAnimationView2");
            }
        });

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "lottieAnimationView3");
            }
        });

        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "lottieAnimationView4");
            }
        });

        view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "lottieAnimationView5");
            }
        });

        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        clear();
    }

    private void init(){

        try {

            lottieAnimationView1 = (LottieAnimationView)view1.findViewById(R.id.lav);
            lottieAnimationView2 = (LottieAnimationView)view2.findViewById(R.id.lav);
            lottieAnimationView3 = (LottieAnimationView)view3.findViewById(R.id.lav);
            lottieAnimationView4 = (LottieAnimationView)view4.findViewById(R.id.lav);
            lottieAnimationView5 = (LottieAnimationView)view5.findViewById(R.id.lav);

            lottieAnimationView1.setAnimation("1.json");
            lottieAnimationView2.setAnimation("2.json");
            lottieAnimationView3.setAnimation("3.json");
            lottieAnimationView4.setAnimation("1.json");
            lottieAnimationView5.setAnimation("2.json");

            lottieAnimationView1.setRepeatCount(10);
            lottieAnimationView2.setRepeatCount(10);
            lottieAnimationView3.setRepeatCount(10);
            lottieAnimationView4.setRepeatCount(10);
            lottieAnimationView5.setRepeatCount(10);

            lottieAnimationView1.playAnimation();
            lottieAnimationView2.playAnimation();
            lottieAnimationView3.playAnimation();
            lottieAnimationView4.playAnimation();
            lottieAnimationView5.playAnimation();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void clear(){

        try {

            if (lottieAnimationView1 != null) {
                lottieAnimationView1.cancelAnimation();
            }

            if (lottieAnimationView2 != null) {
                lottieAnimationView2.cancelAnimation();
            }

            if (lottieAnimationView3 != null) {
                lottieAnimationView3.cancelAnimation();
            }

            if (lottieAnimationView4 != null) {
                lottieAnimationView4.cancelAnimation();
            }

            if (lottieAnimationView5 != null) {
                lottieAnimationView5.cancelAnimation();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}