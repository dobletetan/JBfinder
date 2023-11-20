package com.snkcorp.jbfinder.comp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.snkcorp.jbfinder.MainActivity;
import com.snkcorp.jbfinder.Menu;
import com.snkcorp.jbfinder.R;
import com.snkcorp.jbfinder.Select;

public class Company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
    }
    public void onClick(View view) {
        EditText emailEditText = findViewById(R.id.emailtext);
        EditText conUnoEditText = findViewById(R.id.passtext);
        EditText conDosEditText = findViewById(R.id.adresstext);

        String email = emailEditText.getText().toString();
        String conUno = conUnoEditText.getText().toString();
        String conDos = conDosEditText.getText().toString();
        if (view.getId() == R.id.Siguiente) {
            if (email.equals("") || conUno.equals("") || conDos.equals("")) {
            Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
        } else if (!conUno.equals(conDos)) {
            Toast.makeText(getApplicationContext(), "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        } else {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, conUno)
                        .addOnCompleteListener(Company.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Registro exitoso
                                    Toast.makeText(getApplicationContext(), "Registro exitoso", Toast.LENGTH_SHORT).show();

                                    // Puedes redirigir a otra actividad aquí
                                    Intent intent = new Intent(Company.this, Menu.class);
                                    startActivity(intent);
                                    finish(); // Cierra la actividad actual para evitar que el usuario vuelva atrás
                                } else {
                                    // Si el registro falla, muestra un mensaje al usuario
                                    Toast.makeText(getApplicationContext(), "Error en el registro: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

        }
        } else if (view.getId() == R.id.inicio) {
            Intent elegirIntent = new Intent(Company.this, Menu.class);
            startActivity(elegirIntent);
        } else if (view.getId()  == R.id.Back) {
            Intent elegirIntent = new Intent(Company.this, Select.class);
            startActivity(elegirIntent);

        }
    }

}