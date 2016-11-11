package com.example.hyein.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    TextView b3;
    CheckBox b4;
    RatingBar b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕하세요", Toast.LENGTH_SHORT).show();
            }
        });
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "다시 인사해요", Toast.LENGTH_SHORT).show();
            }
        });
        b3 = (TextView)findViewById(R.id.textView);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "새로운 세상이다", Toast.LENGTH_SHORT).show();
            }
        });
        b4 = (CheckBox)findViewById(R.id.checkBox);
        b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(),"체크하셨습니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b5 = (RatingBar)findViewById(R.id.ratingBar);
        b5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), "별점을 반영하겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
