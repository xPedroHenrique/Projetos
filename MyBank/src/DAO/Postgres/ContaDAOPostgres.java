package DAO.Postgres;

import DAO.ContaDAO;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.ContaSalario;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContaDAOPostgres implements ContaDAO {

    private final Connection conexao;

    public ContaDAOPostgres(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void insereConta(Conta conta) {
        String sql = "INSERT INTO conta (id, numero, saldo, tipo, pessoa_id) VALUES (?, ?, ?, CAST(? AS tipo_conta), ? )";
        String tipoConta = (conta instanceof ContaCorrente) ? "corrente"
                : (conta instanceof ContaSalario) ? "salario"
                        : "poupanca";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, conta.getId());
            stm.setInt(2, conta.getNumero());
            stm.setDouble(3, conta.getSaldo());
            stm.setString(4, tipoConta);
            stm.setObject(5, conta.getTitular().getId());

            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Conta buscarContaDocumentoTitular(String documento) {
        String sql = "SELECT c.id, c.numero, c.saldo, c.tipo, c.pessoa_id,"
                + " p.nome, p.tipo as pessoa_tipo FROM conta c JOIN  pessoa p on c.pessoa_id = p.id WHERE p.documento = ?";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setString(1, documento);

            ResultSet resultado = stm.executeQuery();
            if (resultado.next()) {
                UUID id = resultado.getObject("pessoa_id", UUID.class);
                String nome = resultado.getString("nome");
                String tipo = resultado.getString("pessoa_tipo");

                Pessoa pessoa = (tipo.equals("PF")) ? new PessoaFisica(id, nome, documento)
                        : new PessoaJuridica(id, nome, documento);

                UUID idConta = resultado.getObject("id", UUID.class);
                int numero = resultado.getInt("numero");
                double saldo = resultado.getDouble("saldo");
                String tipoConta = resultado.getString("tipo");

                switch (tipoConta) {
                    case "corrente":
                        return new ContaCorrente(idConta, numero, saldo, pessoa);
                    case "poupanca":
                        return new ContaPoupanca(idConta, numero, saldo, pessoa);
                    case "salario":
                        return new ContaSalario(idConta, numero, saldo, pessoa);
                    default:
                        return null;
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void atualizaSaldo(Conta conta) {
        String sql = "UPDATE conta SET saldo = ? WHERE id = ?";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setDouble(1, conta.getSaldo());
            stm.setObject(2, conta.getId());

            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<String> obterHistoricoDeTransacoes(Conta conta) {
      
       List<String> historico = new ArrayList<>();
       
       historico = conta.getHistoricoDeTransacoes();

       return historico;
   }
}
