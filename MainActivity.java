package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleClass sampleClass = new SampleClass(2020);
        sampleClass.setMyCustomListener( new MyCustomListener() {
            @Override
            public void onSuccess(String message) {
                Log.d("onSuccess", message);
            }
            @Override
            public void onFailure(String error) {
                Log.d("onFailure", error);
            }
        });
        sampleClass.doSomething();



    }
}