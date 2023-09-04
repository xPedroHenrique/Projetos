package Controller;

import DAO.Postgres.ContaDAOPostgres;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.ContaSalario;
import Model.Pessoa;
import Main.MyBank;
import Util.Gerenciador;
import java.util.List;
import javax.swing.JOptionPane;

public class ContaController {

    public Conta criaConta(Pessoa pessoa, boolean corrente, boolean poupanca, boolean salario) {
        Conta conta = corrente ? new ContaCorrente(pessoa) : poupanca ? new ContaPoupanca(pessoa) : new ContaSalario(pessoa);
        new ContaDAOPostgres(Gerenciador.getConexao()).insereConta(conta);
        return conta;
    }

    public Conta buscarContaDocumento(String documento) {
        return new ContaDAOPostgres(Gerenciador.getConexao()).buscarContaDocumentoTitular(documento);
    }

    public Conta depositar(Conta conta, double valor) {
        if (valor > 0) {
            conta.depositar(valor);
            new ContaDAOPostgres(Gerenciador.getConexao()).atualizaSaldo(conta);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
        }
        return conta;
    }

    public Conta sacar(Conta conta, double valor) {
        if (valor <= conta.getSaldo() && valor > 0) {
            conta.sacar(valor);
            new ContaDAOPostgres(Gerenciador.getConexao()).atualizaSaldo(conta);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido ou saldo insuficiente!");
        }
        return conta;
    }

    public Conta transferir(Conta conta, Conta destinatario, double valor) {
        if (conta.getSaldo() >= valor && valor > 0) {
            conta.transferir(destinatario, valor);
            new ContaDAOPostgres(Gerenciador.getConexao()).atualizaSaldo(conta);
            new ContaDAOPostgres(Gerenciador.getConexao()).atualizaSaldo(destinatario);
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor Inválido ou saldo insuficiente!");
        }

        return conta;
    }

    public String obterExtratoDoCliente(Conta conta) {
        String extrato = "Extrato Bancário\n";
        extrato += "N° Conta: " + conta.getNumero() + "\n";
        extrato += "Titular: " + conta.getTitular().getNome() + "\n";
        extrato += "Saldo: R$" + conta.getSaldo() + "\n";
        extrato += "Histórico de Transações:\n";

        // Suponha que sua classe Conta tenha um método para obter o histórico de transações.
        List<String> historico = conta.getHistoricoDeTransacoes();

        for (String transacao : historico) {
            extrato += transacao + "\n";
        }

        return extrato;
    }

}
