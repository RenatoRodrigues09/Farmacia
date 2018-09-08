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
public class Venda {
    private String dataVenda;

	private int codVenda;

	private Produto [ ] arrayProduto;

	private int quantproduto;

	private Funcionario funcionario;

	private Cliente cliente;

	private Pagamento pagamento;

    public Venda(String dataVenda, int codVenda, Produto[] arrayProduto, int quantproduto, Funcionario funcionario, Cliente cliente, Pagamento pagamento) {
        this.dataVenda = dataVenda;
        this.codVenda = codVenda;
        this.arrayProduto = arrayProduto;
        this.quantproduto = quantproduto;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public Produto[] getArrayProduto() {
        return arrayProduto;
    }

    public int getQuantproduto() {
        return quantproduto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
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

    public void setArrayProduto(Produto[] arrayProduto) {
        this.arrayProduto = arrayProduto;
    }

    public void setQuantproduto(int quantproduto) {
        this.quantproduto = quantproduto;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

	
}
