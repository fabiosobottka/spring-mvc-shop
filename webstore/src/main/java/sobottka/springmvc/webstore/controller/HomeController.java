package sobottka.springmvc.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("welcome", "Hello Spring Web MVC");
		
		return modelAndView;
	}
	
	/*
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="welcome", required=false) String welcome) {
		
		if(welcome == null) {
			welcome = "Hello there";
		}
		
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("welcome", welcome);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/test/{welcome}")
	public ModelAndView test(@PathVariable("welcome") String welcome) {
		
		if(welcome == null) {
			welcome = "Hello there";
		}
		
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("welcome", welcome);
		return modelAndView;
	}
	
	*/

}
