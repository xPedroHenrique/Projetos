package Util;

//import Main.MyBank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Gerenciador {

    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                String URL = "jdbc:postgresql://localhost:5432/banco";
                String user = "postgres";
                String password = "ph2910";
                // String URL = MyBank.dotenv.get("URL");
                //String user = MyBank.dotenv.get("user");
                //String password = MyBank.dotenv.get("password");
                conexao = DriverManager.getConnection(URL, user, password);
                System.out.println("SUCESSO!!");
            } catch (SQLException e) {
                System.out.println("ACESSO NEGADO");
                e.printStackTrace();
            }
        }
        return conexao;
    }

}
