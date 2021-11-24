package com.hoseungshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	@RequestMapping("/")
	public String home() {
		return "/index";
	}
	
	@RequestMapping("/shop")
	public String shop() {
		return "/shop";
	}
	
	@RequestMapping("/productDetails")
	public String productDetails() {
		return "/product-details";
	}
	
	@RequestMapping("/shopCart")
	public String shopCart() {
		return "/shop-cart";
	}
	
	@RequestMapping("/checkout")
	public String checkout() {
		return "/checkout";
	}
	
	@RequestMapping("/blogDetails")
	public String blogDetails() {
		return "/blog-details";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		return "/blog";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "/contact";
	}
	
	
	
}
