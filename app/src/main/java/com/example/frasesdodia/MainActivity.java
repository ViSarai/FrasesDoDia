package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "É em meio a dificuldade que se encontra a oportunidade",
                "O êxito é ir de frustração a frustração sem perder a animação",
                "Mesmo que algo pareça difícil, nunca desista antes de tentar",
                "Você é o único que entende as suas dificuldades, por isso motive se a prosseguir",
                "Não é uma vida ruim, é apenas um dia ruim, lembre-se disso",
                "A maior prova de que você pode fazer o impossível, é superar circunstâncias difíceis",
                "Que os dias bons se tornem rotina, e os ruins se tornem raros”",
                "É genial celebrar a vitória, contudo é mais significativo aprender com as lições da derrota",
                "Qualquer dificuldade pode ser ultrapassada, já que para todo problema há uma solução",
                "Suas pequenas vitórias são todas as dificuldades superadas durante sua vida, tenha orgulho delas",
                "Já pensou que você já superou muitas dificuldades até aqui?",
                "Cada dificuldade ultrapassada te faz mais forte",
                "Palmeiras não tem Mundial",
                "Você é único representante do seus sonhos aqui na terra, se isso não fizer você correr atrás não sei o que vai",
                "Se você não tem raiva de suas primeiras versões, você está muito atrasado",

                "Você é FODA!"
        };

        int numero = new Random().nextInt(16);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero]);
    }

}