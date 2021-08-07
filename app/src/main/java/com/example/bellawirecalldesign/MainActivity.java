package com.example.bellawirecalldesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.BlurTransformation;

public class MainActivity extends AppCompatActivity {
    ImageView endcall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.ivBackground);
        Picasso.with(getApplicationContext())
                .load(R.drawable.image_back)
                .transform(new BlurTransformation(getApplicationContext(), 25, 1))
                .into(imageView);

        endcall = findViewById(R.id.endCallImg);
        endcall.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), ScreenActivity.class));
        });

    }
}