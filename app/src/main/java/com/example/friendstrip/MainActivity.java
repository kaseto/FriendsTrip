package com.example.friendstrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void registro(View view){
        Intent i=new Intent(this,ActivityRegister.class);
        startActivity(i);
    }

    public void inicio(View view){

        Intent i=new Intent (this,ActivityLogin.class);
        startActivity(i);
    }
}