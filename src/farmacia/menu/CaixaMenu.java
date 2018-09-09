/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.menu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class CaixaMenu {

    Scanner sc = new Scanner(System.in);

    private String mainMenuOptions() {
        return ("MENU CAIXA:"
                + "\n1- Finalizar Venda"
                + "\n2- Realizar Vendas"
                + "\n3- Consultar Produtos"
                + "\n0- SAIR");
    }

    public void startMenu() {
        System.out.println(mainMenuOptions());
        int op = sc.nextInt();
        if (op < 0 && op > 3) {
            System.out.println("OPÇÃO INVÁLIDA");
            startMenu();
        } else {
            renderNextMenu(op);
        }

    }

    private void renderNextMenu(int op) {
        CommonMenu cMenu = new CommonMenu();
        switch (op) {
            case 1: { //Finalizar Venda
                renderFinalizarVenda();
                startMenu();
                break;
            }
            case 2: { //Realizar Venda
                cMenu.renderRegisterVenda();
                startMenu();
                break;
            }
            case 3: { //Consultar Produtos
                cMenu.renderConsultarProduto();
                startMenu();
                break;
            }
            case 0: {
                int resposta
                        = JOptionPane.showConfirmDialog(null, "Deseja Mesmo Sair?");
                if (resposta == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    startMenu();
                }
            }
        }
    }

    private void renderFinalizarVenda() {
        System.out.println("**** FINALIZAR VENDA *****");
        System.out.println("\n****** DIGITE O CÓDIGO DA VENDA ******");

        sc.nextInt();

        System.out.println("\n****** VENDA LOCALIZADA COM SUCESSO. ******\n");
        System.out.println("Valor a ser pago pela venda: R$" + 35.80);
        System.out.println("Digite o código da forma de pagamento: \n1- À Vista \n2- À Prazo");

        int codPagamento = sc.nextInt();

        if (codPagamento > 2) {
            System.out.println("\nCódigo de pagamento inválido.\n\n");
            renderFinalizarVenda();
        }

        if (codPagamento == 1) {
            System.out.println("****** PAGAMENTO À VISTA ********");
            System.out.println("\nQual o valor que o cliente pagou?");
            double valorPago = sc.nextDouble();

            while (valorPago < 35.80) {
                System.out.println("Valor insuficiente, digite outro valor.");
                valorPago = sc.nextDouble();
            }

            System.out.println("\nQual a porcentagem de desconto?");
            int porcentagemDesconto = sc.nextInt();

            if (porcentagemDesconto > 20) {
                System.out.println("\nPorcentagem de desconto muito alta. Digite as credenciais do administrador para continuar.");
                System.out.println("Login: ");
                sc.next();
                System.out.println("\nPassword:");
                sc.next();
            }

            System.out.println("O troco para o cliente é de: ");
            double valorTotalVenda = 35.80;
            if (porcentagemDesconto > 0) {
                valorTotalVenda = valorTotalVenda - ((valorTotalVenda * porcentagemDesconto) / 100);
            }
            double valorTroco = valorPago - valorTotalVenda;

            System.out.println("R$" + valorTroco);

        } else if (codPagamento == 2) {
            System.out.println("****** PAGAMENTO À PRAZO ********");
            System.out.println("\nQual a bandeira do cartão? \n1- Visa\n2- Master\n3-Hiper\n4-ELO");
            int bandeiraCartao = sc.nextInt();

            while (bandeiraCartao > 4) {
                System.out.println("Bandeira Inválida, Digite novamente.");
                bandeiraCartao = sc.nextInt();
            }
            
            System.out.println("\nDigite o número do cartão:");
            String numCartao = sc.next();
            
            System.out.println("Digite a quantidade de parcelas:");
            int parcelas = sc.nextInt();
            
            System.out.println("******PROCESSANDO*******\n\n");
            System.out.println("PAGAMENTO APROVADO...\n\n");
        }
    }
}
