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

	@GetMapping(URLConstant.URL_NEWS)
	public String news() {
		return ViewNameConstant.NEWS;
	}

	@GetMapping(URLConstant.URL_DETAIL)
	public String detail() {
		return ViewNameConstant.DETAIL;
	}

	@GetMapping(URLConstant.URL_ABOUT)
	public String about() {
		return ViewNameConstant.ABOUT;
	}

	@GetMapping(URLConstant.URL_CONTACT)
	public String contact() {
		return ViewNameConstant.CONTACT;
	}

}
