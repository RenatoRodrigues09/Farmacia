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
public class BalconistaMenu {

    Scanner sc = new Scanner(System.in);

    private String mainMenuOptions() {
        return ("MENU CAIXA:"
                + "\n1- Cadastrar Cliente"
                + "\n2- Editar Cliente"
                + "\n3- Realizar Vendas"
                + "\n4- Consultar Produtos"
                + "\n0- SAIR");
    }

    public void startMenu() {
        System.out.println(mainMenuOptions());
        int op = sc.nextInt();
        if (op < 0 && op > 4) {
            System.out.println("OPÇÃO INVÁLIDA");
            startMenu();
        } else {
            renderNextMenu(op);
        }

    }

    private void renderNextMenu(int op) {
        CommonMenu cMenu = new CommonMenu();
        switch (op) {
            case 1: { //CADASTRAR CLIENTE

                break;
            }
            case 2: { //EDITAR CLIENTE

                break;
            }
            case 3: { // REALIZAR VENDA
                cMenu.renderRegisterVenda();
                startMenu();
                break;
            }
            case 4: {  // Consultar Produto "

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
