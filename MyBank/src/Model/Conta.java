package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Conta {

    public Conta(Pessoa titular) {
        this.id = UUID.randomUUID();
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumero();
    }

    public Conta(UUID id, int numero, double saldo, Pessoa titular) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    private UUID id;
    private int numero;
    private Pessoa titular;
    double saldo;

    public int getNumero() {
        return numero;
    }

    public UUID getId() {
        return id;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.printf(this.titular.getNome() + " - Saldo após saque: R$%.2f \n", this.saldo);

    }

    public void transferir(Conta destinatario, double valor) {
        this.saldo -= valor;
        destinatario.saldo += valor;
        System.out.printf(this.titular.getNome() + " - Saldo após transferência: R$%.2f \n", this.saldo);
        System.out.printf(destinatario.titular.getNome() + " - Saldo após transferência: R$%.2f \n", destinatario.getSaldo());
    }

    private int gerarNumero() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;

    }

    private List<String> historicoDeTransacoes = new ArrayList<>();

    public List<String> getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    private void registrarTransacao(String transacao) {
        historicoDeTransacoes.add(transacao);
    }

    public String obterExtrato() {
        String extrato = "Extrato Bancário\n";
        extrato += "N° Conta: " + numero + "\n";
        extrato += "Titular: " + titular.getNome() + "\n";
        extrato += "Saldo: R$" + saldo + "\n";
        extrato += "Histórico de Transações:\n";

        for (String transacao : historicoDeTransacoes) {
            extrato += transacao + "\n";
        }

        return extrato;
    }

    public String obterExtratoDoCliente(Conta conta) {
        return conta.obterExtrato();
    }
}
