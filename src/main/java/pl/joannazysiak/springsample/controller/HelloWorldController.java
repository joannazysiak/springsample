package pl.joannazysiak.springsample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Value("${app.name}")
	private String appName;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World - " + appName;
	}

}
