package Controller;

import DAO.Postgres.PessoaDAOPostgres;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Util.Gerenciador;

public class PessoaController {

    public Pessoa criarPessoa(String nome, String documento, String tipo) {
        Pessoa pessoa = null;
        if (tipo.equals("Pessoa Fisíca")) {
            pessoa = new PessoaFisica(nome, documento);
        } else {
            pessoa = new PessoaJuridica(nome, documento);
        }
        
        new PessoaDAOPostgres(Gerenciador.getConexao()).inserirPessoa(pessoa);
        return pessoa;
    }

}
