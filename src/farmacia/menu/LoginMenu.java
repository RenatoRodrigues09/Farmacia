/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.menu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Pedro
 */
public class LoginMenu {

    public HashMap<String, String> login() {
        HashMap<String, String> logininformation = new HashMap<>();

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
        label.add(new JLabel("Login", SwingConstants.RIGHT));
        label.add(new JLabel("Password", SwingConstants.RIGHT));
        panel.add(label, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        JTextField username = new JTextField();
        controls.add(username);
        JPasswordField password = new JPasswordField();
        controls.add(password);
        panel.add(controls, BorderLayout.CENTER);

        JOptionPane.showMessageDialog(null, panel, "login", JOptionPane.OK_CANCEL_OPTION);

        logininformation.put("login", username.getText());
        logininformation.put("pass", new String(password.getPassword()));
        
        //REFERENCIA PARA O CONTROLLER FAZER O LOGIN COM ESSAS INFORMAÇÕES
        //POR MOTIVOS DE DIDATICA, NÃO VOU FAZER ISSO, VOU DEIXAR PARA AS PROXIMAS AULAS.
        return logininformation;
    }
}
