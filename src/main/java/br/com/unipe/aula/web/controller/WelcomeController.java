package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Gerenciar requisições HTTP (API Servlet)

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String boasVindas() {
		//Repasse de parâmetros para uma view
			return "welcome";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String outraforma() {
		//Repasse de parâmetros para uma view
		ModelAndView view = new ModelAndView("welcome");
		
		//1º parâmetro - string que representa o nome do objeto a ser enviado para a view
		view.addObject("texto", "consegui exibir um texto dentro de um parágrafo a partir de um controller");
		
			return "view";
	}

}
