package com.restsvc.RestSvc.service;

import java.util.List;

import com.restsvc.RestSvc.dao.UserDao;
import com.restsvc.RestSvc.dao.UserDaoImpl;
import com.restsvc.RestSvc.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public int createuser(User user) {
		
		UserDao uDao = new UserDaoImpl();
		return uDao.insertUser(user);
		
	}

	@Override
	public List<User> getAll() {
		
		UserDao uDao = new UserDaoImpl();
		return uDao.getAll();
	}

}
