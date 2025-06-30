//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Scanner;

public class Ingresso {

    private int qtdIngresso;
    private String formaPagamento;
    private double valorPagamento;

    public Ingresso() {
        this.qtdIngresso = 0;
        this.formaPagamento = "";
        this.valorPagamento = 0.0;
    }

    public Ingresso(int qtdIngresso, String formaPagamento, double valorPagamento) {
        this.qtdIngresso = qtdIngresso;
        this.formaPagamento = formaPagamento;
        this.valorPagamento = valorPagamento;
    }

    public int getQtdIngresso() {
        return qtdIngresso;
    }

    public void setQtdIngresso(int i) {
        this.qtdIngresso = qtdIngresso = i;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double v) {
        this.valorPagamento = valorPagamento;
    }

    }
