package com.example.send_email;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.send_email.sharedpreferences", Context.MODE_PRIVATE);
        if(sharedPreferences.getBoolean("login",false)){
            startActivity(new Intent(MainActivity.this, FeatureActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK));
        }
        setContentView(R.layout.activity_main);
        TextView btn= findViewById(R.id.welcomeNext);
        btn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LoginActivity.class)));
    }
}