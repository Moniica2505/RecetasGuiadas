package com.example.recetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;
    private EditText txtEmail;
    private EditText txtContraseña;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(this);
    }

    private void loguearUsuario(){
        String email = txtEmail.getText().toString().trim();
        String pass = txtContraseña.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Se debe escribir un Email", Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this, "Se debe escribir una Contraseña", Toast.LENGTH_LONG).show();
            return;
        }

        firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Intent i = new Intent (getApplication(), Principal.class);
                    startActivity(i);
                    //oyente_btnEntrar();
                }else{
                    if (task.getException() instanceof FirebaseAuthInvalidCredentialsException){
                        Toast.makeText(LoginActivity.this, "El usuario no está registrado.", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(LoginActivity.this, "No se pudo acceder.", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
    public void onClick(View view){
        loguearUsuario();
    }

    public void oyente_btnEntrarSinRegistro (View v){
        Intent i = new Intent (this, Principal.class);
        startActivity(i);
    }

    public void oyente_btnRegistro (View v){
        Intent i = new Intent(this, registrarse.class);
        startActivity(i);
    }
}
