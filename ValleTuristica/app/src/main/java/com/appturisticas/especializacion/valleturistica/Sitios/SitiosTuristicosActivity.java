package com.appturisticas.especializacion.valleturistica.Sitios;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.appturisticas.especializacion.valleturistica.R;

public class SitiosTuristicosActivity extends Activity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_turisticos);
        btn = (Button)findViewById(R.id.btnSitioVisualizar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VisualizarSitiosActivity.class);
                startActivity(intent);
            }
        });
    }
}
