package com.example.netcamp_app_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CreateAccount extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;
    FirebaseAuth f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        e1 = findViewById(R.id.editText8);
        e2 = findViewById(R.id.editText9);
        b1 = findViewById(R.id.button11);
        b2 = findViewById(R.id.button12);
        f1 = FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString(), s2 = e2.getText().toString();
                if(s1.isEmpty()){
                    e1.setError("enter email");
                }
                else if(s2.isEmpty()){
                    e2.setError("enter password");
                }
                else{
                    f1.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Intent i = new Intent(CreateAccount.this, MainActivity.class);
                                startActivity(i);
                                finish();
                            }
                            else {
                                Toast.makeText(CreateAccount.this, "Login failed!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateAccount.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}