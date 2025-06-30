package org.example;

import java.util.Scanner;

public class ExibirContaUsuario {
    public void exibirConta(Usuario usuario, Sessao sessao, Ingresso ingresso, Pagamento pagamento, double valorFinal) {
        Scanner s = new Scanner(System.in);
        String op3;

        System.out.println("-----------------------------CONTA USUARIO-------------------------");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Senha: *************");

        System.out.println("Deseja visualizar a senha? (s/n)");
        op3 = s.nextLine();

        if(op3.equalsIgnoreCase("s")) {
            System.out.println("Senha: " + usuario.getSenha());
        }

        System.out.println("\n------------------------------RESUMO DA CONTA---------------------------");

        // Validações para evitar NullPointerException
        if (sessao != null && ingresso != null && pagamento != null) {
            System.out.println("Filme: " + (sessao.getTitulo() != null ? sessao.getTitulo() : "Não informado"));
            System.out.println("Horário: " + (sessao.getHorario() != null ? sessao.getHorario() : "Não informado"));
            System.out.println("Sala: " + (sessao.getSala() != null ? sessao.getSala() : "Não informado"));
            System.out.println("Qtd de ingressos: " + (ingresso.getQtdIngresso() > 0 ? ingresso.getQtdIngresso() : "Não informado"));
            System.out.println("Forma de pagamento: " + (pagamento.getForma() != null ? pagamento.getForma() : "Não informado"));
            System.out.printf("Total pago: R$%.2f\n", valorFinal);
        } else {
            System.out.println("Dados da compra não disponíveis.");
        }
    }

}
