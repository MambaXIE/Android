package com.example.deyuxie.myapplicationharvarddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class catActivity extends AppCompatActivity {
    //static不用实例化也是在另外一个类中调用
    //public static String EXTRA_NAME = "name";
    public static String EXTRA_NAME ;

    TextView catText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        catText = (TextView) findViewById(R.id.text_cat);

        Intent intent = getIntent();
        String name = intent.getStringExtra(EXTRA_NAME);
        catText.setText(name);
    }
}
