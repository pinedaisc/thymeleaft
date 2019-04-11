package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPrincipal {

	@GetMapping("/hola")
	public String slash() {
		return "index"; 
	}
	
	@GetMapping("/tablas")
	public String tablas() {
		return "tablas"; 
	}
	
	@RequestMapping(path = "/teoria", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView controlador(HttpServletRequest request) {
		ModelAndView vista = new ModelAndView("teoria");
		vista.addObject("pi","3.1416");
		return vista;
	}
	
}
