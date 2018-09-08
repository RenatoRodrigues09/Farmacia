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
public class AdminMenu {

    Scanner sc = new Scanner(System.in);

    private String mainMenuOptions() {
        return ("MENU ADMINISTRADOR:"
                + "\n1- Cadastrar Funcionario"
                + "\n2- Editar Funcionario"
                + "\n3- Remover Funcionario"
                + "\n4- Cadastrar Produto"
                + "\n5- Editar Produto"
                + "\n6- Remover Produto"
                + "\n7- Cadastrar Cliente"
                + "\n8- Editar cliente"
                + "\n9- Remover Cliente"
                + "\n10-Consultar Produto "
                + "\n11-Realizar Venda"
                + "\n0- SAIR");
    }

    public void startMenuAdmin() {
        System.out.println(mainMenuOptions());
        int op = sc.nextInt();
        if (op < 0 && op > 11) {
            System.out.println("OPÇÃO INVÁLIDA");
            startMenuAdmin();
        } else {
            renderNextMenu(op);
        }

    }

    private void renderNextMenu(int op) {
        CommonMenu cMenu = new CommonMenu();
        switch (op) {
            case 1: { //CADASTRAR FUNCIONARIO
                System.out.println("Cadastrar Funcionario");
                break;
            }
            case 2: { //EDITAR FUNCIONARIO
                System.out.println("EDITAR FUNCIONARIO");
                break;
            }
            case 3: {
                System.out.println("REMOVER FUNCIONARIO");
                break;
            }
            case 4: {
                System.out.println("CADASTRAR PRODUTO");
                break;
            }
            case 5: {
                // Editar Produto"
                break;
            }
            case 6: {

                // Remover Produto"
                break;

            }
            case 7: {
                //Cadastrar Cliente"
                break;
            }
            case 8: {
                // Editar cliente"
                break;
            }
            case 9: {
                // Remover Cliente"
                break;
            }
            case 10: {
                // Consultar Produto "
                break;
            }
            case 11: {
                // Realizar Venda"
                cMenu.renderRegisterVenda();
                startMenuAdmin();
                break;
            }
            case 0: {
                int resposta
                        = JOptionPane.showConfirmDialog(null, "Deseja Mesmo Sair?");
                if (resposta == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    startMenuAdmin();
                }
            }
        }

    }
}
