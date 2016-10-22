package br.usjt.arqdsis.consultacnpj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    TextView tvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        tvResposta = (TextView) findViewById(R.id.tvResposta);

        /*
            Recebe os dados vindo da MainActivity
         */
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("resposta");
        tvResposta.setText(mensagem);
    }


}
