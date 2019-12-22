package com.example.tubes_kel_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private TextView textView;
    EditText textViewUser;
    EditText textViewPassword;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = findViewById(R.id.signUp_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
                finish();

            }
        });
         textViewUser = (EditText) findViewById(R.id.txt_username);
         textViewPassword = (EditText) findViewById(R.id.txt_password);
            button = findViewById(R.id.btn_login);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String user = textViewUser.getText().toString();
                    String pass = textViewPassword.getText().toString();
                    if(user.equals("admin")&&pass.equals("admin")) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });

    }
}
