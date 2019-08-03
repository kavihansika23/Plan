package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BooksMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_main);
    }

    public void addNewBook(View view){
        Intent intent = new Intent(BooksMain.this, AddNewBook.class);
        startActivity(intent);
    }

    public void viewBook(View view){
        Intent intent = new Intent(BooksMain.this, Book.class);
        startActivity(intent);
    }
}
