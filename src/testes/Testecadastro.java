package testes;
import java.sql.SQLException;

import dao.Bebidasdao;
import modelo.Bebidas;

public class Testecadastro {
	
	public static void main(String[] args) {
		Bebidas b = new Bebidas();
		b.setNome("Coca_Cola");
		b.setQtde(370);
		b.setValor(3.50);
		
		Bebidasdao dao = new Bebidasdao();
		
		try {
			dao.cadastrar(b);
			
			System.out.println("Deu certin o cadastro, parabéns!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
