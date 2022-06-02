package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1_get() {
		return "test1";
	}
	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public String test1_post() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2_get(){
		return "test2";
	}
	@PostMapping("/test3")
	public String test3_post() {
		return "test3";
	}
	
	@RequestMapping(value = "/test4", method = { RequestMethod.GET, RequestMethod.POST })
	public String test4_both() {
		return "test4";
	}
	
}
