package com.caiomelo.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaPrincipal extends Activity {

    private EditText txtNome;
    private Button btnIniciar;
    public int Pontos;
    public String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);

        txtNome = (EditText) findViewById(R.id.txtNome);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);

    }

    public void proximaTela(View v){

        if (txtNome.getText().toString().equals("")) {
            Toast.makeText(this, "Insira o Seu Nome", Toast.LENGTH_SHORT).show();
        }else {
            Pontos = 0;
            Intent it = new Intent(TelaPrincipal.this,Pergunta1.class);
            it.putExtra("nome", txtNome.getText().toString());
            it.putExtra("pontos", Pontos);
            startActivity(it);
            finish();
        }
    }


}
