package com.br.pedro.bruno.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.br.pedro.bruno.cardview.R;
import com.br.pedro.bruno.cardview.adapeter.PostagemAdapter;
import com.br.pedro.bruno.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclePostagens);

        //rolagem para baixo
         RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Rolagem para os lados
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //recyclerPostagem.setLayoutManager(layoutManager);

        //grid com dois cards por linha
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager( this,2);
        //recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Pedro Bruno","@tbt viagem legal",R.drawable.imagem1);
        this.postagens.add(p);

       p = new Postagem("Pedro Bruno","@tbt viagem legal",R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Pedro Bruno","@tbt viagem legal",R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Pedro Bruno","@tbt viagem legal",R.drawable.imagem4);
        this.postagens.add(p);
    }
}