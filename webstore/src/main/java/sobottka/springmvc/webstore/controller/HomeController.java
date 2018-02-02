package sobottka.springmvc.webstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import sobottka.springmvc.webstorebackend.bo.CategoryBO;
import sobottka.springmvc.webstorebackend.dto.Category;


@Controller
public class HomeController {
	
	@Autowired
	private CategoryBO categoryBO;
	
	private List<Category> categories;
	
	@GetMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Homepage");
		
		try {
			categories = categoryBO.listar();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO redirect
		}
		
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("clickHome", true);
		return modelAndView;
	}
	
	@GetMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About us");
		Category category = new Category();
		category.setName("Television");
		category.setDescription("This is a description for television!");
		category.setImageURL("CAT_1.png");
		try {
			categoryBO.cadastrar(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		
		try {
			categories = categoryBO.listar();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO redirect
		}
		
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("clickAllProducts", true);
		return modelAndView;
	}
	
	@GetMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView modelAndView = new ModelAndView("page");
		
		Category category = null;
		try {
			category = categoryBO.pesquisar(id);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			categories = categoryBO.listar();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO redirect
		}
		
		modelAndView.addObject("title", category.getName());
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("category", category);
		
		modelAndView.addObject("clickCategoryProducts", true);
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
