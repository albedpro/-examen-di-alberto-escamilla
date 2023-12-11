package com.example.albertoescamilla;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Arranque extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);
        openLogin();

        ImageView logoSplash = findViewById(R.id.logoSplash);

        Animation shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);
        logoSplash.startAnimation(shakeAnimation);

        ImageView background = findViewById(R.id.backgroundSplash);
        Glide.with(this)
                .load("https://www.zarla.com/images/zarla-rajma-rajma-1x1-2400x2400-20210625-jxjc88j7wfqppqr6kgqj.png?crop=1:1,smart&width=250&dpr=2")
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .into(background);
    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
}