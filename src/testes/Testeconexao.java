package testes;
import java.sql.SQLException;

import dao.Conexao;

public class Testeconexao {
	public static void main(String[] agrs) {
		try {
			Conexao.getInstance();
			
			System.out.println("Deu certin conectou!");		
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
