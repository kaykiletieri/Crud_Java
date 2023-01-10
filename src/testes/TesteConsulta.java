package testes;
import java.sql.SQLException;
import java.util.LinkedList;

import dao.Bebidasdao;
import modelo.Bebidas;

public class TesteConsulta {
	public static void main (String [] args) {
		Bebidasdao dao = new Bebidasdao ();
		
		try {
			LinkedList<Bebidas> lista = dao.consultar();
			
			for(Bebidas b : lista) {
				System.out.println(b.getId( ) + " + " + b.getNome());
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		};
	}
}
