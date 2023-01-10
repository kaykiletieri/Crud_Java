package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import com.mysql.jdbc.ResultSet;

import modelo.Bebidas;

public class Bebidasdao {
	public void cadastrar(Bebidas b) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO bebidas "
			+ "(nomebebida, valorbebida, qtdebebida)"
			+ "VALUES (?, ?, ?)";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		comandoSql.setString(1, b.getNome());
		comandoSql.setDouble(2, b.getValor());
		comandoSql.setInt(3, b.getQtde());
		
		comandoSql.execute();
		
		Conexao.getInstance().commit();
	}
	
	public void alterar(Bebidas b) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE bebidas SET nomebebida = ?, valorbebida = ?, qtdebebida = ? WHERE idbebida = ?";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		
		comandoSql.setString(1, b.getNome());
		comandoSql.setDouble(2, b.getValor());
		comandoSql.setInt(3, b.getQtde());
		comandoSql.setInt(4, b.getId());
		
		comandoSql.execute();
		
		Conexao.getInstance().commit();
	}
	
	public LinkedList<Bebidas> consultar() throws ClassNotFoundException, SQLException{
		LinkedList<Bebidas> lista = new LinkedList<Bebidas>();
		
		String sql = "SELECT + FROM Bebidas";
		
		PreparedStatement comandoSql = Conexao.getInstance().prepareStatement(sql);
		
		java.sql.ResultSet rs = comandoSql.executeQuery();
		
		while(rs.next()) {
			Bebidas b = new Bebidas();
			b.setId(rs.getInt("idbebida"));
			b.setNome(rs.getString("nomebebida"));
			b.setValor(rs.getDouble("valorbebida"));
			b.setQtde(rs.getInt("qtdebebida"));
			
			lista.add(b);
		}
		
		return lista;
	}
}
