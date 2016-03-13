package br.edu.ifal.joaogabriel.howtoleagueoflegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Chamada quando o usuario clicar na opcao "O que e"
    public void chamarOQueE(View view){
        Intent it = new Intent(this, OQueE.class);

        startActivity(it);
    }

    //Chamada quando o usuario clicar na opcao "Quem Criou"
    public void chamarQuemCriou(View view){
        Intent it = new Intent(this, QuemCriou.class);

        startActivity(it);
    }

    //Chamada quando o usuario clicar na opcao "Como funciona o mapa"
    public void chamarOMapa(View view){
        Intent it = new Intent(this, ComoFuncionaOMapa.class);

        startActivity(it);
    }
}
