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
public class Pessoa {
    	private String nome;

	private String cpf;

	private String cnpj;

	private String telefone;

	private Date dataNascimento;

	private String rg;

	private Endereco endereco;

    public Pessoa(String nome, String cpf, String cnpj, String telefone, Date datanasc, String rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.dataNascimento = datanasc;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatanasc() {
        return dataNascimento;
    }

    public void setDatanasc(Date datanasc) {
        this.dataNascimento = datanasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   
}
