package com.appturisticas.especializacion.valleturistica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.appturisticas.especializacion.valleturistica.Hoteles.HotelesActivity;
import com.appturisticas.especializacion.valleturistica.Operadores.OperadoresActivity;
import com.appturisticas.especializacion.valleturistica.Sitios.SitiosTuristicosActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnSitio, btnHoteles, btnOperadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSitio = (Button) findViewById(R.id.btnSitiosTuristicos);
        btnSitio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SitiosTuristicosActivity.class);
                startActivity(intent);
            }
        });


        btnHoteles = (Button) findViewById(R.id.btnHoteles);
        btnHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HotelesActivity.class);
                startActivity(intent);
            }
        });

        btnOperadores = (Button) findViewById(R.id.btnOperadores);
        btnOperadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), OperadoresActivity.class);
                startActivity(intent);
            }
        });
    }
}
