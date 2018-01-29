package sobottka.springmvc.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sobottka.springmvc.webstorebackend.bo.CategoryBO;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryBO categoryBO;
	
	@GetMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Homepage");
		modelAndView.addObject("categories", categoryBO.listar());
		modelAndView.addObject("clickHome", true);
		return modelAndView;
	}
	
	@GetMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About us");
		modelAndView.addObject("clickAbout", true);
		return modelAndView;
	}
	
	@GetMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Contact");
		modelAndView.addObject("clickContact", true);
		return modelAndView;
	}
	
	@GetMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "All products");
		modelAndView.addObject("clickAllProducts", true);
		return modelAndView;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("page");
		
		modelAndView.addObject("title", "All products");
		modelAndView.addObject("clickAllProducts", true);
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
