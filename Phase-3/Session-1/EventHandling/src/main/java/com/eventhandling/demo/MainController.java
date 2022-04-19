package com.eventhandling.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@Autowired
	ConfigurableApplicationContext appContext;
	
	@Autowired
	CustomEventpublisher cep;
	
	@GetMapping("/eventhandling")
	public String eventHandling(ModelMap map) {
		appContext.start();
		appContext.stop();
		
		return "success";
	}
	
	
	@GetMapping("/custom")
	public String customEvent(ModelMap map) {
		
		cep.publish();
		cep.publish();
		return "customevent";
	}
	 
}
