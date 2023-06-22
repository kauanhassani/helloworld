package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

	@RestController
	@RequestMapping("/bsmgen")
	public class bsmGen {

		@GetMapping
		public String bsms() {
			return "- MENTALIDADES\r\n" + "\r\n" + "Responsabilidade pessoal\r\n" + "Mentalidade de crescimento\r\n"
					+ "Orientação ao futuro\r\n" + "Persistência\r\n" + "\r\n" + "- HABILIDADES\r\n" + "\r\n"
					+ "Comunicação\r\n" + "Orientação aos Detalhes\r\n" + "Trabalho em equipe\r\n" + "Proatividade";
		}

	}

	@RestController
	@RequestMapping("/objetivo")
	public class objetivoSemana {

		@GetMapping
		public String objetivo() {
			return "Meu maior objetivo é retomar o conteúdo que não peguei 100% pra focar totalmente nos atuais";
		}

	}
}
