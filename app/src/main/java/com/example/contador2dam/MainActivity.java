package com.example.contador2dam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //para cambiar cosas, definir a nivel de clase
    private TextView txt_contador = null;
    private int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_contador = (TextView) findViewById(R.id.txt_contador);//se utiliza mucho este metodo
        cont = 0;
    }

    public void ImplementarContador(View view) {
        cont++;
        if (cont == 100)
        {
            txt_contador.setTextSize(150);
            Toast.makeText(this,R.string.txt_llevas100,Toast.LENGTH_SHORT).show();

        }
            txt_contador.setText(Integer.toString(cont));

    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this, R.string.txt_saludo, Toast.LENGTH_SHORT).show();
    }
}