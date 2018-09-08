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
public class PagamentoVista {
    private int desconto;
    private BigDecimal troco;

    public PagamentoVista(int desconto, BigDecimal troco) {
        this.desconto = desconto;
        this.troco = troco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }
    
    
    
}
