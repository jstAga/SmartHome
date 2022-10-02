package com.geektech.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 21){
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));
        }
    }

    public void login(View view) {
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        if (email.getText().toString().equals("admin") &&
            password.getText().toString().equals("admin")){
            Intent menu = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(menu);
        }
    }
}