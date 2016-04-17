package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ComoFuncionaOMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_funciona_o_mapa);
    }

    public void chamarProximaPagina(View view){
        Intent it = new Intent(this, Quadrantes.class);

        startActivity(it);
    }
}
