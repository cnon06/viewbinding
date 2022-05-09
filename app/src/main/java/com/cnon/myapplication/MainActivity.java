package com.cnon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cnon.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       // with using viewbinding

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
      binding.textview1.setText("Hi world");

/*
    setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview1);
        textView.setText("Hi world");
 */







    }
}