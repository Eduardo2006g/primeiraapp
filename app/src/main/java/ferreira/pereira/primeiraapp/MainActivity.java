package ferreira.pereira.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Pega o Id do botão enviar
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Define um evento pro botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pega o ID do texto
                EditText etDigiteAqui=findViewById(R.id.etDigiteaqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto",textoDigitado);
                startActivity(i);

            }
        });
    }
}