package org.example;
import org.example.classe.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmeService extends Filme {
    public FilmeService(String titulo, String genero, String duracao, String classificacao) {
        super(titulo, genero, duracao, classificacao);
    }
    public List<Filme> getFilmes() {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Lilo & Stitch", "Aventura", "108 min", "10 anos"));


        filmes.add(new Filme("Extermínio: a Evolução", "Terror", "115 min", "18 anos"));
        filmes.add(new Filme("Como Treinar o Seu Dragão", "Aventura", "126 min", "10 anos"));
        filmes.add(new Filme("Elio ", "Animação", "100 min", "Livre"));
        filmes.add(new Filme("Bailarina", "Ação", "125 min", "18 anos"));
        filmes.add(new Filme("Homem com h","Drama","130 min","16 anos"));

        filmes.sort(Comparator.comparing(Filme::getTitulo));
        return filmes;
    }
}