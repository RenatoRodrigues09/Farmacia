/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.menu;

import farmacia.model.Funcionario;
import farmacia.model.Produto;
import farmacia.model.ProdutoVenda;
import farmacia.model.Venda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Pedro
 */
public class CommonMenu {

    Scanner sc = new Scanner(System.in);

    public void renderRegisterVenda() {

        System.out.println("**** CADASTRAR VENDA *****");
        System.out.println("\n Código da Venda: 0001");
        System.out.println("Data da Venda: 10/09/2018");

        boolean addMoreProducts = true;
        List<ProdutoVenda> produtos = new ArrayList<>();
        System.out.println("\n**** PRODUTOS ******");
        do {
            System.out.println("\nInserir novo produto: \nDIGITE O CÓDIGO:");
            int codProduto = sc.nextInt();

            Produto produto = new Produto("Produto " + codProduto, codProduto,
                    BigDecimal.valueOf(30.00), 20, "CONTROLADO");

            System.out.println("QUANTIDADE VENDIDA:");
            int quantidade = sc.nextInt();

            ProdutoVenda produtoVenda = new ProdutoVenda(quantidade, produto);
            produtos.add(produtoVenda);

            System.out.println("\nInserir novo produto: \nDIGITE 1 PARA SIM E 2 PARA NÃO:");
            int sair = sc.nextInt();
            if (sair == 2) {
                addMoreProducts = false;
            }
        } while (addMoreProducts);

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("* " + produtos.get(i) + " adicionado na venda.");
        }

        System.out.println("\n**** FUNCIONARIO ******");
        System.out.println("\nInserir vendedor: \nDIGITE O CÓDIGO:");
        int codFuncionario = sc.nextInt();
        
        System.out.println("\n**** CLIENTE ******");
        System.out.println("\nInserir cliente: \nDIGITE O CÓDIGO:");
        int codCliente = sc.nextInt();
        
        
        System.out.println("\n**** PAGAMENTO ******");
        System.out.println("\nInserir pagamento: \nDIGITE O CÓDIGO 1 - A vista / 2 - Prazo:");
        int codPagamento = sc.nextInt();

        Venda venda = new Venda("10/10/2018", codCliente, produtos, codPagamento, null, null);
        //ENVIAR VENDA PARA O BANCO DE DADOS, REMOVER NULL REFERENCE E PEGAR OS ITEMS ATRAVES DO BD.
        
        System.out.println("\n\n**** VENDA CADASTRADA COM SUCESSO ****");
       
        
    }

    public void renderRegisterCliente() {

    }

    public void renderEditCliente() {

    }

    public void renderConsultarProduto() {

    }

}
