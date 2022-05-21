package br.edu.fatecfranca.api.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.api.model.Cerveja;

@RestController
public class CervejaController {

	// vamos criar um array (vetor) de cerveja
	ArrayList<Cerveja> vetor = new ArrayList<Cerveja>();
	
	// vamos usar o verbo GET para consultar o array
	@GetMapping("/cerveja/consulta")
	public ArrayList<Cerveja> consulta(){
		return vetor;
	}
	
	// vamos usar o verbo POST para inserir no array
	@PostMapping("/cerveja/insere")
	public String insere(@RequestBody Cerveja cerveja) {
		vetor.add(cerveja);
		return "Cerveja " + cerveja.getMarca() + " inserida com sucesso";
	}
	
	// vamos usar o verbo DELETE para remover do array
	@DeleteMapping("/cerveja/remove/{id}")
	public String remove(@PathVariable int id) {
		for(int i=0;i<vetor.size();i++) {
			if (vetor.get(i).getId() == id) {
				vetor.remove(i);
				return "Remoção com sucesso";
			}
		}
		return "Cerveja não encontrada";
	}
	
	
}
