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
public class Funcionario extends Pessoa {
    
	private int matriculaFucionario;
	private String usuario;
	private String senha;
	private List<Venda> vendasRealizadas;

    public Funcionario(int matriculaFucionario, String usuario, String senha, List<Venda> vendas, String nome, String cpf, String cnpj, String telefone, Date datanasc, String rg, Endereco endereco) {
        super(nome, cpf, cnpj, telefone, datanasc, rg, endereco);
        this.matriculaFucionario = matriculaFucionario;
        this.usuario = usuario;
        this.senha = senha;
        this.vendasRealizadas = vendas;
    }

    public int getMatriculaFucionario() {
        return matriculaFucionario;
    }

    public void setMatriculaFucionario(int matriculaFucionario) {
        this.matriculaFucionario = matriculaFucionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Venda> getVendas() {
        return vendasRealizadas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendasRealizadas = vendas;
    }

    
}
