/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia.menu;

import farmacia.model.Cliente;
import farmacia.model.Endereco;
import farmacia.model.Pessoa;
import farmacia.model.Produto;
import farmacia.model.ProdutoVenda;
import farmacia.model.Venda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("**** VENDA CADASTRADA COM SUCESSO, DIRECIONE O CLIENTE AO CAIXA. ****\n\n");

    }

    public void renderRegisterCliente() {
        System.out.println("**** CADASTRAR CLIENTE *****");
        System.out.println("\n Código do CLIENTE: 0001");
        System.out.println("**** CAMPOS OBRIGATÓRIOS ******");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("CPF: ");
        String cpf = sc.nextLine();
        System.out.println("CNPJ: ");
        String cnpj = sc.nextLine();
        System.out.println("Telefone: ");
        String telefone = sc.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNasc = sc.nextLine();
        System.out.println("RG: ");
        String RG = sc.nextLine();
        System.out.println("Rua: ");
        String rua = sc.nextLine();
        System.out.println("CEP: ");
        String cep = sc.nextLine();
        System.out.println("Bairro: ");
        String bairro = sc.nextLine();
        System.out.println("Cidade: ");
        String cidade = sc.nextLine();
        System.out.println("Estado: ");
        String estado = sc.nextLine();
        
        Endereco endereco = new Endereco(rua, cep, bairro, cidade, estado);
        Cliente cliente = new Cliente(1, nome, cpf, cnpj, telefone, null, RG, endereco);
        System.out.println("\n\n\nCliente: " + cliente);
        System.out.println(" **** CLIENTE CADASTRADO COM SUCESSO... **** \n\n");
    }

    public void renderEditCliente() {

    }

    public void renderConsultarProduto() {
        System.out.println("**** CONSULTAR PRODUTO *****");
        System.out.println("\n****** DIGITE O CÓDIGO DO PRODUTO ******");

        int codProduto = sc.nextInt();

        Produto produto = new Produto("Produto " + codProduto, codProduto,
                BigDecimal.valueOf(30.00), 20, "CONTROLADO");

        System.out.println("\n" + produto);
        System.out.println("\n***************************\n");

    }

}
