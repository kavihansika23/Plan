package com.example.student.mybook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UpdateBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_book);
    }


    public void updateBook(View view){
        Intent intent = new Intent(UpdateBook.this, BooksMain.class);
        startActivity(intent);
    }
}
