package com.example.aradg.cyber2021ex02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int i;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;
        btn=(Button)findViewById(R.id.btn2);



    }

    public void onClick(View view) {
        i++;
        btn.setText("Number of clicks:"+i);
    }
}
