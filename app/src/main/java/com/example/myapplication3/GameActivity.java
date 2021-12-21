package com.example.myapplication3;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btn1, btn2, btn3;
    Button btnOne, btnTwo, btnThree;
    boolean isOleni, isBelka, isDog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initialization();
        listeners();

    }

    private void initialization() {
        imImage = findViewById(R.id.in_image);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_tree);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                imImage.setImageResource(R.drawable.oleni);
                isOleni = true;
                isBelka = false;
                isDog = false;
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.belka);
                isBelka = true;
                isOleni = false;
                isDog = false;
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.dog);
                isDog = true;
                isBelka = false;
                isOleni = false;
                break;
        }

    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v
            ) {
                if (isOleni) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBelka) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_LONG).show();

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDog) {
                    Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(GameActivity.this, "НЕ правильно", Toast.LENGTH_LONG).show();

            }
        });

    }


}