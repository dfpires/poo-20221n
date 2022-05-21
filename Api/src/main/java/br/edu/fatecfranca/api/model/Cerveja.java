package br.edu.fatecfranca.api.model;

public class Cerveja {
	private int id;
	private String marca, tipo;
	private float preco;
	
	public Cerveja() {
		
	}

	public Cerveja(int id, String marca, String tipo, float preco) {
		super();
		this.id = id;
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Cerveja [id=" + id + ", marca=" + 
	marca + ", tipo=" + tipo + ", preco=" + preco + "]";
	}
	
	
}
