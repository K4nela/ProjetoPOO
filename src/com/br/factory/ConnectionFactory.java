package src.com.br.factory;

//import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    //nome do usuário do my sql
    private static final String USERNAME = "root";

    //senha do banco de dados
    private static final String PASSWORD = "<Kanelinha123>";

    //caminho do banco de dados, porta, nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    /*
    conexão com o banco de dados
     */

    public static Connection createConnectionToMySQL() throws Exception {
        //faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");

        //cria conexão com banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {
        //recuperar uma conexão com o banco de dados
        Connection con = createConnectionToMySQL();

        //Testar se a conexão e null
        if(con != null){
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }
    }
}
