package com.malloc.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {

	@RequestMapping("/lifecycle/ex01/1")
	@ResponseBody
	public String stringResponse() {
		return "예제 1번 문자열을 담은 Response";
	}
	
	
	//맵을 리턴하는 메소드
	@RequestMapping("/lifecycle/ex01/2")
	@ResponseBody
	public Map<String, Integer> mapResponse(){
		//"apple": 1500
		
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 3000);
		fruitMap.put("orange", 1000);
		
		return fruitMap;
		
	}
	
}
