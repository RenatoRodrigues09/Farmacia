/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.menu;

import java.util.Scanner;
import javax.swing.JOptionPane;
import utils.NumberUtils;

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

                break;
            }
            case 2: { //Realizar Venda
                cMenu.renderRegisterVenda();
                startMenu();
                break;
            }
            case 3: { //Consultar Produtos

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
}
