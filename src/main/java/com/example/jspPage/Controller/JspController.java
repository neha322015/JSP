package com.example.jspPage.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class JspController {
	//http://localhost:5050
	@GetMapping("/Home")
	public String HomePage() {
		return "home";
	}

}
