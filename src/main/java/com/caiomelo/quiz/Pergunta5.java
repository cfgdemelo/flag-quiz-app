package com.caiomelo.quiz;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Pergunta5 extends Activity {

    private Button btnResponder,btnProx;
    private RadioButton rdbErr1,rdbErr2,rdbErr3,rdbCerto;
    private int pontos;
    private String nome;
    Boolean respondido = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pergunta5);

        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        pontos = it.getIntExtra("pontos", 0);


        rdbCerto = (RadioButton) findViewById(R.id.rdbCerto);
        rdbErr1 = (RadioButton) findViewById(R.id.rdbErr1);
        rdbErr2 = (RadioButton) findViewById(R.id.rdbErr2);
        rdbErr3 = (RadioButton) findViewById(R.id.rdbErr3);

        btnProx = (Button) findViewById(R.id.btnProx);
        btnResponder = (Button) findViewById(R.id.btnResponder);

    }

    public void Responder5(View v){
        if(rdbCerto.isChecked()){
            Toast.makeText(this, "Resposta Correta!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "10 Pontos", Toast.LENGTH_SHORT).show();
            btnResponder.setEnabled(false);
            rdbCerto.setEnabled(false);
            rdbErr1.setEnabled(false);
            rdbErr2.setEnabled(false);
            rdbErr3.setEnabled(false);
            pontos = pontos +10;
            respondido = true;
            MediaPlayer acertou = MediaPlayer.create(this, R.raw.acertou);
            acertou.start();
        }else if(rdbErr1.isChecked()){
            Toast.makeText(this, "Resposta Errada!", Toast.LENGTH_SHORT).show();
            btnResponder.setEnabled(false);
            rdbCerto.setEnabled(false);
            rdbErr1.setEnabled(false);
            rdbErr2.setEnabled(false);
            rdbErr3.setEnabled(false);
            respondido = true;
            MediaPlayer errou = MediaPlayer.create(this,R.raw.errou);
            errou.start();
        }else if(rdbErr2.isChecked()){
            Toast.makeText(this, "Resposta Errada!", Toast.LENGTH_SHORT).show();
            btnResponder.setEnabled(false);
            rdbCerto.setEnabled(false);
            rdbErr1.setEnabled(false);
            rdbErr2.setEnabled(false);
            rdbErr3.setEnabled(false);
            respondido = true;
            MediaPlayer errou = MediaPlayer.create(this,R.raw.errou);
            errou.start();
        }else if(rdbErr3.isChecked()){
            Toast.makeText(this, "Resposta Errada!", Toast.LENGTH_SHORT).show();
            btnResponder.setEnabled(false);
            rdbCerto.setEnabled(false);
            rdbErr1.setEnabled(false);
            rdbErr2.setEnabled(false);
            rdbErr3.setEnabled(false);
            respondido = true;
            MediaPlayer errou = MediaPlayer.create(this,R.raw.errou);
            errou.start();
        }else{
            Toast.makeText(this, "Escolha uma alternativa!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Proxima5(View v){
        Intent it5 = new Intent(Pergunta5.this,Pergunta6.class);
        it5.putExtra("nome",nome);
        it5.putExtra("pontos",pontos);
        if(respondido == false){
            Toast.makeText(this, "Escolha uma alternativa!", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(it5);
            finish();
        }
    }


}
