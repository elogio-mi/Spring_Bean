package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		return "test1";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		return "test2";
	}
	@RequestMapping(value = "/sub1/test3", method = RequestMethod.GET)
	public String test3() {
		return "sub1/test3";
	}
	@RequestMapping(value = "/sub1/test4", method = RequestMethod.GET)
	public String test4() {
		return "sub1/test4";
	}
	@RequestMapping(value = "/sub2/test5", method = RequestMethod.GET)
	public String test5() {
		return "sub2/test5";
	}
	@RequestMapping(value = "/sub2/test6", method = RequestMethod.GET)
	public String test6() {
		return "sub2/test6";
	}
}

