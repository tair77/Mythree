package com.example.myapplication3;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    ImageView imImage;
    Button btn1, btn2, btn3;
    Button btnOne, btnTwo, btnThree;


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

    public void changeImage (View view){
        switch (view.getId()){
            case R.id.btn_1:
                imImage.setImageResource(R.drawable.oleni);
                break;
            case R.id.btn_2:
                imImage.setImageResource(R.drawable.belka);
                break;
            case R.id.btn_3:
                imImage.setImageResource(R.drawable.dog);
                break;
        }
    }

    private void listeners() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_LONG).show();


            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_LONG).show();
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view
            ) {
                Toast.makeText(GameActivity.this, "Правильно", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void changImage(View view) {
    }
}