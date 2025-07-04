package org.example.metodos;

import org.example.classe.Usuario;

import java.util.Scanner;

public class CadastrarUsuario {


    public Usuario cadastroUsuario(){
        Scanner s = new Scanner(System.in);
        String nome;
        String cpf;
        String email;
        String senha;


        System.out.println("------------------------CADASTRO DE USUARIO---------------------");
        do {
            System.out.println("Nome: ");
            nome = s.nextLine().trim();
            if (nome.length() < 3 || !nome.contains(" ")){
                System.out.println("Insira seu nome completo");
            }
        }while(nome.length() < 3 || !nome.contains(" "));

        do {
            System.out.println("CPF: ");
            cpf = s.nextLine().trim();
            if (cpf.length() != 11){
                System.out.println("CPF inválido!!");
            }
        }while(cpf.length() != 11);

        do {
            System.out.println("E-mail: ");
            email = s.nextLine().trim();
            if(email.length() < 10 || !email.contains("@")){
                System.out.println("E-mail inválido!!");
            }
        }while(email.length() < 10 || !email.contains("@"));

        do {
            System.out.println("Senha: ");
            senha = s.nextLine().trim();
            if (senha.length() < 6) {
                System.out.println("Senha inválida!!");
                System.out.println("Senha deve contar no minimo 6 digitos");
            }
        }while (senha.length() < 6);

        Usuario usuario = new Usuario(nome,cpf,email,senha);
        return usuario;
    }
}
