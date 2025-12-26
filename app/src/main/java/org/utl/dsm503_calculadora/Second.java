package org.utl.dsm503_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnRegresar=findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(view ->{
            Intent abrirPrimeraVista=new Intent(this, MainActivity.class);
            startActivity(abrirPrimeraVista);
        });

        Bundle extras=getIntent().getExtras();
        System.out.println("El nombre enviado fue: "+extras.getString("nombre"));
        System.out.println("El apellido enviado fue: "+ extras.getString("apellido"));
        Toast.makeText(this,"El nombre enviado fue: "+extras.getString("nombre")+" "+extras.getString("apellido"),
                Toast.LENGTH_SHORT).show();
    }

}