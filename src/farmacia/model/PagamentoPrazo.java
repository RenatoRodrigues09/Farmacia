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
public class PagamentoPrazo {
    private String bandeiraCartao;

	private String numeroCartao;

	private int numeroParcelas;

	private Pagamento pagamento;

    public PagamentoPrazo(String bandeiraCartao, String numeroCartao, int numeroParcelas, Pagamento pagamento) {
        this.bandeiraCartao = bandeiraCartao;
        this.numeroCartao = numeroCartao;
        this.numeroParcelas = numeroParcelas;
        this.pagamento = pagamento;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

	
}
