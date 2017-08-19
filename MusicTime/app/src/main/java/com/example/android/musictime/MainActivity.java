package com.example.android.musictime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] imager = {0};
        TextView text1 = (TextView) findViewById(R.id.recent_activity);
        text1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, recent.class);
                startActivity(intent);
            }
        });
        TextView text2 = (TextView) findViewById(R.id.available_activity);
        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, available.class);
                startActivity(intent);
            }
        });
        TextView text3 = (TextView) findViewById(R.id.playlist_activity);
        text3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, playlist.class);
                startActivity(intent);
            }
        });
        ImageView image1 = (ImageView) findViewById(R.id.information_activity);
        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, information.class);
                startActivity(intent);
            }
        });
        ImageView image2 = (ImageView) findViewById(R.id.star_music);
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (imager[0] == 0) {

                    ImageView image = (ImageView) findViewById(R.id.star_music);
                    image.setImageResource(R.drawable.stara);
                    imager[0] = 1;
                } else {
                    ImageView image = (ImageView) findViewById(R.id.star_music);
                    image.setImageResource(R.drawable.staro);
                    imager[0] = 0;
                }
            }
        });
        ImageView image3 = (ImageView) findViewById(R.id.play_music);
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (imager[0] == 0) {
                    ImageView image = (ImageView) findViewById(R.id.play_music);
                    image.setImageResource(R.drawable.pause);
                    imager[0] = 1;
                } else {
                    ImageView image = (ImageView) findViewById(R.id.play_music);
                    image.setImageResource(R.drawable.play);
                    imager[0] = 0;
                }
            }
        });
        ImageView image4 = (ImageView) findViewById(R.id.love_music);
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (imager[0] == 0) {
                    ImageView image = (ImageView) findViewById(R.id.love_music);
                    image.setImageResource(R.drawable.love2);
                    imager[0] = 1;
                } else {
                    ImageView image = (ImageView) findViewById(R.id.love_music);
                    image.setImageResource(R.drawable.love);
                    imager[0] = 0;
                }
            }
        });
        ImageView image5 = (ImageView) findViewById(R.id.repeat_music);
        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (imager[0] == 0) {
                    ImageView image = (ImageView) findViewById(R.id.repeat_music);
                    image.setImageResource(R.drawable.shuffle);
                    imager[0] = 1;
                } else {
                    ImageView image = (ImageView) findViewById(R.id.repeat_music);
                    image.setImageResource(R.drawable.loop);
                    imager[0] = 0;
                }
            }
        });
    }
}
