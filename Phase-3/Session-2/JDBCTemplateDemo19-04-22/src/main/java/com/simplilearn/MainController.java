package com.simplilearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@Autowired
	EProductDao eProductDao;
	

	@RequestMapping(value="/listProducts",method= RequestMethod.GET)
	public String  listproducts(ModelMap model) {
		
		List<ProductEntity> list= eProductDao.getProducts();
		model.addAttribute("list",list);
		return "listProducts";
		
		
	}

}
