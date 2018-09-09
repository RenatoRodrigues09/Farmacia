/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.model;

import java.math.BigDecimal;

/**
 *
 * @author Otávio
 */
public class Produto {
    
	private String descricaoProduto;

	private int codProduto;

	private BigDecimal preco;

	private int quantEstoque;

	private String tipoMed;

    public Produto(String descricaoProduto, int codProduto, BigDecimal preco, int quantEstoque, String tipoMed) {
        this.descricaoProduto = descricaoProduto;
        this.codProduto = codProduto;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
        this.tipoMed = tipoMed;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public String getTipoMed() {
        return tipoMed;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    @Override
    public String toString() {
        return "Produto = " + "descricaoProduto=" + descricaoProduto + ", codProduto=" + codProduto + ", preco=" + preco + ", quantEstoque=" + quantEstoque + ", tipoMed=" + tipoMed;
    }

	
}
