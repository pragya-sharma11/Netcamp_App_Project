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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddUserDetails extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b;
    FirebaseDatabase fd;
    DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_details);
        e1 = findViewById(R.id.editText5);
        e2 = findViewById(R.id.editText6);
        e3 = findViewById(R.id.editText7);
        b = findViewById(R.id.button10);
        fd = FirebaseDatabase.getInstance();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbref = fd.getReference("users");
                String s1 = e1.getText().toString(), s2 = e2.getText().toString(), s3 = e3.getText().toString();
                if(s1.isEmpty()){
                    e1.setError("Enter name");
                }
                else if(s2.isEmpty()){
                    e2.setError("Enter email");
                }
                else if(s3.isEmpty()){
                    e3.setError("Enter phone number");
                }
                else{
                    Users users = new Users(s1, s2, s3);
                    dbref.child(s3).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Intent i = new Intent(AddUserDetails.this, MainActivity.class);
                                startActivity(i);
                                finish();
                            }
                            else{
                                Toast.makeText(AddUserDetails.this, "Database not updated", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}