package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Nombre ingresado : "+ dato);
        String dato1 = getIntent().getStringExtra("dato1");
        tv2.setText("Apellido ingresado : "+ dato1);
        String dato2 = getIntent().getStringExtra("dato2");
        tv3.setText("Edad ingresado : "+ dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        tv4.setText("Correo ingresado : "+ dato3);

    }
    public void retro(View v){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);

    }
}
