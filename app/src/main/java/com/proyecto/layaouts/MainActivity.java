package com.proyecto.layaouts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;<
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*  de variables */
        mensaje = (TextView) findViewById(R.id.seleccionar);

    }
    public void select (View view){
        mensaje.setTextColor(Color.BLUE);
    }

    public void mod2 (View view){


    }

}
