package com.br.pedro.bruno.cardview.adapeter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.br.pedro.bruno.cardview.R;
import com.br.pedro.bruno.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(PostagemAdapter.MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);

        holder.txtTitulo.setText(postagem.getNome());
        holder.txtPostagem.setText(postagem.getPostagem());
        holder.imgPostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitulo;
        private TextView txtPostagem;
        private ImageView imgPostagem;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtPostagem = itemView.findViewById(R.id.txtPostagem);
            imgPostagem = itemView.findViewById(R.id.imgPostagem);
        }

    }

}
