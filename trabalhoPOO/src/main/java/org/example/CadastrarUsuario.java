package org.example;

import java.util.Scanner;

public class CadastrarUsuario {
    public Usuario cadastroUsuario(){
        Scanner s = new Scanner(System.in);

        System.out.println("------------------------CADASTRO DE USUARIO---------------------");

        System.out.println("Nome: ");
        String nome =  s.nextLine();

        System.out.println("CPF: ");
        String cpf = s.nextLine();

        System.out.println("E-mail: ");
        String email = s.nextLine();

        System.out.println("Senha: ");
        String senha = s.nextLine();

        Usuario usuario = new Usuario(nome,cpf,email,senha);
        return usuario;
    }
}
