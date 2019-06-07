package com.restsvc.RestSvc.service;

import java.util.List;

import com.restsvc.RestSvc.model.User;

public interface UserService {
	
	public int createuser(User user);
	public List<User> getAll();

}
