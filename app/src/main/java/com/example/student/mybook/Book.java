package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);
    }

    public void addNewBook(View view){
        Intent intent = new Intent(Book.this, BooksMain.class);
        startActivity(intent);
    }

    public void removeBook(View view){
        Intent intent = new Intent(Book.this, BooksMain.class);
        startActivity(intent);
    }

    public void updateBook(View view){
        Intent intent = new Intent(Book.this, UpdateBook.class);
        startActivity(intent);
    }

}
