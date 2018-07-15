package com.androidmorefast.moden.appclicbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //creamos nuestra variables locales al tipo
    //que pertenecen y de acceso private
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hacemos referencia a nuestras variables creadas
        //con los Edittext y Textview
        numero1=(EditText)findViewById(R.id.txtNum1);
        numero2=(EditText)findViewById(R.id.txtNum2);
        resultado=(TextView)findViewById(R.id.txtResultado);
    }
    //el metodo sumar nos servira para hacer la operacion
    public void sumar(View view) {
        String valor1=numero1.getText().toString();
        String valor2=numero2.getText().toString();

        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int suma=num1+num2;
        String resu=String.valueOf(suma);
        resultado.setText("El resultado es: "+resu);
    }
}
