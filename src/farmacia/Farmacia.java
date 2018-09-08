package farmacia;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class Farmacia {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        while (true) {
            String op = JOptionPane.showInputDialog("MENU PRINCIPAL:"
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
            int opmenu = Integer.parseInt(op);
            if (opmenu == 0) {
                break;
            }

            switch (opmenu) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
            }
        }

    }

}
