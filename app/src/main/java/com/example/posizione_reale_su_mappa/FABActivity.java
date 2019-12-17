package com.example.posizione_reale_su_mappa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;


public class FABActivity extends AppCompatActivity implements Example.BottomSheetListener {
    private TextView mTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextview = findViewById(R.id.textviewbuttonclicked);



        //il fab apre la bottomsheet
        FloatingActionButton fab = findViewById(R.id.grav);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FABActivity.this, "ciao", Toast.LENGTH_SHORT).show();
                Example button = new Example();
                button.show(getSupportFragmentManager(), "exampleBottomSheet");

            }
        });

    }


    @Override
    public void onButtonClicked(String text) {
        mTextview.setText(text);

    }
}
