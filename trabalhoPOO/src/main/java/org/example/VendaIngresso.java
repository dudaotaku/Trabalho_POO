package org.example;
import org.example.classe.EnderecoEmpresa;
import org.example.classe.Ingresso;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;


public class VendaIngresso {
    InfoEmpresa infoEmpresa = new InfoEmpresa();
    EnderecoEmpresa enderecoEmpresa = new EnderecoEmpresa();

    public void ingresso(Sessao sessao, Pagamento pagamento, Ingresso ingresso, Pessoa usuario){
        Scanner s = new Scanner(System.in);
        int op1;

        // Cálculo do valor total com 10% de taxa de serviço
        double totalSemTaxa = ingresso.getQtdIngresso() * sessao.getPreco();
        double taxa = totalSemTaxa * 0.10;
        double valorFinal = totalSemTaxa + taxa;

        pagamento.setValorTotal(valorFinal);
        ingresso.setValorPagamento(valorFinal);

        System.out.printf("Subtotal: R$%.2f\n", totalSemTaxa);
        System.out.printf("Taxa de serviço (10%%): R$%.2f\n", taxa);
        System.out.printf("Valor total: R$%.2f\n", valorFinal);

        do {
            System.out.println("\nSelecione a forma de pagamento:");
            System.out.println("(1) - Cartão de crédito");
            System.out.println("(2) - Cartão de débito");
            System.out.println("(3) - Dinheiro");
            System.out.println("(4) - Pix");
            System.out.println("(0) - Cancelar compra");
            op1 = s.nextInt();

            switch(op1){
                case 1:
                    pagamento.setForma(FormaPagamento.cartaoCredito);
                    break;
                case 2:
                    pagamento.setForma(FormaPagamento.cartaoDebito);
                    break;
                case 3:
                    pagamento.setForma(FormaPagamento.dinheiro);
                    break;
                case 4:
                    pagamento.setForma(FormaPagamento.pix);
                    break;
                case 0:
                    System.out.println("Compra cancelada. Retornando ao menu...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }
            resumoCom(sessao,ingresso,pagamento, valorFinal, usuario);
            break;

        } while(op1 != 0);
    }

    public void resumoCom(Sessao sessao, Ingresso ingresso, Pagamento pagamento, double valorFinal, Pessoa usuario){
        System.out.println("\n------------------------------RESUMO DA CONTA---------------------------");
        System.out.println("Filme: " + sessao.getTitulo());
        System.out.println("Horário: " + sessao.getHorario());
        System.out.println("Sala: " + sessao.getSala());
        System.out.println("Qtd de ingressos: " + ingresso.getQtdIngresso());
        System.out.println("Forma de pagamento: " + pagamento.getForma());
        System.out.printf("Total pago: R$%.2f\n", valorFinal);

        try (
                FileWriter arquivo = new FileWriter("ingresso.txt");
                PrintWriter pw = new PrintWriter(arquivo)
        ) {
            Date dataCompra = new Date();
            String dataHoraCompra = FormatadorUtil.formatarData(dataCompra, "dd/MM/yyyy HH:mm:ss");

            Formatter formatter = new Formatter(pw);

            formatter.format(
                    "=============================================%n" +
                            "                %s%n" +
                            "       %s%n" +
                            "       CNPJ: %s%n" +
                            "---------------------------------------------%n" +
                            "Endereço: %s, %d - %s%n" +
                            "Cidade: %s - %s%n" +
                            "CEP: %s%n" +
                            "=============================================%n" +
                            "                 INGRESSO                   %n" +
                            "=============================================%n" +
                            "Filme: %s%n" +
                            "Horário da Sessão: %s%n" +
                            "Sala: %s%n" +
                            "Qtd ingressos: %d%n" +
                            "Forma de pagamento: %s%n" +
                            "Valor total: R$ %.2f%n" +
                            "Data da compra: %s%n" +
                            "---------------------------------------------%n" +
                            "Cliente: %s%n" +
                            "Email: %s%n" +
                            "CPF: %s%n" +
                            "=============================================%n",
                    // dados empresa
                    infoEmpresa.getNomeFantasia(),
                    infoEmpresa.getRazaoSocial(),
                    infoEmpresa.getCnpj(),
                    enderecoEmpresa.getRua(),
                    enderecoEmpresa.getNumero(),
                    enderecoEmpresa.getBairro(),
                    enderecoEmpresa.getCidade(),
                    enderecoEmpresa.getEstado(),
                    enderecoEmpresa.getCep(),
                    // dados ingresso
                    sessao.getTitulo(),
                    sessao.getHorario().toString(),
                    sessao.getSala(),
                    ingresso.getQtdIngresso(),
                    pagamento.getForma(),
                    valorFinal,
                    dataHoraCompra, // data/hora da compra
                    usuario.getNome(),
                    usuario.getEmail(),
                    usuario.getCpf()
            );

            formatter.flush();
            System.out.println("Ingresso gerado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao gerar arquivo: " + e.getMessage());
        }



    }

}
