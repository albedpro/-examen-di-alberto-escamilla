package com.example.albertoescamilla;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
    public void backLogin(View view) {
        Intent intent = new Intent(Register.this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void signUpNewUser(View v) {
        TextView nameTextView = findViewById(R.id.usuarioreg);
        TextView emailTextView = findViewById(R.id.mailreg);
        TextView passTextView = findViewById(R.id.passreg);

        String nameString = nameTextView.getText().toString();
        String emailString = emailTextView.getText().toString();
        String passString = passTextView.getText().toString();

    }
}