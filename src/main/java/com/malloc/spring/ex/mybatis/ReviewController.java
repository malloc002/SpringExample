package com.malloc.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.malloc.spring.ex.mybatis.bo.ReviewBO;
import com.malloc.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	//전달받은 id와 일치하는 데이터 조회
	//그 결과를 json으로 response에 담기
	@RequestMapping("/ex01")
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
	
	//새로운 리뷰를 등록하는 기능
	@RequestMapping("/ex02")
	@ResponseBody
	public String addReview() {
		//4, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었어요"
		
//		int count = reviewBO.addReview(4, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었어요");
		
		Review review = new Review();
		review.setStoreId(2);
		review.setUserName("김혜민");
		review.setMenu("뿌링클");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다!");
		
		int count = reviewBO.addReviewByObject(review);
		
		//실행결과: 1
		return "실행결과: " + count;
	}
}
