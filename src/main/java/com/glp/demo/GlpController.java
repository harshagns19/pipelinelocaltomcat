package com.glp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlpController {
	
	@GetMapping("home")
	public String home() {
		return "home.jsp";
	}
}
