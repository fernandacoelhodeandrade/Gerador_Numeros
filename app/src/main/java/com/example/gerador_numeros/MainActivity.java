package com.example.gerador_numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Integer> numerosSorteados = new ArrayList<>();
    private long maximoSorteio = Integer.MAX_VALUE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sortear(View v) {

        TextView texto = findViewById(R.id.textResultado);

        int x = gerarNumeroAleatorio();

        numerosSorteados.add(x);

        texto.setText("Número: " + x);
    }

    private int gerarNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt((int) maximoSorteio);

        while (numerosSorteados.contains(numeroAleatorio)) {
            numeroAleatorio = random.nextInt((int) maximoSorteio);
        }

        return numeroAleatorio;
    }

}
