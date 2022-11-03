package com.example.czaszycia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    TextView licznikTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("CzasŻycia","wywołana metoda onCreate");
        setContentView(R.layout.activity_main);
        licznikTextView = findViewById(R.id.licznikTextV);
        if(savedInstanceState != null){
            licznik = savedInstanceState.getInt("Licznik",0);
            licznikTextView.setText(String.valueOf(licznik));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CzasŻycia","wywołana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CzasŻycia","wywołana metoda onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CzasŻycia","wywołana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CzasŻycia","wywołana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CzasŻycia","wywołana metoda onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CzasŻycia","wywołana metoda onRestart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CzasŻycia","wywołana metoda onSaveInstanceState");
        outState.putInt("Licznik",licznik);
    }

    public void zwieksz(View view) {
        licznik++;
        licznikTextView.setText(String.valueOf(licznik));
    }

    public void zmniejsz(View view) {
        licznik--;
        licznikTextView.setText(String.valueOf(licznik));
    }
}