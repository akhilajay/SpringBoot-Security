/**
 * 
 */
package com.akhil.jwtsercuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akhilajay
 *
 */
@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Hello from home";
	}
}
