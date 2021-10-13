package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.model.Torcedor;

//Gerenciar requisições HTTP (API Servlet)

@Controller
public class WelcomeController {
	
//	@RequestMapping(value="/welcome", method=RequestMethod.GET)
//	public String boasVindas() {
//		//Repasse de parâmetros para uma view
//			return "welcome";
//	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView outraforma() {
		//Repasse de parâmetros para uma view
		ModelAndView view = new ModelAndView("welcome");
		
		//1º parâmetro - string que representa o nome do objeto a ser enviado para a view
		view.addObject("texto", "consegui exibir um texto dentro de um parágrafo a partir de um controller");
		
			return view;
	}
	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public ModelAndView apresentaFormulario(Model model) {
		model.addAttribute("torcedor", new Torcedor());
			return new ModelAndView("formulario");
	}
	
	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public ModelAndView exibeMensagem(@RequestParam String nome,@RequestParam String time) {
		//Repasse de parâmetros para uma view
		ModelAndView view = new ModelAndView("formulario");
		
		//String texto=nome + " torce para o " + time;
		
		//1º parâmetro - string que representa o nome do objeto a ser enviado para a view
		view.addObject("mensagem", "acorda");
		
			return view;
	}
}
