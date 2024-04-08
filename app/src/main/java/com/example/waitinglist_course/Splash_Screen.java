package com.example.waitinglist_course;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class Splash_Screen extends AppCompatActivity {
    ImageView splash_image;
    Animation topAnimation, downAnimation;
    Handler handler;
    TextView tvWelcome;
    final int TIME_LIMIT = 8000;     // The time delay after splash screen in milliseconds.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        getSupportActionBar().hide();

        // postDelayed(Runnable, time) method is used to start the second activity with a delay
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_LIMIT);
    }
}
