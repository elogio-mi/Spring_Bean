package info.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean;


@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		
		bean.setId(0);
		bean.setName("홍길");
		bean.setPw("12435");
		bean.setAddress_1("10532");
		bean.setAddress_2("906608");
		
		
		return "test1";
	}
	
	
	@GetMapping("/test2")
	public String test2(@ModelAttribute ("testBean") DataBean bean) {
		
		bean.setId(1);
		bean.setName("홍길동동이");
		bean.setPw("12435");
		bean.setAddress_1("10532");
		bean.setAddress_2("906608");
		
		return "test2";
	}
	
	@PostMapping("/result")
	//public String results(@ModelAttribute("empBean") DataBean bean) {
	public String result(DataBean bean) {
		
		return "result";
	}
	
	
}

