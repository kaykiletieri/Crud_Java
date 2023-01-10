package testes;
import java.sql.SQLException;

import dao.Bebidasdao;
import modelo.Bebidas;

public class Testealteracao {
	
	public static void main(String[] args) {
		Bebidas b = new Bebidas();
		b.setNome("Coca_ColaZero");
		b.setQtde(369);
		b.setValor(3.30);
		
		Bebidasdao dao = new Bebidasdao();
		try {
			dao.alterar(b);
			
			System.out.println("Alterou certin!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
