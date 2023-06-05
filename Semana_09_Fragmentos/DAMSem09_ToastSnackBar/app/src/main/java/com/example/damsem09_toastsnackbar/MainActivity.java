package com.example.damsem09_toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Viculamos:
        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        //evento click:
        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonToast) {
            Toast.makeText(this, "Mostrando Toast", Toast.LENGTH_SHORT).show();
        } else {
            Snackbar.make(v,"Mensaje de tipo SnackBar",Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}