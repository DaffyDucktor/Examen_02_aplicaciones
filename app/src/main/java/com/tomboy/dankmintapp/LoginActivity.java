package com.tomboy.dankmintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextView textRegister;
    MaterialButton loginButton, loginButtonGoogle;

    TextInputEditText inputEmail, inputPassword;
    TextInputLayout layoutInputEmail,layoutInputPassword;
    String textInputEmail, textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textRegister = findViewById(R.id.textRegister);
        loginButton = findViewById(R.id.loginButton);
        loginButtonGoogle = findViewById(R.id.loginGoogleButton);

        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        layoutInputEmail = findViewById(R.id.layoutInputEmail);
        layoutInputPassword = findViewById(R.id.layoutInputPassword);

        textRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }

        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textInputEmail = inputEmail.getText().toString();
                textInputPassword = inputPassword.getText().toString();

                if(TextUtils.isEmpty(textInputEmail) || TextUtils.isEmpty(textInputPassword)){

                    if(TextUtils.isEmpty(textInputEmail)){ layoutInputEmail.setError("This field is empty");}else{ layoutInputEmail.setError(null);}
                    if(TextUtils.isEmpty(textInputPassword)){ layoutInputPassword.setError("This field is empty");}else{ layoutInputPassword.setError(null);}

                }else {

                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        loginButtonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}