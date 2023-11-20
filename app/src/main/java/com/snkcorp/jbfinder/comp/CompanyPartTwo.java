package com.snkcorp.jbfinder.comp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.snkcorp.jbfinder.MainActivity;
import com.snkcorp.jbfinder.Menu;
import com.snkcorp.jbfinder.R;

public class CompanyPartTwo extends AppCompatActivity {
    private Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_part_two);
        spin = findViewById(R.id.Sector);
        String [] options = {"Sector Dirigido","Informatica", "Educacion","Salud"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,options);
        spin.setAdapter(adapter);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.Crear) {
            Intent elegirIntent = new Intent(CompanyPartTwo.this, MainActivity.class);
            startActivity(elegirIntent);


        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(CompanyPartTwo.this, Menu.class);
            startActivity(elegirIntent);
        } else if (view.getId() == R.id.Back) {
            Intent elegirIntent = new Intent(CompanyPartTwo.this, Company.class);
            startActivity(elegirIntent);

        }
    }
}