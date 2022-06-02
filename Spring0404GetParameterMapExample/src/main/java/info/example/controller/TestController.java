package info.example.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import info.example.beans.DataBean1;
import info.example.beans.DataBean2;

@Controller
public class TestController {
	
	
	@GetMapping("/test1")
	//DataBean에서 정의한 변수 : 값을 map 자료형으로 불러온다. List도 배열을 대신하여 사용.
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.printf("data1: %s\n", data1);
		System.out.printf("data2: %s\n", data2);
		System.out.printf("data33: %s\n", data33);
		
		for(String str : data3) {
			System.out.printf("str: %s\n",str);
		}
		
		
		
		return "result";
	}
	
	
	
	
	@GetMapping("/test2")
	//DataBean을 통한 DTO DAO 방식 데이터 주입 
	//                 (@ModelAttribute DataBean1 bean1, @ModelAttribute DataBean2 bean2)
	public String test2(DataBean1 bean1, DataBean2 bean2) {
			
		System.out.printf("data1: %d\n",bean1.getData1());
		System.out.printf("data2: %d\n",bean1.getData2());
		
		for(int a : bean1.getData3()) {
			System.out.printf("data3: %d\n",a);
		}
		
		System.out.printf("data1: %d\n",bean2.getData1());
		System.out.printf("data2: %d\n",bean2.getData2());
		
		return "result";
	}
}
