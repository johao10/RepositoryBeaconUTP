package com.example.guiabeaconmaster2.Activitys;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.guiabeaconmaster2.R;
/*
import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;*/

public class ResetPassword extends AppCompatActivity {

    private EditText mEditTextEmail;
    private Button mButtonResetPassword;

    /*private String email="";
    private FirebaseAuth mAuth;
    private ProgressDialog mDialog;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

            /*mAuth = FirebaseAuth.getInstance();

            mDialog = new ProgressDialog(this);*/

            mButtonResetPassword = (Button) findViewById(R.id.btnResetPassword);
            mEditTextEmail = (EditText)findViewById(R.id.editTextEmail);
/*
            mButtonResetPassword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   email = mEditTextEmail.getText().toString();

                    if (!email.isEmpty()){
                        mDialog.setMessage("espera un momento...");
                        mDialog.setCanceledOnTouchOutside(false);
                        mDialog.show();
                        resetPassword();

                    }else {
                        Toast.makeText(ResetPassword.this,"Debe ingresar el Email",Toast.LENGTH_SHORT).show();
                    }
                    mDialog.dismiss();
                }
            });


    }
    public void resetPassword(){

        mAuth.setLanguageCode("es");
        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if (task.isSuccessful()) {

                    Toast.makeText(ResetPassword.this,"Se ha enviado un correo para restablecer la contraseña",Toast.LENGTH_SHORT).show();


                }else {
                    Toast.makeText(ResetPassword.this,"No se pudo enviar el correo de restablecer contraseña",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }*/

    }
}
