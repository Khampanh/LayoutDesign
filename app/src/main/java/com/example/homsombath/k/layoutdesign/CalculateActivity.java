package com.example.homsombath.k.layoutdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    EditText editTextValue1, editTextValue2;
    RadioButton radioButtonBuak,radioButtonLop,radioButtonKhoun,
                radioButtonHarn;
    Button buttonCal;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        editTextValue1 = findViewById(R.id.edtValue1);
        editTextValue2 = findViewById(R.id.edtValue2);
        radioButtonBuak = findViewById(R.id.rdbuak);
        radioButtonLop = findViewById(R.id.rdlop);
        radioButtonKhoun = findViewById(R.id.rdkhoun);
        radioButtonHarn = findViewById(R.id.rdHarn);

        textViewResult = findViewById(R.id.txt_Result);



       radioButtonBuak.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                float value1 = Float.parseFloat(editTextValue1.getText().toString());
                float value2 = Float.parseFloat(editTextValue2.getText().toString());
               textViewResult.setText(value1+value2+"");
           }
       });

       radioButtonLop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               float value1 = Float.parseFloat(editTextValue1.getText().toString());
               float value2 = Float.parseFloat(editTextValue2.getText().toString());
               textViewResult.setText(value1-value2+"");
           }
       });

        radioButtonKhoun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value1 = Float.parseFloat(editTextValue1.getText().toString());
                float value2 = Float.parseFloat(editTextValue2.getText().toString());
                textViewResult.setText(value1*value2+"");
            }
        });

        radioButtonHarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value1 = Float.parseFloat(editTextValue1.getText().toString());
                float value2 = Float.parseFloat(editTextValue2.getText().toString());
                textViewResult.setText(value1/value2+"");
            }
        });



    }
}
