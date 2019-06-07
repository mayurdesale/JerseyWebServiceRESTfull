package com.restsvc.RestSvc.dao;

import java.util.List;

import com.restsvc.RestSvc.model.User;

public interface UserDao {
	
	public int insertUser(User user);
	public List<User> getAll();

}
