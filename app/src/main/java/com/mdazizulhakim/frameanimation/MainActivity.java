package com.mdazizulhakim.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView player;
    AnimationDrawable frameAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = (ImageView) findViewById(R.id.imageView);
        player.setImageResource(R.drawable.frameanimation);
        frameAnimation = (AnimationDrawable) player.getDrawable();
        frameAnimation.start();
    }
}
