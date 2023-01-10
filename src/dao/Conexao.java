package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao;
	private String banco = "bd_distribuidora";
	private String login = "root";
	private String senha = "";
	
	public Conexao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.banco, this.login, this.senha);
		
		conexao.setAutoCommit(false);
	}
	
	public static Connection getInstance() throws ClassNotFoundException, SQLException {
		if (conexao == null)
			new Conexao();
		
		return conexao;
	}
}