package com.TuneHub.main.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.TuneHub.main.entity.Users;
import com.TuneHub.main.repositories.UsersRepository;

public class UsersServicesImplementation implements UsersServices{
	@Autowired
	UsersRepository repo;
	@Override
	public String addUsers(Users user) {
		repo.save(user);
		return "user added";
	}

}
