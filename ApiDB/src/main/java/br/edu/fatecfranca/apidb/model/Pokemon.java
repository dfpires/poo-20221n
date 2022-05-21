package br.edu.fatecfranca.apidb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// informe que a classe é uma entidade do BD
@Entity
// informe que a classe Pokemon é uma tabela chamada pokemon
@Table(name="pokemon")
public class Pokemon {
	// cria uma variável que é uma chave primária com
	// conteúdo gerado automaticamente com incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	@Column(name="tipo")
	private String tipo;
	@Column(name="poder")
	private String poder;
	@Column(name="nota")
	private String nota;
	
	public Pokemon() {
		
	}
	
	public Pokemon(Long id, String nome, String tipo, String poder, String nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.poder = poder;
		this.nota = nota;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", poder=" + poder + ", nota=" + nota + "]";
	}
	
	
	
}
