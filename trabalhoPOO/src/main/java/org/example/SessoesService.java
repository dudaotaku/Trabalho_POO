package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SessoesService {
    public List<Sessao> getSessao() {
        List<Sessao> sessoes = new ArrayList<>();
        sessoes.add(new Sessao("Lilo & Stitch", "Aventura", "108 min", "10 anos",LocalTime.of(13,30), "2B",28.90,20 ));
        sessoes.add(new Sessao("Lilo & Stitch", "Aventura", "108 min", "10 anos",LocalTime.of(16,30), "2B",28.90,20 ));
        sessoes.add(new Sessao("Lilo & Stitch", "Aventura", "108 min", "10 anos",LocalTime.of(19,30), "2B",28.90,20 ));

        sessoes.add(new Sessao("Extermínio: a Evolução", "Terror", "115 min", "18 anos",LocalTime.of(14,30), "1A",28.90,20));
        sessoes.add(new Sessao("Extermínio: a Evolução", "Terror", "115 min", "18 anos",LocalTime.of(17,15), "1A",28.90,20));


        sessoes.add(new Sessao("Como Treinar o Seu Dragão", "Aventura", "126 min", "10 anos",LocalTime.of(15,30), "3C",28.90,20));
        sessoes.add(new Sessao("Como Treinar o Seu Dragão", "Aventura", "126 min", "10 anos",LocalTime.of(16,15), "3C",28.90,20));
        sessoes.add(new Sessao("Como Treinar o Seu Dragão", "Aventura", "126 min", "10 anos",LocalTime.of(20,00), "3C",28.90,20));


        sessoes.add(new Sessao("Elio ", "Animação", "100 min", "Livre", LocalTime.of(15,30), "4D",28.90,20));
        sessoes.add(new Sessao("Elio ", "Animação", "100 min", "Livre", LocalTime.of(13,30), "4D",28.90,20));


        sessoes.add(new Sessao("Bailarina", "Ação", "125 min", "18 anos",LocalTime.of(22,30), "1A",28.90,20));
        sessoes.add(new Sessao("Bailarina", "Ação", "125 min", "18 anos",LocalTime.of(20,15), "1A",28.90,20));
        sessoes.add(new Sessao("Bailarina", "Ação", "125 min", "18 anos",LocalTime.of(19,00 ),"1A",28.90,20));
        sessoes.add(new Sessao("Bailarina", "Ação", "125 min", "18 anos",LocalTime.of(13,10), "3C",28.90,20));


        sessoes.add(new Sessao("Homem com h","Drama","130 min","16 anos",LocalTime.of(21,30), "2B",28.90,20));
        sessoes.add(new Sessao("Homem com h","Drama","130 min","16 anos",LocalTime.of(23,30), "2B",28.90,20));

        return sessoes;
    }


}
