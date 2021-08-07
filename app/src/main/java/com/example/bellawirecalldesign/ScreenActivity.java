package com.example.bellawirecalldesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.bellawirecalldesign.utils.IncomingcallActivity;

public class ScreenActivity extends AppCompatActivity {

ImageView call;
ImageView skyVideocall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

         call= findViewById(R.id.callAns);
         call.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), ChatActivity.class));
        });

        skyVideocall= findViewById(R.id.skyVideo);
        skyVideocall.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), IncomingcallActivity.class));
        });
    }
}