package ferreira.pereira.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        // Obtem o intent que criou essa tela
        Intent i = getIntent();
        // Obtem o texto que veio junto do intent
        String texto = i.getStringExtra("texto");
        // Obtem o elemento de interface do textview
        TextView tvtexto = findViewById(R.id.tvTexto);
        // Ceta o texto dentro do textview
        tvtexto.setText(texto);
    }
}