package org.example;

import java.util.*;

public class MenuFilme {

    public void exibirMenuFilmes(Scanner scanner, SessoesService sessoesService) {
        List<Sessao> todasSessoes = sessoesService.getSessao();

        // Cria uma lista de títulos únicos de filmes
        Set<String> titulosUnicos = new HashSet<>();
        for (Sessao s : todasSessoes) {
            titulosUnicos.add(s.getTitulo());
        }

        int escolha;
        String resposta;

        do {
            System.out.println("\n------------------------ FILMES EM EXIBIÇÃO ------------------------");
            List<String> listaTitulos = new ArrayList<>(titulosUnicos); // transforma em lista para acessar por índice
            for (int i =0 ; i<listaTitulos.size();i++) {
                System.out.println("("+ (i+1) + ") - "+listaTitulos.get(i));
            }
            System.out.println("(0) - Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 0 && escolha <= listaTitulos.size()) {
                String filmeSelecionado = listaTitulos.get(escolha - 1);
                exibirInfo(filmeSelecionado, todasSessoes);

                System.out.print("Deseja ver as sessões disponíveis para esse filme? (s/n): ");
                resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    exibirSessoesPorFilme(scanner, filmeSelecionado, todasSessoes, new Ingresso());
                }
            } else if (escolha != 0) {
                System.out.println("Opção inválida!");
            }

        } while (escolha != 0);
    }

    //metodo para percorrer a sessao para puxar as informações de acordo com o titulo
    private void exibirInfo(String titulo, List<Sessao> todasSessoes) {
        for (int i = 0; i< todasSessoes.size(); i++) {
            Sessao s = todasSessoes.get(i);
            if (s.getTitulo().equals(titulo)) {
                s.exibirInfo();
                break;
            }
        }
    }

    private void exibirSessoesPorFilme(Scanner scanner, String titulo, List<Sessao> todasSessoes, Ingresso ingresso) {
        int qtd;
        System.out.println("\n-----------------SESSÕES DISPONÍVEIS DO FILME" + titulo.toUpperCase() + "-------------------");
        VendaIngresso venda = new VendaIngresso();
        Pagamento pagamento = new Pagamento();
        Menu menu = new Menu();

        //lista criada para filtrar as sessoes da lista sessoes para mostrar as opões
        List<Sessao> sessoesFiltradas = new ArrayList<>();


        //percorre as a lista sessoes identificando pelo titulo para filtrar as sessoes
        for (int i = 0; i< todasSessoes.size(); i++) {
            Sessao se = todasSessoes.get(i);
            if (se.getTitulo().equals(titulo)) {
                System.out.println("(" + (i+1) + ") - Horário: " + se.getHorario() +
                        " | Sala: " + se.getSala() +
                        " | Preço: R$" + se.getPreco());
                sessoesFiltradas.add(se); //adiciona a lista criada
            }
        }

        //usado para verificar se a lista nao esta vazia
        if (sessoesFiltradas.isEmpty()) {
            System.out.println("Nenhuma sessão disponível para este filme.");
            return;
        }

        System.out.print("(0) - Sair\nQual sessão deseja? ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao > 0 && opcao <= sessoesFiltradas.size()) {
            Sessao sessaoEscolhida = sessoesFiltradas.get(opcao - 1);
            System.out.print("Quantos ingressos deseja? ");
            qtd = scanner.nextInt();
            scanner.nextLine();
            ingresso.setQtdIngresso(qtd);
            venda.ingresso(sessaoEscolhida, pagamento, ingresso);


        } else if (opcao != 0) {
            System.out.println("Opção inválida!");
        }
    }
}
