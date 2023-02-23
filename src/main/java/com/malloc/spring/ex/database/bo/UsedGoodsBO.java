package com.malloc.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malloc.spring.ex.database.dao.UsedGoodsDAO;
import com.malloc.spring.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired //스프링 통해서 객체 생성
	private UsedGoodsDAO usedGoodsDAO;

	//used_goods 모든 데이터 조회 리턴 메소드
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList =  usedGoodsDAO.selectUsedGoodsList();
		
		//데이터 가공 (할거면 하고, 안할거면 바로 return)
		return usedGoodsList;
	}
}
