package com.in28minutes.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.service.WelcomeService;
import com.in28minutes.springboot.configuration.BasicConfiguration;

@RestController
public class WelcomeController {
	@Autowired
	private WelcomeService welcomeService;
	
	@Autowired
	private BasicConfiguration basicConfiguration;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeService.retrieveWelcomeMessage(); 
	}
	
	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration() {
		Map map = new HashMap<>();
		
		map.put("value", basicConfiguration.isValue());
		map.put("number", basicConfiguration.getNumber());
		map.put("message", basicConfiguration.getMessage());
		
		return map; 
	}

}

