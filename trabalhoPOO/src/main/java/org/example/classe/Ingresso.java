//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.classe;

public class Ingresso {

    private int qtdIngresso;

    private double valorPagamento;

    public Ingresso() {
        this.qtdIngresso = 0;
        this.valorPagamento = 0.0;
    }

    public Ingresso(int qtdIngresso, String formaPagamento, double valorPagamento) {
        this.qtdIngresso = qtdIngresso;
        this.valorPagamento = valorPagamento;
    }

    public int getQtdIngresso() {
        return qtdIngresso;
    }

    public void setQtdIngresso(int i) {
        this.qtdIngresso = qtdIngresso = i;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double v) {
        this.valorPagamento = valorPagamento;
    }

    }
