package org.example;

import org.example.classe.Ingresso;

import java.util.Scanner;

public class ExibirContaUsuario {
    public void exibirConta(Usuario usuario, Sessao sessao, Ingresso ingresso, Pagamento pagamento, double valorFinal) {
        Scanner s = new Scanner(System.in);
        VendaIngresso venda =new VendaIngresso();
        String op3;

        System.out.println("-----------------------------CONTA USUARIO-------------------------");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Senha: *************");

        System.out.println("\nDeseja visualizar a senha? (s/n)");
        op3 = s.nextLine();

        if(op3.equalsIgnoreCase("s")) {
            System.out.println("Senha: " + usuario.getSenha());
        }
    }

}
