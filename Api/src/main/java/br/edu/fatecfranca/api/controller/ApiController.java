package br.edu.fatecfranca.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// vamos informar que esta classe é responsável por responder requisições Rest
@RestController
public class ApiController {
	
	// criar serviços baseados no verbo GET
	// bomdia é o nome da rota
	@GetMapping("/bomdia")
	public String bomDia() {
		return "Bom dia";
	}
	
	// boatarde é o nome da rota
	@GetMapping("/boatarde")
	public String boaTarde() {
		return "Boa tarde";
	}
	// boanoite é o nome da rota
	@GetMapping("/boanoite/{nome}")
	public String boaNoite(@PathVariable String nome) {
		return "Boa noite " + nome;
	}
}
