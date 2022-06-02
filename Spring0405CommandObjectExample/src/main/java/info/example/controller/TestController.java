package info.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean;


@Controller
public class TestController {
	
	
	@PostMapping("/test1")
	// public String test1(@ModelAttribute DataBean bean) {
	public String test1(DataBean bean) {
		return "test1";
	}
	
	@PostMapping("/test2")
	//@ModelAttribute(“지정이름”)방식으로 사용가능
	public String test2(@ModelAttribute("testData") DataBean bean) {
		return "test2";
	}
}
