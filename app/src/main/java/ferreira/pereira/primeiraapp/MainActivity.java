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
        //Lê o arquivo de layout e costroi a interface
        setContentView(R.layout.activity_main);
        //Pega o ID do botao enviar
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Define um evento para o botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtem o campo de texto
                EditText etDigiteAqui=findViewById(R.id.etDigiteaqui);
                // Obtem o texto que foi digitado pelo usuario na caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();
                // Cria uma intecao para navegar para proxima tela
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                // Coloca um texto dentro da intecao para ser enviado para proxima tela
                i.putExtra("texto",textoDigitado);
                // Executa a intencao e navega para proxima tela
                startActivity(i);

            }
        });
    }
}