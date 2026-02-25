import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDB {
    // Caminho para o arquivo na raiz do projeto
    private static final String URL_JDBC_PADRAO = "jdbc:sqlite:meu_banco_de_dados.db";

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL_JDBC_PADRAO);

            // Garante que a estrutura da tabela seja compatível com o ProdutoDAO
            criarTabelaSeNaoExistir(conn);

            return conn;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    private static void criarTabelaSeNaoExistir(Connection conn) {
        // CORREÇÃO: Nomes das colunas alterados para id_produto e nome_produto
        // Adicionado também as colunas quantidade e status que seu DAO utiliza
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "id_produto INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome_produto TEXT NOT NULL, " +
                "quantidade INTEGER, " +
                "preco REAL NOT NULL, " +
                "status TEXT" +
                ");";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.err.println("Erro ao verificar/criar tabela: " + e.getMessage());
        }
    }

    public static Connection conectarGenerico(String url, String usuario, String senha) {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
}