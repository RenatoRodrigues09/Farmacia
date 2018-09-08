/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Otávio
 */
public class Caixa extends Funcionario{

    public Caixa(int matriculaFucionario, String usuario, String senha, List<Venda> vendas, String nome, String cpf, String cnpj, String telefone, Date datanasc, String rg, Endereco endereco) {
        super(matriculaFucionario, usuario, senha, vendas, nome, cpf, cnpj, telefone, datanasc, rg, endereco);
    }

   
  
}
