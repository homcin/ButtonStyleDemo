package com.grace.buttonstyledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnToGradientActivity;
    private Button btnToBaiCiZhanActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        btnToGradientActivity = (Button) findViewById(R.id.btnToGradientActivity);
        btnToBaiCiZhanActivity = (Button) findViewById(R.id.btnToBaiCiZhanActivity);

        btnToGradientActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GradientBtnActivity.class);
                startActivity(intent);
            }
        });

        btnToBaiCiZhanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaiCiZhanActivity.class);
                startActivity(intent);
            }
        });
    }
}
