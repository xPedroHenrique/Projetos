package Main;

import Model.Conta;
import Util.Gerenciador;
import View.Sistema;
//import io.github.cdimascio.dotenv.Dotenv;
//import Banco.Pessoa;
import java.util.ArrayList;

public class MyBank {

    // DB FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    //public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        new Sistema().setVisible(true);
        
        //System.out.println(dotenv.get("URL"));
        //System.out.println(dotenv.get("user"));
        //System.out.println(dotenv.get("password"));
        Gerenciador.getConexao();

        /*Pessoa pessoa1 = new Pessoa("Pedro", "999.999.999-99");
        Pessoa pessoa2 = new Pessoa("Henrique", "111.111.111-11");
        Pessoa pessoa3 = new Pessoa("PH", "222.222.222-22");

        banco.add(new Conta(pessoa1));
        banco.add(new Conta(pessoa2));
        banco.add(new Conta(pessoa3));

        banco.get(0).depositar(1000.0);

        for (Conta conta : banco) {
            conta.depositar(100.0);
            //System.out.println(conta.getNumero() + " - " + conta.getTitular().getNome());
        }

        banco.get(0).sacar(500.0);
        banco.get(1).sacar(80.0);

        banco.get(0).transferir(banco.get(2), 100.00);*/
    }

}
