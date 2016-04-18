package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundoQuadrante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_quadrante);
    }

    public void chamarTerceiroQuadrante(View view){
        Intent it = new Intent(this, TerceiroQuadrante.class);

        startActivity(it);
    }
}
