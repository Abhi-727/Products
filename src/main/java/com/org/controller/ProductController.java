package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.fornbind.Product;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProduct(Model model) {
		
		model.addAttribute("product", new Product()); 
		
		return "products";
	} 
	
	@PostMapping("/product")
	public String saveProduct(@Valid Product p,BindingResult result,Model model) {
		
		
		  System.out.println(p); 
		  if(result.hasErrors()) {
			  return "products";
		  }
		  else {
			  model.addAttribute("pro", "products saved successfully in Post Method");  
		  }
//		  model.addAttribute("product", p);
		  model.addAttribute("pro", "products saved successfully in Post Method");
		 
		
		return "products";
	}
}
