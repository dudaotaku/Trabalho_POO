package org.example.metodos;

import org.example.OpcaoInvalidaException;
import org.example.classe.Usuario;

import java.util.Scanner;

public class AtualizacaoCadastro {
    public void atualizarCadastro(Usuario usuario, Scanner scanner) {
        int opcao;
        String opSenha;

        do {
            System.out.println("\n----- ATUALIZAR CADASTRO -----");
            System.out.println("1 - Nome: " + usuario.getNome());
            System.out.println("2 - CPF: " + usuario.getCpf());
            System.out.println("3 - E-mail: " + usuario.getEmail());
            System.out.println("4 - Senha: ***********");
            System.out.println("0 - Voltar ao menu principal");

            System.out.print("Escolha o campo que deseja atualizar: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após nextInt()

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        usuario.setNome(novoNome);
                        System.out.println("Nome atualizado!");
                        break;
                    case 2:
                        System.out.print("Digite o novo CPF: ");
                        String novoCpf = scanner.nextLine();
                        usuario.setCpf(novoCpf);
                        System.out.println("CPF atualizado!");
                        break;
                    case 3:
                        System.out.print("Digite o novo e-mail: ");
                        String novoEmail = scanner.nextLine();
                        usuario.setEmail(novoEmail);
                        System.out.println("E-mail atualizado!");
                        break;
                    case 4:
                        System.out.println("Digite sua senha anterior: ");
                        opSenha = scanner.nextLine();
                        if (opSenha.equalsIgnoreCase(usuario.getSenha())) {
                            System.out.print("Digite a nova senha: ");
                            String novaSenha = scanner.nextLine();
                            usuario.setSenha(novaSenha);
                            System.out.println("Senha atualizada!");
                        } else {
                            System.out.println("Senha inválida!!");
                        }
                        break;
                    case 0:
                        System.out.println("Voltando ao menu...");
                        break;
                    default:
                        throw new OpcaoInvalidaException("Opção inválida! Tente novamente.");
                }
            } catch (OpcaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);
    }
}
