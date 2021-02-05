package com.example.recetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class registrarse extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;
    private EditText txtEmail;
    private EditText txtContraseña;
    private Button btnRegistrarse;
    private ProgressBar progressBar;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        firebaseAuth = FirebaseAuth.getInstance();

        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);

        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);

        progressBar = new ProgressBar(this);
        progressDialog = new ProgressDialog(this);
        btnRegistrarse.setOnClickListener(this);
    }

    private void registrarUsuario(){
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

        progressDialog.setMessage("Se está realizando el registro en linea...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(registrarse.this, "Se ha registrado el usuario: " + txtEmail.getText(), Toast.LENGTH_LONG).show();

                }else{
                    if (task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(registrarse.this, "El usuario ya existe, ve a la página de entrada.", Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(registrarse.this, "No se ha podido registrar el usuario", Toast.LENGTH_LONG).show();
                    }

                }
                progressDialog.dismiss();
            }
        });
    }

    public void onClick (View view){
        registrarUsuario();
    }
}
