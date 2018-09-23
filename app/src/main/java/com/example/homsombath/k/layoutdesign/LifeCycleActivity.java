package com.example.homsombath.k.layoutdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Log.e("ActivityLifeCycle","OnCreate");

    }

    protected void onStart(){
        Log.e("ActivityLifeCycle","OnStart");
        super.onStart();

    }

    protected void onRestart(){
        Log.e("ActivityLifeCycle","OnRestart");
        super.onRestart();
    }


}
