package com.example.damsem09_ciclodevidadelosfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CICLOVIDA","Activity está onCreate");
        //Toast.makeText(this,"Mensaje desde el Activity",Toast.LENGTH_SHORT).show();
    }
}