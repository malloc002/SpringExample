package com.malloc.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.malloc.spring.ex.mybatis.bo.ReviewBO;
import com.malloc.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	//전달받은 id와 일치하는 데이터 조회
	//그 결과를 json으로 response에 담기
	@RequestMapping("/mybatis/ex01")
	@ResponseBody
	public Review review(
			@RequestParam("id") int id //-> id 없으면 안돌아감
//			@RequestParam(value="id", required=false) int id //->required가 false가 되면 필수가 아님
//			@RequestParam(value="id", defaultValue="3") int id //-> 값이 없으면 defaultValue 있으면 그 값으로 됨
			) {
		
//		int id = Integer.parseInt(request.getParameter("id"));
		Review review = reviewBO.getReview(id);
		
		return review;
		
	}
}
