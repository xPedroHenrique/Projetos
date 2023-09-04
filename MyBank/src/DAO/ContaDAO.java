package DAO;

import Model.Conta;
import java.util.List;

public interface ContaDAO {
   public void insereConta(Conta conta);
   public Conta buscarContaDocumentoTitular(String documento);
   public void atualizaSaldo(Conta conta);
   List<String> obterHistoricoDeTransacoes(Conta conta);
}