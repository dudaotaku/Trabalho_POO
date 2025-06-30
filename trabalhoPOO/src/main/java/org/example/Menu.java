package org.example;

import java.util.Scanner;

public class Menu {

    public void menu(){
        Scanner s = new Scanner(System.in);
        int op;
        SessoesService sessoesService = new SessoesService();
        MenuFilme menuFilme = new MenuFilme();
        ExibirContaUsuario exibir = new ExibirContaUsuario();
        CadastrarUsuario cadastro = new CadastrarUsuario();
        AtualizacaoCadastro atualizar = new AtualizacaoCadastro();
        Scanner scanner= new Scanner(System.in);
        Ingresso ingresso = new Ingresso();
        Pagamento pagamento = new Pagamento();
        Usuario usuario = null;
        Sessao sessao = new Sessao();
        double valorFinal = 0.0;
        String op1;
        do{
            System.out.println("----------------------------------MENU------------------------------");
            System.out.println("(1) - Filme em exibição");
            System.out.println("(2) - Cadastrar Usuario");
            System.out.println("(3) - Atualizar cadastro");
            System.out.println("(4) - Conta do usuario");
            System.out.println("(0) - Sair");
            op = s.nextInt();
            s.nextLine();

            switch (op){
                case 1:
                    if(usuario == null){
                        System.out.println("É necessario primeiro se cadastrar\n deseja ir para o cadastramento?  s/n ");
                        op1 = s.nextLine();
                        if (op1.equalsIgnoreCase("s")){
                            usuario = cadastro.cadastroUsuario();
                            System.out.println("Cadastro realizado com sucesso!");
                        }else{
                            break;
                        }
                    }else{J
                        menuFilme.exibirMenuFilmes(s, sessoesService);
                    }
                    break;
                case 2:
                    usuario = cadastro.cadastroUsuario();
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 3:
                    if (usuario == null) {
                        System.out.println("Nenhum usuário cadastrado ainda.");
                    } else {
                        atualizar.atualizarCadastro(usuario,scanner);
                    }
                    break;
                case 4:
                    if (usuario == null) {
                        System.out.println("Nenhum usuário cadastrado ainda.");
                    } else {
                        exibir.exibirConta(usuario, sessao, ingresso, pagamento, valorFinal);
                    }
                    break;
                case 0:
                    System.out.println("Até logo ...");
                break;
                default:
                    System.out.println("Opção inválida!!");

            }

        }while( op != 0);

        s.close();
    }

}
