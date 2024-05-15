package com.example.sprpodsumujacy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private final int[] photo = {R.drawable.cos1, R.drawable.cos2, R.drawable.cos3, R.drawable.cos4, R.drawable.cos5, R.drawable.cos6, R.drawable.cos7};
    private static final double number =  Math.random() * 7;
    private final int number1 = (int) number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        ImageView imageView = findViewById(R.id.imageView);
        for(int i = 0; i < 7; i++) {
            if (number1 == i) {
                imageView.setImageResource(photo[i]);
            }
        }
        TextView result = findViewById(R.id.describe);
        result.setText((CharSequence) intent.getStringArrayListExtra("dane"));
    }
}