package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] contactList = {"Akash", "David", "William", "Amit", "Louis", "Eddie", "Ed", "Kunal","Ana", "John", "Jason"};

        RecyclerView contactView = findViewById(R.id.contactView);

        contactView.setLayoutManager(new LinearLayoutManager(this));
        contactView.setAdapter(new ContactAdapter(contactList));
    }
}