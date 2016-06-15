package com.caiomelo.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ranking extends Activity {

    private Button btnResponderNovamente,btnSair;
    private TextView txtNome,txtPontos;
    private int pontos;
    private String nome,pontos1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking);


        txtNome = (TextView) findViewById(R.id.txtNome);
        txtPontos = (TextView) findViewById(R.id.txtPontos);

        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        pontos = it.getIntExtra("pontos", 0);

        pontos1 = (pontos+"");
        txtNome.setText(nome);
        txtPontos.setText(pontos1);

        btnResponderNovamente = (Button) findViewById(R.id.btnResponder);
        btnSair = (Button) findViewById(R.id.btnSair);

    }

    public void ResponderNovamente(View v){
        Intent itRestart = new Intent(Ranking.this,Pergunta1.class);
        itRestart.putExtra("nome",nome);
        startActivity(itRestart);
        finish();
    }

    public void Sair(View v){
        finish();
        }
    }


