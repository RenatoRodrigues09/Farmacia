/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.model;

/**
 *
 * @author Otávio
 */
public class Farmacia {
    
    private String nome;

    private Funcionario[] listaFuncionarios;

    private Cliente[] listaCliente;

    private Estoque estoque;

    public Farmacia(String nome, Funcionario[] listaFuncionarios, Cliente[] listaCliente, Estoque estoque) {
        this.nome = nome;
        this.listaFuncionarios = listaFuncionarios;
        this.listaCliente = listaCliente;
        this.estoque = estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaFuncionarios(Funcionario[] listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void setListaCliente(Cliente[] listaCliente) {
        this.listaCliente = listaCliente;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getListaFuncionarios() {
        return listaFuncionarios;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public Estoque getEstoque() {
        return estoque;
    }

}
