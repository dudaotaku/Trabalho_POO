//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.classe;

import java.time.LocalTime;

public class Sessao extends Filme {
    private LocalTime horario;
    private String sala;
    private double preco;
    private int vagasDisponivel;

    public Sessao(String titulo, String genero, String duracao, String classificacao, LocalTime horario, String sala, double preco, int vagasDisponivel) {
        super(titulo, genero, duracao, classificacao);
        this.horario = horario;
        this.sala = sala;
        this.preco = preco;
        this.vagasDisponivel = vagasDisponivel;
    }
    public Sessao() {
        super("", "", "", "");
        this.horario = LocalTime.now();
        this.sala = "";
        this.preco = 0.0;
        this.vagasDisponivel = 0;
    }

    public int getVagasDisponivel() {
        return this.vagasDisponivel;
    }

    public void setVagasDisponivel(int vagasDisponivel) {
        this.vagasDisponivel = vagasDisponivel;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void exibirInfo(){
        System.out.println("-----------------------INFORMAÇÕES DO FILME -----------------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Classificação: " + this.getClassificacao());
        System.out.println("Duração: " + this.getDuracao());
        System.out.println("----------------------------------------------");
    }
}
