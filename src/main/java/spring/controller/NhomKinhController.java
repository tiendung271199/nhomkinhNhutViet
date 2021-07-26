package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import spring.constant.URLConstant;
import spring.constant.ViewNameConstant;

@Controller
public class NhomKinhController {

	@GetMapping(URLConstant.URL_INDEX)
	public String index() {
		return ViewNameConstant.INDEX;
	}

	@GetMapping(URLConstant.URL_ABOUT)
	public String about() {
		return ViewNameConstant.ABOUT;
	}

}
