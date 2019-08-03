package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Money_planner1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_planner1);
    }

    public void startsecondActivity(View view) {
        Intent intent = new Intent (Money_planner1.this,Money_planner2.class);
        startActivity(intent);
    }

    public void myBooks(View view){
        Intent intent = new Intent(Money_planner1.this, BooksMain.class);
        startActivity(intent);
    }
}
