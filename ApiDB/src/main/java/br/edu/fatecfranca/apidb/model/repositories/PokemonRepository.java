package br.edu.fatecfranca.apidb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.apidb.model.Pokemon;

// a classe interface vai herdar de outra classe interface
// Pokemon é o tipo da tabela, e Long é o tipo da chave
public interface PokemonRepository extends 
JpaRepository<Pokemon, Long>{
	// esta interface vai herdar os métodos de CRUD
	// C - create - insert
	// R - retrieve - select
	// U - update - update
	// D - delete - delete
}
