package com.restsvc.RestSvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.restsvc.RestSvc.model.User;

public class UserDaoImpl implements UserDao{



	@Override
	public List<User> getAll() {
		List<User>user = new ArrayList<User>();
		user.add(new User("mayur","desale"));
		user.add(new User("shubham","lokhande"));
		user.add(new User("vinay","hinukale"));
		return user;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
