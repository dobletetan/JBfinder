package com.snkcorp.jbfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.Siguiente) {
            Intent elegirIntent = new Intent(Company.this, CompanyPartTwo.class);
            startActivity(elegirIntent);


        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(Company.this, Menu.class);
            startActivity(elegirIntent);
        } else if (view.getId()  == R.id.Back) {
            Intent elegirIntent = new Intent(Company.this, Select.class);
            startActivity(elegirIntent);

        }
    }
}