package com.malloc.spring.ex.jstl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLController {

	@GetMapping("/ex01")
	public String ex01() {
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		//과일 이름 리스트
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("바나나");
		
		model.addAttribute("fruitList", fruitList);
		
		//List<Map>
		//사용자 정보 map(이름, 나이, 취미)
		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> user = new HashMap<>();
		user.put("name", "김인규");
		user.put("age", 28);
		user.put("hobby", "댄스");
		userList.add(user);
		
		user= new HashMap<>();
		user.put("name", "김바다");
		user.put("age", 5);
		user.put("hobby", "사냥");
		userList.add(user);
		
		model.addAttribute("userList", userList);
		
		
		return "jstl/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date now = new Date();
		
		model.addAttribute("now", now);
		
		String dateString = "2023/03/03 12:11:10";
		model.addAttribute("dateString", dateString);
		
		return "jstl/ex03";
	}
}
