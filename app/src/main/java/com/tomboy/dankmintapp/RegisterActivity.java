package com.tomboy.dankmintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    TextView textLogin;
    MaterialButton registerButton;
    TextInputEditText inputEmail, inputFullname, inputMobile;
    TextInputLayout layoutInputEmail,layoutInputFullname,layoutInputMobile;
    String textInputEmail, textInputFullname, textInputMobile;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textLogin = findViewById(R.id.textLogin);
        registerButton = findViewById(R.id.registerButton);
        inputEmail = findViewById(R.id.inputEmail);
        inputFullname = findViewById(R.id.inputFullname);
        inputMobile = findViewById(R.id.inputMobile);
        layoutInputEmail = findViewById(R.id.layoutInputEmail);
        layoutInputFullname = findViewById(R.id.layoutInputFullname);
        layoutInputMobile = findViewById(R.id.layoutInputMobile);

        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textInputEmail = inputEmail.getText().toString();
                textInputFullname = inputFullname.getText().toString();
                textInputMobile = inputMobile.getText().toString();

                if(TextUtils.isEmpty(textInputEmail) || TextUtils.isEmpty(textInputFullname) || TextUtils.isEmpty(textInputMobile)){

                    if(TextUtils.isEmpty(textInputEmail)){ layoutInputEmail.setError("This field is empty");}else{ layoutInputEmail.setError(null);}
                    if(TextUtils.isEmpty(textInputFullname)){ layoutInputFullname.setError("This field is empty");}else{ layoutInputFullname.setError(null);}
                    if(TextUtils.isEmpty(textInputMobile)){ layoutInputMobile.setError("This field is empty");}else{ layoutInputMobile.setError(null);}

                }else{
                    Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}