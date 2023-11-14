package com.example.myapplication;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadioGroupObj;

    static final  String userMarks="question 1 marks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myRadioGroupObj = findViewById(R.id.radioGroupID);
    }

    public void submitFunction(View view) {
        Intent myGetIntent = getIntent();
        int mark = myGetIntent.getIntExtra(MainActivity.userMarks, 0);

        if (myRadioGroupObj.getCheckedRadioButtonId() == R.id.radioBtn3Id) {
            mark += 5;
        }

        Intent myIntent = new Intent(this, MainActivity3.class);
        myIntent.putExtra(userMarks, mark);
        startActivity(myIntent);
    }
}