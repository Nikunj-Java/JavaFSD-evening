package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@Autowired
	EProductDAO eproductDAO;

	// @GetMapping("/listProducts")
	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(ModelMap model) {
		List<EProductEntity> list = eproductDAO.getProducts();
		model.addAttribute("list", list);
		return "listProducts";
	}

	@PostMapping("/addProduct")
	public String addProduct(@RequestBody EProductEntity entity) {
		if(eproductDAO.addProduct(entity)>0)
			return "Data Inserted";
		else
			return "error while Inserting DATA";
	}

}