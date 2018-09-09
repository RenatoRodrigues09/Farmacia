package farmacia;

import farmacia.menu.AdminMenu;
import farmacia.menu.BalconistaMenu;
import farmacia.menu.CaixaMenu;
import farmacia.menu.LoginMenu;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class Farmacia {

    public static void main(String[] args) {
        LoginMenu loginMenu = new LoginMenu();
        HashMap<String, String> authCredentials = loginMenu.login();
        if(authCredentials.get("login").equals("admin") 
                && authCredentials.get("pass").equals("admin")){
            
            AdminMenu adminMenu = new AdminMenu();
            adminMenu.startMenu();
            
        } else
        if(authCredentials.get("login").equals("balconista") && 
                authCredentials.get("pass").equals("balconista")){
            
            BalconistaMenu balconistaMenu = new BalconistaMenu();
            balconistaMenu.startMenu();
            
        } else
        if(authCredentials.get("login").equals("caixa") &&
                authCredentials.get("pass").equals("caixa")){
            
            CaixaMenu caixaMenu = new CaixaMenu();
            caixaMenu.startMenu();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Credenciais Inválidas.");
            
        }
        
    }
}
