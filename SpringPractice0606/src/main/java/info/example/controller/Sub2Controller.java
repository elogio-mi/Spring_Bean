package info.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sub2")
public class Sub2Controller {
	
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String sub2test1() {
		return "sub2/test1";
	}
	
}
