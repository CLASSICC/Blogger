package com.df.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.df.BaseTest;
import com.df.dao.IUserDao;
import com.df.domain.User;

public class UserSericeTest extends BaseTest {
	@Autowired
	IUserService iUserService;
	IUserDao iUserDao;

	@Test
	public void testUser() {

		
		  User user = new User(); user.setId(1L); User iUser =
		  iUserService.getUserById(user); assertNotNull(iUser);
		  System.out.println("iuser==========="+iUser);
		 
	}

}
