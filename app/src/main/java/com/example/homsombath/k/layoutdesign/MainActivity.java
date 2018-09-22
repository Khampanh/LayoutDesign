package com.example.homsombath.k.layoutdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String sUser, sPass;
    EditText editTextUser,editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_login);

        editTextUser = findViewById(R.id.edt_user);
        editTextPass = findViewById(R.id.edt_password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sUser = editTextUser.getText().toString();
                sPass = editTextPass.getText().toString();

                if(sUser.equals("Kham") && sPass.equals("123")){
                    Intent intent = new Intent(MainActivity.this,ProgressActivity.class);
                    intent.putExtra("user",sUser);
                    intent.putExtra("pass",sPass);
                    startActivity(intent);

                } else{

                    Toast.makeText(MainActivity.this,"Please Insert Username And Password Again",
                            Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}
