package com.example.deyuxie.myapplicationharvarddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView helloText;
    EditText nameText;
    Button okButton;
    Button activateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过id与ui里的component 链接了
        //id 命名 都是类型放前面，后面放名字
        helloText = (TextView) findViewById(R.id.text_hello);
        nameText = (EditText) findViewById(R.id.text_name);
        okButton = (Button) findViewById(R.id.button_ok);

        activateButton = (Button) findViewById(R.id.button_activate);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                String hello = "Hi " + name + " ,welcome!";
                helloText.setText(hello);


            }
        });


        activateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();

                Intent intent = new Intent(MainActivity.this, catActivity.class);
                intent.putExtra(catActivity.EXTRA_NAME, name);
                startActivity(intent);
            }
        });
    }
}



