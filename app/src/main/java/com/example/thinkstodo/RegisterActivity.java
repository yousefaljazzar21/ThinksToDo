package com.example.thinkstodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editText1 = findViewById(R.id.nameText);
        editText2 = findViewById(R.id.passwordText);
        editText3 = findViewById(R.id.emailText);
    }

    public void loginText(View view) {


        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void bttn_create(View view) {
        String name = editText1.getText().toString();
        String password = editText2.getText().toString();
        String email = editText3.getText().toString();
        if (name.isEmpty()) {
            editText1.setError("Please fill this filed.");
            editText1.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            editText1.setError("Please fill this filed.");
            editText1.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            editText1.setError("Please fill this filed.");
            editText1.requestFocus();
            return;
        }
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

}