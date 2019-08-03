package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddNewBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_book);
    }

    public void book(View view){
        Intent intent = new Intent(AddNewBook.this, Book.class);
        startActivity(intent);
    }
}
