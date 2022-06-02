package info.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	//HttpServletRequest 객체에서 파라미터값을 추출하기 위해 사용.
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("data3: " + str);
		}
		
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("data3: " + str);
		}
		
		return "result";
	}
	
	@GetMapping("/test3")
	//WebRequest - HttpServletRequest와 비슷한 확장형, servlet API에 종속적이지 않다.
	public String test3(WebRequest request) {
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		for(String str : data3) {
			System.out.println("data3: " + str);
		}
		
		return "result";
	}
	
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	//@PathVariable  - 데이터가 요청주소에 있을 때 값을 주입받을 수 있는 어노테이션. 
	//http://localhost:8080/Spring0403GetParameterObjectExample/test4/100/200/300/
	public String test4(@PathVariable int data1,
						@PathVariable int data2,
						@PathVariable int data3) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		
		int add = data1 + data2 + data3;
		
		System.out.println("data - add : " + add);
		
		return "result";
	}
	
	@GetMapping("/test5")
	//RequestParam 쿼리형태의 파타미터 값을 주입받을 수 있는 어노테이션이며, 
	//형 변환도 지원하며, PathVariable과 다르게 매핑 선언부에 요청주소를 설정할 필요가 없다.
	public String test5(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int [] data3) {
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		for(int a1 : data3) {
			System.out.println("data3 : " + a1);
		}
		
		return "result";
	}
	
	@GetMapping("/test6")
	//RequestParam에 value = "응답받을변수이름" -> 을 통해 변수이름을 따로 사용할 수 있다.
	public String test6(@RequestParam(value = "data1") int value1,
						@RequestParam(value = "data2") int value2,
						@RequestParam(value = "data3") int [] value3) {
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		
		for(int a2 : value3) {
			System.out.println("value3 : " + a2);
		}
		
		return "result";
	}
	
	@GetMapping("/test7")
	//RequestParam에 required를 통해 값이 주입되지 않을때 null이 주입되게 한다.
	//		    defaultValue를 통해 값이 주입되지 않을 때 기본값을 설정할 수 있다.
	public String test7(@RequestParam int data1,
						@RequestParam (required = false) String data2,
						@RequestParam (defaultValue = "0") int data3) {
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);
		
		
		return "result";
	}
}
