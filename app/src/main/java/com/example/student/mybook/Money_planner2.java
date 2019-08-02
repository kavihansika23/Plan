package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Money_planner2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_planner2);
    }

    public void startsecondActivity(View view) {
        Intent intent = new Intent (Money_planner2.this,plans.class);
        startActivity(intent);
    }
}
