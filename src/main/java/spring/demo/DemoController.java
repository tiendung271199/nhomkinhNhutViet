package spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("demo")
	public String demo() {
		return "views/demo";
	}
	
}
