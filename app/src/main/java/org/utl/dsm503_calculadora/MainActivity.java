package org.utl.dsm503_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// se definen los controles de la aplicacion
    EditText txtNum1;
    EditText txtNum2;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;
    TextView txtResultado;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se define el dataBinding de la aplicacion
        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        btnSumar=findViewById(R.id.btnSumar);
        btnRestar=findViewById(R.id.btnRestar);
        btnMultiplicar=findViewById(R.id.btnMultiplicar);
        btnDividir=findViewById(R.id.btnDividir);
        txtResultado=findViewById(R.id.txtResultado);
        btnSiguiente=findViewById(R.id.btnSiguiente);

        //Se definen los eventos a nuestros componentes (botones, iniciar servicios, etc.)
        btnSumar.setOnClickListener(view ->{
            sumar();
        });
        btnRestar.setOnClickListener(view ->{
            restar();
        });
        btnDividir.setOnClickListener(view ->{
            Dividir();
        });
        btnMultiplicar.setOnClickListener(view ->{
            Multiplicar();
        });
        btnSiguiente.setOnClickListener(view ->{
            Intent abrirSegundaVista=new Intent(this, Second.class);
            abrirSegundaVista.putExtra("nombre","Un");
            abrirSegundaVista.putExtra("apellido","Nombre");
            startActivity(abrirSegundaVista);
        });
    }

    public void saludar(){
        Toast.makeText(this,"Hola desde Java",Toast.LENGTH_SHORT).show();
    }
    public void sumar(){
        double num1, num2, resultado;
        num1=Double.parseDouble(txtNum1.getText().toString());
        num2=Double.parseDouble(txtNum2.getText().toString());
        resultado=num1+num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void restar(){
        double num1, num2, resultado;
        num1=Double.parseDouble(txtNum1.getText().toString());
        num2=Double.parseDouble(txtNum2.getText().toString());
        resultado=num1-num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void Dividir(){
        double num1, num2, resultado;
        num1=Double.parseDouble(txtNum1.getText().toString());
        num2=Double.parseDouble(txtNum2.getText().toString());
        resultado=num1/num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void Multiplicar(){
        double num1, num2, resultado;
        num1=Double.parseDouble(txtNum1.getText().toString());
        num2=Double.parseDouble(txtNum2.getText().toString());
        resultado=num1*num2;
        txtResultado.setText(String.valueOf(resultado));
    }
}