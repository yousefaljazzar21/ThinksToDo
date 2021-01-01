package com.example.thinkstodo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
public class LoginActivity extends AppCompatActivity {
    TextView create;
    EditText email , password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.emailText);
        password=findViewById(R.id.passwordText);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginActivity.this.doSignIn(email.getText().toString(),password.getText().toString());

                Intent i=new Intent(LoginActivity.this,ListActivity.class);
                startActivity(i);
            }
        });



        create=findViewById(R.id.createText);
        create.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Intent i2=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i2);
            }
        });
    }
    private void doSignIn (String email, String password) {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull final Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(LoginActivity.this, "LogIn Successfully", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(LoginActivity.this, ListActivity.class);
                            startActivity(i);
                        }

                    }
                });
    }
}