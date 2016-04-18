package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrimeiroQuadrante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro_quadrante);
    }

    public void chamarSegundoQuadrante(View view){
        Intent it = new Intent(this, SegundoQuadrante.class);

        startActivity(it);
    }
}
