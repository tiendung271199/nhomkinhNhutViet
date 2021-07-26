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

<<<<<<< HEAD
=======
	@GetMapping(URLConstant.URL_NEWS)
	public String news() {
		return ViewNameConstant.NEWS;
	}

	@GetMapping(URLConstant.URL_DETAIL)
	public String detail() {
		return ViewNameConstant.DETAIL;
	}

>>>>>>> 0a3777e43ec731f00095092d6b7ee930eb3102cf
	@GetMapping(URLConstant.URL_ABOUT)
	public String about() {
		return ViewNameConstant.ABOUT;
	}

<<<<<<< HEAD
=======
	@GetMapping(URLConstant.URL_CONTACT)
	public String contact() {
		return ViewNameConstant.CONTACT;
	}

>>>>>>> 0a3777e43ec731f00095092d6b7ee930eb3102cf
}
