package com.snkcorp.jbfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onClick(View view){
        if (view.getId()== R.id.Inicio) {
            Intent elegirIntent = new Intent(Menu.this, MainActivity.class);
            startActivity(elegirIntent);
        } else if ((view.getId()==R.id.AQUI)) {
            Intent elegirIntent = new Intent(Menu.this, Select.class);
            startActivity(elegirIntent);
        }
    }
}