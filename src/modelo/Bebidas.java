package modelo;


public class Bebidas {

	private int id;
	private String nome;
	private int qtde;
	private double valor;
	
@Override
public String toString() {
	return nome;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}


public int getQtde() {
	return qtde;
}

public void setQtde(int qtde) {
	this.qtde = qtde;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}
	
}
