package br.usjt.arqdsis.consultacnpj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    EditText editTextCNPJ;
    Callback<ConsultaCNPJ> callbackCNPJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        configurarCallbackCNPJ();

        editTextCNPJ = (EditText)findViewById(R.id.editTextCNPJ);


        Button fab = (Button) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new APIClient().getRestService().getConsultaCNPJ(editTextCNPJ.getText().toString(),callbackCNPJ);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void configurarCallbackCNPJ() {

        callbackCNPJ = new Callback<ConsultaCNPJ>() {

            @Override public void success(ConsultaCNPJ consultaCNPJ, Response response) {

                if(response.getStatus()==200) {
                    //Log.d("RESPOSTA",consultaCNPJ.toString());
                    Intent intent = new Intent(MainActivity.this, RespostaActivity.class);
                    String resposta = consultaCNPJ.toString();
                    intent.putExtra("resposta", resposta);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Falha na comunicação com o servidor!",Toast.LENGTH_LONG).show();
                }

            }

            @Override public void failure(RetrofitError error) {

                Toast.makeText(MainActivity.this,"Falha na comunicação com o servidor!",Toast.LENGTH_LONG).show();

                Log.e("RETROFIT", "Error:"+error.getMessage());
            }
        };
    }

}
