package com.example.haniyeaslani.uploadphoto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hanna","OnStart is called");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hanna","OnResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Hanna","OnPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Hanna","OnStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hanna","OnDestroy is called");
    }
}
