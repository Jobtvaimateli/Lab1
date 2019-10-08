package com.example.lab1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView MainText;
    Button TextChangingButton, RedColorButton, GreenColorButton, BlueColorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainText=(TextView) findViewById(R.id.MainText);
        TextChangingButton=(Button) findViewById(R.id.TextChangingButton);
        RedColorButton =(Button) findViewById(R.id.RedColorButton);
        BlueColorButton =(Button) findViewById(R.id.BlueColorButton);
        GreenColorButton =(Button) findViewById(R.id.GreenColorButton);


        TextChangingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { MainText.setText("Noreciau suzinoti savo ivertima :)");
            }
        });
        RedColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainText.setTextColor(Color.RED);
            }
        });
        BlueColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainText.setTextColor(Color.BLUE);
            }
        });
        GreenColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainText.setTextColor(Color.GREEN);
            }
        });

    }
}
