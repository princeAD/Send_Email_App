package com.example.send_email;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.send_email.sharedpreferences", Context.MODE_PRIVATE);
        TextView uname = (TextView) findViewById(R.id.profileUsername);
        uname.setText(sharedPreferences.getString("username","USERNAME"));
        uname = (TextView)findViewById(R.id.profileEmail);
        uname.setText(sharedPreferences.getString("email","EMAIL"));
    }
}