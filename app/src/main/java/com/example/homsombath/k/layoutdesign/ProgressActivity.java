package com.example.homsombath.k.layoutdesign;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Button buttonShow = findViewById(R.id.btn_progressShow);
        Button buttonHide = findViewById(R.id.btn_progressHide);
        final ProgressBar progressBar = findViewById(R.id.progressbar);

        progressBar.setVisibility(View.GONE);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });

//Set Text to Show
        TextView textViewUser = findViewById(R.id.txt_user);
        TextView textViewPass = findViewById(R.id.txt_pass);

        String sUser = getIntent().getStringExtra("user");
        String sPass = getIntent().getStringExtra("pass");

        textViewUser.setText(sUser);
        textViewPass.setText(sPass);

//        Button Logout

        Button buttonLogout = findViewById(R.id.btn_logout);

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(ProgressActivity.this);
                builder.setCancelable(false);
                builder.setTitle("Alert Example");
                builder.setMessage("Do you want to logout??");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent = new Intent(ProgressActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProgressActivity.this, "OK", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create().show();


            }
        });


    }
}
