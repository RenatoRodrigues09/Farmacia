package farmacia.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Otávio
 */
public class Balconista extends Funcionario{

    public Balconista(int matriculaFucionario, String usuario, String senha, List<Venda> vendas, String nome, String cpf, String cnpj, String telefone, Date datanasc, String rg, Endereco endereco) {
        super(matriculaFucionario, usuario, senha, vendas, nome, cpf, cnpj, telefone, datanasc, rg, endereco);
    }

  
   

}
