package com.restsvc.RestSvc.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.restsvc.RestSvc.model.User;
import com.restsvc.RestSvc.service.UserService;
import com.restsvc.RestSvc.service.UserServiceImpl;

@Path(value="/user")
public class Control {
	
	@POST
	@Path(value="/add")
	public String insert(@FormParam("fname") String fname, @FormParam("lname") String lname) {
		
		UserService svc = new UserServiceImpl();
		User user = new User(fname,lname);
		svc.createuser(user);
		return "Success <a href='/all'>Show All</a>";
	}
	
	@GET
	@Path(value="/all")
	public List<User> fetchAll(){
		UserService svc = new UserServiceImpl();
		List<User> pList = svc.getAll();
		return pList;
		
	}

}
