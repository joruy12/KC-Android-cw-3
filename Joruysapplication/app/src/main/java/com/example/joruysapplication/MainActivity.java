package com.example.joruysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        Button calculateButton = findViewById(R.id.button);
        EditText firstNumber = findViewById(R.id.editText);
        EditText secondNumber = findViewById(R.id.editText2);
    }
}