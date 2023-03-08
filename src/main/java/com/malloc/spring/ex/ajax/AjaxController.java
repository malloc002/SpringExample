package com.malloc.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	//사람정보: 이름, 나이 정보를 json으로  response에 담는 기능
	@GetMapping("/ajax/request")
	@ResponseBody
	public Map<String, String> restRequest() {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "김인규");
		map.put("age", "28");
		
		return map;
	}
	
	@GetMapping("/ajax/test")
	public String ajaxPage() {
		return "ajax/ajax";
	}
}
