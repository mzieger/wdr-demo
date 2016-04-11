package de.wdr.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/")
	@ResponseBody
	public String home(@RequestParam String name) {
		return "Hello World! How are you today " + name + "at WDR ";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
