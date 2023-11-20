package com.snkcorp.jbfinder;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.window.SplashScreen;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.snkcorp.jbfinder.comp.Company;

public class Menu extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSplashScreen();
        setContentView(R.layout.activity_menu);

    }
    public void onClck(View view){
        EditText emailEditText = findViewById(R.id.emailLog);
        EditText conUnoEditText = findViewById(R.id.passLog);

        String email = emailEditText.getText().toString();
        String conUno = conUnoEditText.getText().toString();
        if (view.getId()== R.id.Inicio) {
            if(email.equals("") || conUno.equals("") ){
                Toast.makeText(getApplicationContext(), "ingrese algun dato", Toast.LENGTH_SHORT).show();
            }
            else {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, conUno)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Inicio de sesión exitoso
                                    Toast.makeText(getApplicationContext(), "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                                    // Llamada al método showhome después del inicio de sesión exitoso
                                    showhome(email);
                                } else {
                                    // Si el inicio de sesión falla, muestra un mensaje al usuario
                                    Toast.makeText(getApplicationContext(), "Error en el inicio de sesión: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        } else if ((view.getId()==R.id.AQUI)) {
            Intent elegirIntent = new Intent(Menu.this, Select.class);
            startActivity(elegirIntent);
        }
    }
    public void showhome(String email){
        Intent elegirIntent = new Intent(Menu.this, MainActivity.class);
        elegirIntent.putExtra("email", email); // Utiliza elegirIntent para agregar el dato extra
        startActivity(elegirIntent);
    }
}