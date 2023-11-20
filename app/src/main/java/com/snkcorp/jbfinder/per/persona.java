package com.snkcorp.jbfinder.per;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.snkcorp.jbfinder.R;

public class persona extends AppCompatActivity {
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
        spin = findViewById(R.id.profesion);
        String [] options = {"Profesion","Informatica", "Educacion","Salud"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,options);
        spin.setAdapter(adapter);
    }
}