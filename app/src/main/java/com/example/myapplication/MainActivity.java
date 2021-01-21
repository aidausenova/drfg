package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2, edt3;
    private String edtT1, edtT2, edtT3;
    private double int1, int2, int3;
    private TextView textView;
    private String k;
    private String d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        textView = findViewById(R.id.textView);
    }

    public void clickSet(View view) {
        edtT1 = edt1.getText().toString();
        edtT2 = edt2.getText().toString();
        edtT3 = edt3.getText().toString();
        if (edtT1.equals("") || edtT2.equals("") || edtT3.equals("")) {
            Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG).show();
        } else {
            int1 = Double.parseDouble(edtT1);
            int2 = Double.parseDouble(edtT2);
            int3 = Double.parseDouble(edtT3);
            double sum = int1 + int2 + int3;
            d = Double.valueOf(sum).toString();
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(k, d);
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText((String) savedInstanceState.get(k));
    }
}