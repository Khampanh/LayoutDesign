package com.example.homsombath.k.layoutdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

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


        TextView textViewUser = findViewById(R.id.txt_user);
        TextView textViewPass = findViewById(R.id.txt_pass);

        String sUser = getIntent().getStringExtra("user");
        String sPass = getIntent().getStringExtra("pass");

        textViewUser.setText(sUser);
        textViewPass.setText(sPass);

    }
}
