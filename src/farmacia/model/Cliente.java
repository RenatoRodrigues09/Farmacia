/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.model;

import java.util.Date;

/**
 *
 * @author Otávio
 */
public class Cliente extends Pessoa {

    private int codClient;

    public Cliente(int codClient, String nome, String cpf, String cnpj, String telefone, Date datanasc, String rg, Endereco endereco) {
        super(nome, cpf, cnpj, telefone, datanasc, rg, endereco);
        this.codClient = codClient;
    }

    public int getCodClient() {
        return codClient;
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

   

}
