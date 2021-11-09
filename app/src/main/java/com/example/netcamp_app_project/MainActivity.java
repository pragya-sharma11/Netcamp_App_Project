package com.example.netcamp_app_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GoogleAuthProvider;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1,b2, b3, b4;
    FirebaseAuth f1;
    GoogleSignInClient googleSignInClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        f1 = FirebaseAuth.getInstance();
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("955033657512-ftfsit36kol7g5okoqhe543q50ud0egi.apps.googleusercontent.com").requestEmail().build();
        googleSignInClient = GoogleSignIn.getClient(MainActivity.this, googleSignInOptions);




        if(f1.getCurrentUser()!=null){
            Intent next= new Intent(MainActivity.this, PhoneScreen.class);
            startActivity(next);
            finish();
        }
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
                    f1.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Intent i = new Intent(MainActivity.this, AddUserDetails.class);
                                startActivity(i);
                                finish();
                            }
                            else {
                                Toast.makeText(MainActivity.this, "Login failed!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = googleSignInClient.getSignInIntent();
                startActivityForResult(intent,100);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PhoneSignIn.class);
                startActivity(i);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateAccount.class);
                startActivity(i);
                finish();
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        GoogleSignInAccount googleSignInAccount = task.getResult();
        AuthCredential authCredential = GoogleAuthProvider.getCredential(googleSignInAccount.getIdToken(),null);
        f1.signInWithCredential(authCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent i = new Intent(MainActivity.this, PhoneScreen.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}