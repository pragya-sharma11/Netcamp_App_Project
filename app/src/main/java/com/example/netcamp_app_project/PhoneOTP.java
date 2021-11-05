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
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class PhoneOTP extends AppCompatActivity {
    Button b1, b2, b3;
    EditText e;
    FirebaseAuth f1;
    String mobile, otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_o_t_p);
        mobile = getIntent().getStringExtra("phone").toString();
        e = findViewById(R.id.editText4);
        b1 = findViewById(R.id.button7);
        b2 = findViewById(R.id.button8);
        b3 = findViewById(R.id.button9);
        f1 = FirebaseAuth.getInstance();
        genOTP();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.getText().toString().isEmpty()){
                    e.setError("Please fill phone number");
                }
                else if(e.getText().toString().length()!=6){
                    e.setError("OTP not valid");
                }
                else{
                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(otp, e.getText().toString());
                    signinWithPhoneAuthCredential(credential);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneOTP.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void genOTP(){
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                mobile,
                60,
                TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(s, forceResendingToken);
                        otp = s;
                    }

                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                        signinWithPhoneAuthCredential(phoneAuthCredential);
                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        Toast.makeText(PhoneOTP.this, "Verification failed", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    private void signinWithPhoneAuthCredential(PhoneAuthCredential credential){
        f1.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent i = new Intent(PhoneOTP.this, AddUserDetails.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(PhoneOTP.this, "Signin failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}