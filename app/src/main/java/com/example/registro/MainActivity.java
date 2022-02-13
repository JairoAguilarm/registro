package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nomb, ape, edad, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomb = (EditText)findViewById(R.id.nomb);
        ape = (EditText)findViewById(R.id.ape);
        edad = (EditText)findViewById(R.id.edad);
        mail = (EditText)findViewById(R.id.mail);

    }

    public void envia(View v){
        Intent j = new Intent( this, MainActivity2.class);
        j.putExtra("dato", nomb.getText().toString());
        j.putExtra("dato1", ape.getText().toString());
        j.putExtra("dato2", edad.getText().toString());
        j.putExtra("dato3", mail.getText().toString());

        startActivity(j);
    }


}