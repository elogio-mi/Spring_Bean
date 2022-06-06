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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean;


@Controller
public class TestController {
	
	@RequestMapping(value="/RMG", method = RequestMethod.GET)
	public String RMG_Test() {
		return "result";
	}
	@RequestMapping(value="/RMP", method = RequestMethod.POST)
	public String RMP_Test() {
		return "result";
	}
	
	@RequestMapping(value="/RMB", method = 
								{RequestMethod.GET, RequestMethod.POST})
	public String RMB_Test() {
		return "result";
	}
	
	@GetMapping("/GMT")
	public String GMT() {
		return "result";
	}
	@PostMapping("/PMT")
	public String PMT() {
		return "result";
	}
	
	@GetMapping("/GMTH")
	public String GMTH(HttpServletRequest req) {
		String data1 = req.getParameter("data1");
		
		System.out.println("data1: " + data1);
		return "result";
	}
	@PostMapping("/PMTH")
	public String PMTH(HttpServletRequest req) {
		String data1 = req.getParameter("data1");
		
		System.out.println("data1: " + data1);
		return "result";
	}
	
	@GetMapping("/GMTW")
	public String GMTW(WebRequest req) {
		String data1 = req.getParameter("data1");
		System.out.println("data1: " + data1);
		return "result";
	}
	@PostMapping("/PMTW")
	public String PMTW(WebRequest req) {
		String data1 = req.getParameter("data1");
		String [] data2 = req.getParameterValues("data2");
		
		System.out.println("data1: " + data1);
		
		for(String str : data2) {
			System.out.println("data2 : " +str);
		}
		return "result";
	}
	
	@GetMapping("/GMTP/{data1}/{data2}")
	public String GMTP(@PathVariable int data1,
					   @PathVariable int data2) {
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		return "result";
	}
	@PostMapping("/PMTP/{data1}/{data2}")
	public String PMTP(@PathVariable int data1,
					   @PathVariable int data2) {
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		return "result";
	}
	
	@GetMapping("/GMTR")
	public String GMTR(@RequestParam int data1,
					   @RequestParam int [] data2) {
		
		System.out.println("data1 : " + data1);
		
		for(int a : data2) {
			System.out.println("data2 : " + a);
		}
		
		return "result";
	}
	@PostMapping("/PMTR")
	public String PMTR(@RequestParam int data1,
					   @RequestParam int [] data2) {
		
		System.out.println("data1 : " + data1);
		
		for(int a : data2) {
			System.out.println("data2 : " + a);
		}
		
		return "result";
	}
	@GetMapping("/GMTRO")
	public String GMTRO(@RequestParam int data1,
					   @RequestParam int [] data2,
					   @RequestParam (value = "value3") int data3,
					   @RequestParam (required = false) String data4,
					   @RequestParam (defaultValue = "0") int data5) {
		
		System.out.println("data1 :" + data1);
		
		for(int a : data2) {
			System.out.println("data2 : " + a);
		}
		System.out.println("data3 :" + data3);
		System.out.println("data4 :" + data4);
		System.out.println("data5 :" + data5);
		return "result";
	}
	
	
	@PostMapping("/PMTRO")
	public String PMTRO(@RequestParam int data1,
					   @RequestParam int [] data2,
					   @RequestParam (value = "value3") int data3,
					   @RequestParam (required = false) String data4,
					   @RequestParam (defaultValue = "0") int data5) {
		
		System.out.println("data1 :" + data1);
		
		for(int a : data2) {
			System.out.println("data2 : " + a);
		}
		
		System.out.println("data3 :" + data3);
		System.out.println("data4 :" + data4);
		System.out.println("data5 :" + data5);
		return "result";
	}
	
	@GetMapping("/GMTRDS")
	public String GMTRDS(@RequestParam Map<String, String> map,
						 @RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("list : " + str);
		}
		
		return "result";
	}
	@PostMapping("/PMTRDS")
	public String PMTRDS(@RequestParam Map<String, String> map,
						 @RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("list : " + str);
		}
		
		return "result";
	}
	
	@GetMapping("/GMTRM")
	public String GMTRM(@ModelAttribute DataBean db) {
		
		System.out.println("id : " + db.getId());
		System.out.println("name : " + db.getName());
		
		return "result";
	}
	@PostMapping("/PMTRM")
	public String PMTRM(@ModelAttribute DataBean db) {
		
		System.out.println("id : " + db.getId());
		System.out.println("name : " + db.getName());
		
		return "result";
	}
	
	@GetMapping("/GMTRMO")
	public String GMTRMO(@ModelAttribute DataBean db) {
		return "ObjectOutput";
	}
	@PostMapping("/PMTRMO")
	public String PMTRMO(@ModelAttribute("testData") DataBean db) {
		return "ObjectOutput";
	}
	
}

