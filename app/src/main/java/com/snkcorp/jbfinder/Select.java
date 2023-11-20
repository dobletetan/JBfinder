package com.snkcorp.jbfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.snkcorp.jbfinder.comp.Company;
import com.snkcorp.jbfinder.per.persona;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.empresa_button) {
            Intent elegirIntent = new Intent(Select.this, Company.class);
            startActivity(elegirIntent);



        } else if (view.getId() == R.id.Persona_button) {
            Intent elegirIntent = new Intent(Select.this, persona.class);
            startActivity(elegirIntent);

        } else if (view.getId() == R.id.Back) {
            Intent elegirIntent = new Intent(Select.this,Menu.class);
            startActivity(elegirIntent);

        }
    }
}
