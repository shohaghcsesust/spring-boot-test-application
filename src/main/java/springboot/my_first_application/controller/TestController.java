package springboot.my_first_application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {
	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
}