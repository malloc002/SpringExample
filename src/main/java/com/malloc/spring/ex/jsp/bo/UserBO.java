package com.malloc.spring.ex.jsp.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malloc.spring.ex.jsp.dao.UserDAO;
import com.malloc.spring.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;

	//이름, 생년월일, 이메일, 자기소개 저장
	public int addUser(String name, String birthday, String email, String introduce) {
		
		return userDAO.insertUser(name, birthday, email, introduce);
	}
	
	public User getLastUser() {
		
		return userDAO.selectLastUser();
	}
	
	public int addUserbyObject(User user) {
		return userDAO.insertUserByObject(user);
	}
	
	public List<User> getUserList() {
		return userDAO.selectUserList();
	}
}
