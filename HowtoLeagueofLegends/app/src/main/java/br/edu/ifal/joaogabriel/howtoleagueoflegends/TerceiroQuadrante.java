package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TerceiroQuadrante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_quadrante);
    }

    public void chamarQuartoQuadrante(View view){
        Intent it = new Intent(this, QuartoQuadrante.class);

        startActivity(it);
    }
}
