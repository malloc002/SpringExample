package com.malloc.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.malloc.spring.ex.database.bo.UsedGoodsBO;
import com.malloc.spring.ex.database.model.UsedGoods;

@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@ResponseBody
	@RequestMapping("/database/ex01")
	public List<UsedGoods> ex01() {
		
		//used-goods 목록 가져오기
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		
		return usedGoodsList;
	}
}
