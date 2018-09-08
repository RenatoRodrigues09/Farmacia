/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.model;

import java.util.List;

/**
 *
 * @author Otávio
 */
public class Venda {
    private String dataVenda;

	private int codVenda;

	private List<ProdutoVenda> produtos;

	private int quantproduto;

	private Funcionario funcionario;

	private Pagamento pagamento;

    public Venda(String dataVenda, int codVenda, List<ProdutoVenda> arrayProduto, int quantproduto, Funcionario funcionario, Pagamento pagamento) {
        this.dataVenda = dataVenda;
        this.codVenda = codVenda;
        this.produtos = arrayProduto;
        this.quantproduto = quantproduto;
        this.funcionario = funcionario;
        this.pagamento = pagamento;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public List<ProdutoVenda> getArrayProduto() {
        return produtos;
    }

    public int getQuantproduto() {
        return quantproduto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

  
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setArrayProduto(List<ProdutoVenda> arrayProduto) {
        this.produtos = arrayProduto;
    }

    public void setQuantproduto(int quantproduto) {
        this.quantproduto = quantproduto;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

	
}
