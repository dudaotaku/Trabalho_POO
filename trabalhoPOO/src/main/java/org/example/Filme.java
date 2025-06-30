//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

public class Filme {
    private String titulo;
    private String genero;
    private String duracao;
    private String classificacao;

    public Filme(String titulo, String genero, String duracao, String classificacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void exibirInfo(){
        System.out.println("-----------------------INFORMAÇÕES DO FILME -----------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Classificação: " + this.classificacao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("----------------------------------------------");
    }
}
