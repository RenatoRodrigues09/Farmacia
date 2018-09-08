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
public class Estoque {
    private Produto [ ] listaProdutos;

    public Estoque(Produto[] listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto[] getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(Produto[] listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}
