package com.tokenbuddy.miprimeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MiPrimeraAplicacion extends AppCompatActivity {

    //por defecto declara estos atributos public
    EditText nombreIngresado;
    TextView textoIngr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_primera_aplicacion);
    }

    public void disteClick(View vista) {
        //El método "findViewById" lo que hace es llamar una vista
        //"R." es necesario, es lo que nos permite acceder a las cosas no JAVA. Por ejemplo un "id", un "layout" entre otros
        nombreIngresado = (EditText) findViewById(R.id.nombreIngresado);
        textoIngr = (TextView) findViewById(R.id.textoIngr);

        String cambioTexto = nombreIngresado.getText().toString();

        textoIngr.setText(cambioTexto);
    }

}
