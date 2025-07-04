//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.classe;

public class Usuario extends Pessoa {
    private String senha;

    public Usuario(String nome, String cpf, String email, String senha) {
        super(nome, cpf, email);
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
