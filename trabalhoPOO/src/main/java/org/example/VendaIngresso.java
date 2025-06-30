package org.example;
import java.util.Scanner;


public class VendaIngresso {

    public void ingresso(Sessao sessao, Pagamento pagamento, Ingresso ingresso){
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
            resumoCom(sessao,ingresso,pagamento, valorFinal);
            break;

        } while(op1 != 0);
    }

    public void resumoCom(Sessao sessao, Ingresso ingresso, Pagamento pagamento, double valorFinal){
        System.out.println("\n------------------------------RESUMO DA CONTA---------------------------");
        System.out.println("Filme: " + sessao.getTitulo());
        System.out.println("Horário: " + sessao.getHorario());
        System.out.println("Sala: " + sessao.getSala());
        System.out.println("Qtd de ingressos: " + ingresso.getQtdIngresso());
        System.out.println("Forma de pagamento: " + pagamento.getForma());
        System.out.printf("Total pago: R$%.2f\n", valorFinal);
    }

}
