package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quadrantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrantes);
    }

    public void chamarPrimeiroQuadrante(View view){
        Intent it = new Intent(this, PrimeiroQuadrante.class);

        startActivity(it);
    }

    public void chamarSegundoQuadrante(View view){
        Intent it = new Intent(this, SegundoQuadrante.class);

        startActivity(it);
    }

    public void chamarTerceiroQuadrante(View view){
        Intent it = new Intent(this, TerceiroQuadrante.class);

        startActivity(it);
    }

    public void chamarQuartoQuadrante(View view){
        Intent it = new Intent(this, QuartoQuadrante.class);

        startActivity(it);
    }
}
