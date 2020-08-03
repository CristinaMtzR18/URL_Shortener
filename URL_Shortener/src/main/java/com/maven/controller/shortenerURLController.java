package com.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maven.service.IshortenerURLService;

@Controller
public class shortenerURLController {
	@Autowired
	private IshortenerURLService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		service.listar();
		model.addAttribute("urls",service.listar());
		return "index";
	}
}
